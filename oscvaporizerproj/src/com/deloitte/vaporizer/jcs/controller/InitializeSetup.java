package com.deloitte.vaporizer.jcs.controller;



import com.sun.xml.ws.api.addressing.AddressingVersion;
import com.sun.xml.ws.api.addressing.WSEndpointReference;
import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import salesaccount.SalesAccountsService;
import salesaccount.SalesAccountsService_Service;

import salesaccount.types.FindControl;
import salesaccount.types.FindCriteria;
import salesaccount.types.ObjectFactory;
import salesaccount.types.SalesAccount;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class InitializeSetup {
    @WebServiceRef
    
      private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    /*Service variable and service type needs to be modified based on service*/
      private static SalesAccountsService_Service salesAccountsService_Service;
    /*Service variable and service type needs to be modified based on service*/
      private static SalesAccountsService salesAccountsService;
      private static WSBindingProvider wsbp;
      
    /*Initialize the service stub*/
      public static SalesAccountsService initializeService (String location, String user, String pass) {
           try{
              /*Setting security policy. Security policy would be same for almost all sales cloud services*/
          SecurityPoliciesFeature securityFeatures =
              new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
          try {
              /*Location is the wsdl URL of the service. Qname is to be modified based on the service we use. It is found in the web proxy or also can be found as the part of exception*/
              salesAccountsService_Service =
                      new SalesAccountsService_Service(new URL(location),
                                                     new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/",
                                                               "SalesAccountsService"));
          } catch (MalformedURLException murle) {
              murle.printStackTrace();
          }
              /*Setting SoapHttpPort. should be modified based on service used. Always need to pass security features*/
          salesAccountsService = salesAccountsService_Service.getSalesAccountsServiceSoapHttpPort(securityFeatures);
              /*Service variable needs to be modified based on service*/
          wsbp = (WSBindingProvider)salesAccountsService;
          wsbp.getRequestContext().put(WSBindingProvider.USERNAME_PROPERTY,user);
          wsbp.getRequestContext().put(WSBindingProvider.PASSWORD_PROPERTY,pass);
          WSEndpointReference replyTo =new WSEndpointReference(location, WS_ADDR_VER);
          String uuid = "uuid:" + UUID.randomUUID();
          setCredentials (user, pass);
          }
          catch(Exception e) {
              e.printStackTrace();
          }
          return salesAccountsService;
      }
      
      
    /*Set User credentials to the webservice*/
      public static void setCredentials(String user, String pass) {
          wsbp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, user);
          wsbp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, pass);
      } 
      
      public static void main(String args[]) {
          try{
              FindControl findControl=new FindControl();
              FindCriteria findCriteria = new FindCriteria(); 
              findControl.setRetrieveAllTranslations(true);
              findCriteria.setFetchSize(100);
              InitializeSetup initializeSetup = new InitializeSetup();
              /*Initialize the service by passing the entire wsdl URL of the service along with the username and password. Instead of hard coding, we can store them in JCS DB and retrieve them for connecting*/
              //SalesAccountsService salesAccountsServiceObj = initializeSetup.initializeService("https://adc-fap0915-crm.oracledemos.com/crmCommonSalesParties/SalesAccountsService?WSDL", "bala.gupta", "xmJ58675");
              SalesAccountsService salesAccountsServiceObj = initializeSetup.initializeService("https://adc-fap0915-crm.oracledemos.com/crmCommonSalesParties/SalesAccountsService?WSDL", "bala.gupta", "CWj97587");
              //initializeSetup.createSalesAccount(salesAccountsServiceObj);
              initializeSetup.getAccountList(salesAccountsServiceObj);
              
              //initializeSetup.createSalesAccount(salesPartyServiceObj);
          }
          catch(Exception e) {
              e.printStackTrace();
          }
      }
      
      public void createSalesAccount( SalesAccountsService salesAccountsServiceObj) {
          try{
              /* Always use object factory to create JaxB elements*/
              ObjectFactory objectFactory = new ObjectFactory();
              SalesAccount salesAccountObj = new SalesAccount();
              //salesAccountObj.setPartyName("Nimanshu");
              //salesAccountObj.setPartyNumber("123");
              salesAccountObj.setPartyId(new Long("1021"));
              salesAccountObj.setSalesAccountName(objectFactory.createSalesAccountSalesAccountName("Nimanshu"));
              salesAccountObj.setAccountDirectorId(objectFactory.createSalesAccountAccountDirectorId(0L));
             /*Create a SalesAccount with all the avlues and pass it to the method createSalesAccount*/
              salesAccountsServiceObj.createSalesAccount(salesAccountObj);
          }
          catch(Exception e) {
              e.printStackTrace();
          }
      }
      
    public void getAccountList( SalesAccountsService salesAccountsServiceObj) {
        try{
            
            FindControl findControl=new FindControl();
            FindCriteria findCriteria = new FindCriteria(); 
            /*Add all possible criteria and control to ensure you get the right results*/
            findControl.setRetrieveAllTranslations(true);
            findCriteria.setFetchSize(100);
            List<SalesAccount> salesAccountList = salesAccountsServiceObj.findSalesAccount(findCriteria, findControl);
            /*Loop the list and get the values that you need*/
            for(SalesAccount salesAccount :salesAccountList){
                if(null!=salesAccount.getOrganizationParty() && salesAccount.getOrganizationParty().size()>0)
                    System.out.println(salesAccount.getOrganizationParty().get(0).getPartyName());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
