package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice;

import com.sun.xml.ws.api.addressing.AddressingVersion;
import com.sun.xml.ws.api.addressing.WSEndpointReference;
import com.sun.xml.ws.developer.WSBindingProvider;
import com.sun.xml.ws.message.StringHeader;

import java.util.UUID;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class SalesPartyServiceSoapHttpPortClient
{
  @WebServiceRef
  private static SalesPartyService_Service salesPartyService_Service;

  private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;

  public static void main(String [] args)
  {
    salesPartyService_Service = new SalesPartyService_Service();
    SalesPartyService salesPartyService = salesPartyService_Service.getSalesPartyServiceSoapHttpPort();
    // Get the request context to set the outgoing addressing properties
    WSBindingProvider wsbp = (WSBindingProvider)salesPartyService;
    WSEndpointReference replyTo =
      new WSEndpointReference("http://<replace with the URL of the callback service>", WS_ADDR_VER);
    String uuid = "uuid:" + UUID.randomUUID();

    wsbp.setOutboundHeaders( new StringHeader(WS_ADDR_VER.messageIDTag, uuid), replyTo.createHeader(WS_ADDR_VER.replyToTag));

    // Add your code to call the desired methods.
  }
}
