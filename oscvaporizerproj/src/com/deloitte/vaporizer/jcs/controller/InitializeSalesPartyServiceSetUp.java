package com.deloitte.vaporizer.jcs.controller;

import com.oracle.xmlns.adf.svc.types.FindControl;

import com.oracle.xmlns.adf.svc.types.FindCriteria;

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

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.*;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.CreateSalesParty;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.CreateSalesPartyResponse;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesParty;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.ObjectFactory;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.FindSalesParty;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.FindSalesPartyResponse;
import com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice.OrganizationParty;
import com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice.OrganizationProfile;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.PartySite;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.PartySiteUse;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.PartyUsageAssignment;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class InitializeSalesPartyServiceSetUp {
    @WebServiceRef
    
      private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
      private static WSBindingProvider wsbp;
      
    /*Service variable and service type needs to be modified based on service*/
      private static SalesPartyService_Service salesPartyService_Service;
    /*Service variable and service type needs to be modified based on service*/
      private static SalesPartyService salesPartyService;
      
      
    /*Initialize the service stub*/
      public static SalesPartyService initializeSalesPartyService (String location, String user, String pass) {
           try{
              /*Setting security policy. Security policy would be same for almost all sales cloud services*/
          SecurityPoliciesFeature securityFeatures =
              new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
          try {
              /*Location is the wsdl URL of the service. Qname is to be modified based on the service we use. It is found in the web proxy or also can be found as the part of exception*/
              salesPartyService_Service =
                      new SalesPartyService_Service(new URL(location),
                                                     new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/",
                                                               "SalesPartyService"));
              
          } catch (MalformedURLException murle) {
              murle.printStackTrace();
          }
              /*Setting SoapHttpPort. should be modified based on service used. Always need to pass security features*/
          salesPartyService = salesPartyService_Service.getSalesPartyServiceSoapHttpPort(securityFeatures);
              /*Service variable needs to be modified based on service*/
          wsbp = (WSBindingProvider)salesPartyService;
          wsbp.getRequestContext().put(WSBindingProvider.USERNAME_PROPERTY,user);
          wsbp.getRequestContext().put(WSBindingProvider.PASSWORD_PROPERTY,pass);
          WSEndpointReference replyTo =new WSEndpointReference(location, WS_ADDR_VER);
          String uuid = "uuid:" + UUID.randomUUID();
          setCredentials (user, pass);
          }
          catch(Exception e) {
              e.printStackTrace();
          }
          return salesPartyService;
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
              findCriteria.setFetchSize(1);
              InitializeSalesPartyServiceSetUp initializeSetup = new InitializeSalesPartyServiceSetUp();
              SalesPartyService salesPartyServiceObj = initializeSetup.initializeSalesPartyService("https://adc-fap0915-crm.oracledemos.com/crmCommonSalesParties/SalesPartyService?WSDL", "bala.gupta", "CWj97587");
              initializeSetup.createSalesParty(salesPartyServiceObj);
          }
          catch(Exception e) {
              e.printStackTrace();
          }
      }

    
    public void getSalesPartyAccountList( SalesPartyService salesPartyServiceObj) {
        try{
            
            FindControl findControl=new FindControl();
            FindCriteria findCriteria = new FindCriteria(); 
            /*Add all possible criteria and control to ensure you get the right results*/
            findControl.setRetrieveAllTranslations(true);
            findCriteria.setFetchSize(1);
            FindSalesParty fsp = new FindSalesParty();
            fsp.setFindControl(findControl);
            fsp.setFindCriteria(findCriteria);
            FindSalesPartyResponse findSalesPartyResp = salesPartyServiceObj.findSalesParty(fsp);
            /*Loop the list and get the values that you need*/
            for(SalesParty salesParty :findSalesPartyResp.getResult()){
                if(null!=salesParty.getOrganizationParty() && salesParty.getOrganizationParty().size()>0)
                    System.out.println(salesParty.getOrganizationParty().get(0).getPartyName());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createSalesParty( SalesPartyService salesPartyServiceObj) {
        try{
            
            com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.ObjectFactory objfac = new com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.ObjectFactory();
            com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice.ObjectFactory objfac1 = new com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice.ObjectFactory();
            com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.ObjectFactory objfac2 = new com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.ObjectFactory();
            SalesParty sp = new SalesParty();
            sp.setPartyName(objfac.createSalesPartyPartyName("Nimanshu Test 5"));
            sp.setObjectVersionNumber(1);
            sp.setPartyNumber("1");
            sp.setPartyType("ORGANIZATION");
            sp.setStatus("A");
            sp.setAttachmentEntityName(objfac.createSalesPartyAttachmentEntityName("ZCA_SALES_PARTY"));
            sp.setPartyUniqueName(objfac.createSalesPartyPartyUniqueName("Nimanshu Test 5"));
            
            
            OrganizationParty op = new OrganizationParty();
            op.setCreatedByModule(objfac1.createOrganizationPartyCreatedByModule("XLE_CREATE_LE"));
            
            
            OrganizationProfile oprof = new OrganizationProfile();
            oprof.setOrganizationName("Nimanshu Test 5");
            oprof.setCreatedByModule("XLE_CREATE_LE");
            oprof.setOrigSystemReference(objfac1.createOrganizationProfileOrigSystemReference("300000046973983"));
            
            
            PartySite ps = new PartySite();
            ps.setLocationId(new Long("300000046973967"));
            ps.setCreatedByModule(objfac2.createPartySiteCreatedByModule("XLE_CREATE_LE"));
            
            
            PartySiteUse psu = new PartySiteUse();
            psu.setSiteUseType(objfac2.createPartySiteUseSiteUseType("SELL_TO"));
            psu.setCreatedByModule(objfac2.createPartySiteUseCreatedByModule("XLE_CREATE_LE"));
            
            
            PartyUsageAssignment pua = new PartyUsageAssignment();
            pua.setPartyUsageCode("SALES_ACCOUNT");
            pua.setStatusFlag(true);
            pua.setCreatedByModule("XLE_CREATE_LE");
            
            ps.getPartySiteUse().add(psu);
            op.getOrganizationProfile().add(oprof);
            op.getPartySite().add(ps);
            op.getPartyUsageAssignment().add(pua);
            sp.getOrganizationParty().add(op);
            
            CreateSalesParty csp = new CreateSalesParty();
            csp.setSalesParty(sp);
            CreateSalesPartyResponse cspr = salesPartyServiceObj.createSalesParty(csp);
            System.out.println(cspr.getResult().getPartyId());
            System.out.println(cspr.getResult().getPartyName());
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
  
}
