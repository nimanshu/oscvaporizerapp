
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SalesAccount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesAccount");
    private final static QName _SalesParty_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesParty");
    private final static QName _SalesAccountContactPoints_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesAccountContactPoints");
    private final static QName _SalesAccountResourceAccess_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesAccountResourceAccess");
    private final static QName _SalesAccountContacts_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesAccountContacts");
    private final static QName _SalesAccountResource_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesAccountResource");
    private final static QName _SalesAccountTerritory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "salesAccountTerritory");
    private final static QName _MySalesAccount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "mySalesAccount");
    private final static QName _SalesAccountTerritoryContractStateC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ContractState_c");
    private final static QName _SalesAccountTerritoryStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "StartDateActive");
    private final static QName _SalesAccountTerritoryEnrollmentC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Enrollment_c");
    private final static QName _SalesAccountTerritoryEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "EndDateActive");
    private final static QName _SalesAccountTerritoryUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "UserLastUpdateDate");
    private final static QName _SalesAccountTerritoryTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "TypeCode");
    private final static QName _SalesAccountTerritoryAccountStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AccountStatus_c");
    private final static QName _SalesAccountTerritoryLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "LastUpdateLogin");
    private final static QName _SalesAccountContactsCpdrfVerPillar_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CpdrfVerPillar");
    private final static QName _SalesAccountContactsCpdrfLastUpd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CpdrfLastUpd");
    private final static QName _SalesAccountContactsBuyingRoleCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "BuyingRoleCd");
    private final static QName _SalesAccountContactsAffinityLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AffinityLvlCd");
    private final static QName _SalesAccountContactsPersonPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PersonPartyId");
    private final static QName _SalesAccountContactsInfluenceLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "InfluenceLvlCd");
    private final static QName _SalesAccountContactsComments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Comments");
    private final static QName _SalesAccountContactsCpdrfVerSor_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CpdrfVerSor");
    private final static QName _MySalesAccountAssgnExceptionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AssgnExceptionFlag");
    private final static QName _MySalesAccountNamedAccountFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "NamedAccountFlag");
    private final static QName _MySalesAccountExistingFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ExistingFlag");
    private final static QName _MySalesAccountSalesAccountType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SalesAccountType");
    private final static QName _MySalesAccountLastAssignedDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "LastAssignedDate");
    private final static QName _MySalesAccountExistingFlgLastUpdDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ExistingFlgLastUpdDate");
    private final static QName _MySalesAccountAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeCategory");
    private final static QName _SalesAccountResourceAttribute10_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute10");
    private final static QName _SalesAccountResourceAttribute14_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute14");
    private final static QName _SalesAccountResourceAttribute13_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute13");
    private final static QName _SalesAccountResourceOrganizationId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "OrganizationId");
    private final static QName _SalesAccountResourceAttribute12_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute12");
    private final static QName _SalesAccountResourceAttribute11_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute11");
    private final static QName _SalesAccountResourceOwnerResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "OwnerResourceId");
    private final static QName _SalesAccountResourceOrgTreeStructureCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "OrgTreeStructureCode");
    private final static QName _SalesAccountResourceAttributeNumber3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeNumber3");
    private final static QName _SalesAccountResourceAttributeNumber4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeNumber4");
    private final static QName _SalesAccountResourceAttributeNumber1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeNumber1");
    private final static QName _SalesAccountResourceAttributeNumber2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeNumber2");
    private final static QName _SalesAccountResourceAttributeNumber5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeNumber5");
    private final static QName _SalesAccountResourceName1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Name1");
    private final static QName _SalesAccountResourceOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "OrgTreeCode");
    private final static QName _SalesAccountResourceRoleName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "RoleName");
    private final static QName _SalesAccountResourceAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute4");
    private final static QName _SalesAccountResourceAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute5");
    private final static QName _SalesAccountResourceAttribute6_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute6");
    private final static QName _SalesAccountResourceAttribute7_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute7");
    private final static QName _SalesAccountResourceAttribute8_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute8");
    private final static QName _SalesAccountResourceAttribute9_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute9");
    private final static QName _SalesAccountResourceResourcePrimaryOrgName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ResourcePrimaryOrgName");
    private final static QName _SalesAccountResourceFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "FormattedPhoneNumber");
    private final static QName _SalesAccountResourcePartyName1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PartyName1");
    private final static QName _SalesAccountResourceReportsToFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ReportsToFlag");
    private final static QName _SalesAccountResourceAssignmentTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AssignmentTypeCode");
    private final static QName _SalesAccountResourceResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ResourceId");
    private final static QName _SalesAccountResourceAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute1");
    private final static QName _SalesAccountResourceAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute2");
    private final static QName _SalesAccountResourceAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute3");
    private final static QName _SalesAccountResourceManagerPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ManagerPartyId");
    private final static QName _SalesAccountResourceResourcePrimaryOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ResourcePrimaryOrgId");
    private final static QName _SalesAccountResourceAttribute15_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Attribute15");
    private final static QName _SalesAccountResourceAttributeDate1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeDate1");
    private final static QName _SalesAccountResourceAttributeDate3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeDate3");
    private final static QName _SalesAccountResourceAttributeDate2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeDate2");
    private final static QName _SalesAccountResourceAttributeDate5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeDate5");
    private final static QName _SalesAccountResourceTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "TerritoryVersionId");
    private final static QName _SalesAccountResourceAttributeDate4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttributeDate4");
    private final static QName _SalesAccountResourceMemberFunctionCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "MemberFunctionCode");
    private final static QName _SalesAccountResourceEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "EmailAddress");
    private final static QName _SalesAccountResourceResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ResourceOrgId");
    private final static QName _SalesAccountResourcePrTerritoryId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PrTerritoryId");
    private final static QName _SalesAccountResourceLockAssignmentBooleanFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "LockAssignmentBooleanFlag");
    private final static QName _SalesPartyPartyName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PartyName");
    private final static QName _SalesPartyPartyUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PartyUniqueName");
    private final static QName _SalesPartyAttachmentEntityName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AttachmentEntityName");
    private final static QName _SalesAccountCodeAssignmentId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CodeAssignmentId");
    private final static QName _SalesAccountAccountDirectorId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "AccountDirectorId");
    private final static QName _SalesAccountCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CurrencyCode");
    private final static QName _SalesAccountSalesAccountNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SalesAccountNameSuffix");
    private final static QName _SalesAccountCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CorpCurrencyCode");
    private final static QName _SalesAccountClassCategory1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ClassCategory1");
    private final static QName _SalesAccountViewApplicationId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ViewApplicationId");
    private final static QName _SalesAccountStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Status");
    private final static QName _SalesAccountPartyUniqueName1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PartyUniqueName1");
    private final static QName _SalesAccountClassCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ClassCode");
    private final static QName _SalesAccountRating_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Rating");
    private final static QName _SalesAccountRouteC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Route_c");
    private final static QName _SalesAccountUpdateRating_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "UpdateRating");
    private final static QName _SalesAccountClassCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "ClassCategory");
    private final static QName _SalesAccountDeleteCustomerKey_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "DeleteCustomerKey");
    private final static QName _SalesAccountPrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "PrimaryFlag");
    private final static QName _SalesAccountSalesAccountStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SalesAccountStatus");
    private final static QName _SalesAccountSalesAccountUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SalesAccountUniqueName");
    private final static QName _SalesAccountCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "CurcyConvRateType");
    private final static QName _SalesAccountSalesAccountName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SalesAccountName");
    private final static QName _SalesAccountMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "Meaning");
    private final static QName _SalesAccountSellToPartySiteId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SellToPartySiteId");
    private final static QName _SalesAccountVisitFreqC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "VisitFreq_c");
    private final static QName _SalesAccountResourceAccessSalesAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "SalesAccountId");
    private final static QName _SalesAccountResourceAccessUserGUID_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", "UserGUID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MySalesAccount }
     * 
     */
    public MySalesAccount createMySalesAccount() {
        return new MySalesAccount();
    }

    /**
     * Create an instance of {@link SalesAccountResource }
     * 
     */
    public SalesAccountResource createSalesAccountResource() {
        return new SalesAccountResource();
    }

    /**
     * Create an instance of {@link SalesAccount }
     * 
     */
    public SalesAccount createSalesAccount() {
        return new SalesAccount();
    }

    /**
     * Create an instance of {@link SalesParty }
     * 
     */
    public SalesParty createSalesParty() {
        return new SalesParty();
    }

    /**
     * Create an instance of {@link SalesAccountResourceAccess }
     * 
     */
    public SalesAccountResourceAccess createSalesAccountResourceAccess() {
        return new SalesAccountResourceAccess();
    }

    /**
     * Create an instance of {@link SalesAccountContactPoints }
     * 
     */
    public SalesAccountContactPoints createSalesAccountContactPoints() {
        return new SalesAccountContactPoints();
    }

    /**
     * Create an instance of {@link SalesAccountContacts }
     * 
     */
    public SalesAccountContacts createSalesAccountContacts() {
        return new SalesAccountContacts();
    }

    /**
     * Create an instance of {@link SalesAccountTerritory }
     * 
     */
    public SalesAccountTerritory createSalesAccountTerritory() {
        return new SalesAccountTerritory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesAccount")
    public JAXBElement<SalesAccount> createSalesAccount(SalesAccount value) {
        return new JAXBElement<SalesAccount>(_SalesAccount_QNAME, SalesAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesParty")
    public JAXBElement<SalesParty> createSalesParty(SalesParty value) {
        return new JAXBElement<SalesParty>(_SalesParty_QNAME, SalesParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAccountContactPoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesAccountContactPoints")
    public JAXBElement<SalesAccountContactPoints> createSalesAccountContactPoints(SalesAccountContactPoints value) {
        return new JAXBElement<SalesAccountContactPoints>(_SalesAccountContactPoints_QNAME, SalesAccountContactPoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAccountResourceAccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesAccountResourceAccess")
    public JAXBElement<SalesAccountResourceAccess> createSalesAccountResourceAccess(SalesAccountResourceAccess value) {
        return new JAXBElement<SalesAccountResourceAccess>(_SalesAccountResourceAccess_QNAME, SalesAccountResourceAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAccountContacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesAccountContacts")
    public JAXBElement<SalesAccountContacts> createSalesAccountContacts(SalesAccountContacts value) {
        return new JAXBElement<SalesAccountContacts>(_SalesAccountContacts_QNAME, SalesAccountContacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAccountResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesAccountResource")
    public JAXBElement<SalesAccountResource> createSalesAccountResource(SalesAccountResource value) {
        return new JAXBElement<SalesAccountResource>(_SalesAccountResource_QNAME, SalesAccountResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAccountTerritory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "salesAccountTerritory")
    public JAXBElement<SalesAccountTerritory> createSalesAccountTerritory(SalesAccountTerritory value) {
        return new JAXBElement<SalesAccountTerritory>(_SalesAccountTerritory_QNAME, SalesAccountTerritory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MySalesAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "mySalesAccount")
    public JAXBElement<MySalesAccount> createMySalesAccount(MySalesAccount value) {
        return new JAXBElement<MySalesAccount>(_MySalesAccount_QNAME, MySalesAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ContractState_c", scope = SalesAccountTerritory.class)
    public JAXBElement<String> createSalesAccountTerritoryContractStateC(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryContractStateC_QNAME, String.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "StartDateActive", scope = SalesAccountTerritory.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountTerritoryStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryStartDateActive_QNAME, XMLGregorianCalendar.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Enrollment_c", scope = SalesAccountTerritory.class)
    public JAXBElement<String> createSalesAccountTerritoryEnrollmentC(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryEnrollmentC_QNAME, String.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "EndDateActive", scope = SalesAccountTerritory.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountTerritoryEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryEndDateActive_QNAME, XMLGregorianCalendar.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = SalesAccountTerritory.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountTerritoryUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "TypeCode", scope = SalesAccountTerritory.class)
    public JAXBElement<String> createSalesAccountTerritoryTypeCode(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryTypeCode_QNAME, String.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AccountStatus_c", scope = SalesAccountTerritory.class)
    public JAXBElement<String> createSalesAccountTerritoryAccountStatusC(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryAccountStatusC_QNAME, String.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastUpdateLogin", scope = SalesAccountTerritory.class)
    public JAXBElement<String> createSalesAccountTerritoryLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryLastUpdateLogin_QNAME, String.class, SalesAccountTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerPillar", scope = SalesAccountContacts.class)
    public JAXBElement<Integer> createSalesAccountContactsCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerPillar_QNAME, Integer.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfLastUpd", scope = SalesAccountContacts.class)
    public JAXBElement<String> createSalesAccountContactsCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsCpdrfLastUpd_QNAME, String.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "BuyingRoleCd", scope = SalesAccountContacts.class)
    public JAXBElement<String> createSalesAccountContactsBuyingRoleCd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsBuyingRoleCd_QNAME, String.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AffinityLvlCd", scope = SalesAccountContacts.class)
    public JAXBElement<String> createSalesAccountContactsAffinityLvlCd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsAffinityLvlCd_QNAME, String.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PersonPartyId", scope = SalesAccountContacts.class)
    public JAXBElement<Long> createSalesAccountContactsPersonPartyId(Long value) {
        return new JAXBElement<Long>(_SalesAccountContactsPersonPartyId_QNAME, Long.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "InfluenceLvlCd", scope = SalesAccountContacts.class)
    public JAXBElement<String> createSalesAccountContactsInfluenceLvlCd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsInfluenceLvlCd_QNAME, String.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "EndDateActive", scope = SalesAccountContacts.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountContactsEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryEndDateActive_QNAME, XMLGregorianCalendar.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = SalesAccountContacts.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountContactsUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Comments", scope = SalesAccountContacts.class)
    public JAXBElement<String> createSalesAccountContactsComments(String value) {
        return new JAXBElement<String>(_SalesAccountContactsComments_QNAME, String.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerSor", scope = SalesAccountContacts.class)
    public JAXBElement<Integer> createSalesAccountContactsCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerSor_QNAME, Integer.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastUpdateLogin", scope = SalesAccountContacts.class)
    public JAXBElement<String> createSalesAccountContactsLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryLastUpdateLogin_QNAME, String.class, SalesAccountContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerPillar", scope = MySalesAccount.class)
    public JAXBElement<Integer> createMySalesAccountCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerPillar_QNAME, Integer.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfLastUpd", scope = MySalesAccount.class)
    public JAXBElement<String> createMySalesAccountCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsCpdrfLastUpd_QNAME, String.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AssgnExceptionFlag", scope = MySalesAccount.class)
    public JAXBElement<Boolean> createMySalesAccountAssgnExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountAssgnExceptionFlag_QNAME, Boolean.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "NamedAccountFlag", scope = MySalesAccount.class)
    public JAXBElement<Boolean> createMySalesAccountNamedAccountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountNamedAccountFlag_QNAME, Boolean.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ExistingFlag", scope = MySalesAccount.class)
    public JAXBElement<Boolean> createMySalesAccountExistingFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountExistingFlag_QNAME, Boolean.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountType", scope = MySalesAccount.class)
    public JAXBElement<String> createMySalesAccountSalesAccountType(String value) {
        return new JAXBElement<String>(_MySalesAccountSalesAccountType_QNAME, String.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = MySalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createMySalesAccountUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastAssignedDate", scope = MySalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createMySalesAccountLastAssignedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MySalesAccountLastAssignedDate_QNAME, XMLGregorianCalendar.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ExistingFlgLastUpdDate", scope = MySalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createMySalesAccountExistingFlgLastUpdDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MySalesAccountExistingFlgLastUpdDate_QNAME, XMLGregorianCalendar.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeCategory", scope = MySalesAccount.class)
    public JAXBElement<String> createMySalesAccountAttributeCategory(String value) {
        return new JAXBElement<String>(_MySalesAccountAttributeCategory_QNAME, String.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerSor", scope = MySalesAccount.class)
    public JAXBElement<Integer> createMySalesAccountCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerSor_QNAME, Integer.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastUpdateLogin", scope = MySalesAccount.class)
    public JAXBElement<String> createMySalesAccountLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryLastUpdateLogin_QNAME, String.class, MySalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerPillar", scope = SalesAccountContactPoints.class)
    public JAXBElement<Integer> createSalesAccountContactPointsCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerPillar_QNAME, Integer.class, SalesAccountContactPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfLastUpd", scope = SalesAccountContactPoints.class)
    public JAXBElement<String> createSalesAccountContactPointsCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsCpdrfLastUpd_QNAME, String.class, SalesAccountContactPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = SalesAccountContactPoints.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountContactPointsUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesAccountContactPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "EndDateActive", scope = SalesAccountContactPoints.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountContactPointsEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryEndDateActive_QNAME, XMLGregorianCalendar.class, SalesAccountContactPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerSor", scope = SalesAccountContactPoints.class)
    public JAXBElement<Integer> createSalesAccountContactPointsCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerSor_QNAME, Integer.class, SalesAccountContactPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastUpdateLogin", scope = SalesAccountContactPoints.class)
    public JAXBElement<String> createSalesAccountContactPointsLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryLastUpdateLogin_QNAME, String.class, SalesAccountContactPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute10", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute10(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute10_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfLastUpd", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsCpdrfLastUpd_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute14", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute14(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute14_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute13", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute13(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute13_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "OrganizationId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceOrganizationId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceOrganizationId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute12", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute12(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute12_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute11", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute11(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute11_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "OwnerResourceId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceOwnerResourceId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceOwnerResourceId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "OrgTreeStructureCode", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceOrgTreeStructureCode(String value) {
        return new JAXBElement<String>(_SalesAccountResourceOrgTreeStructureCode_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeNumber3", scope = SalesAccountResource.class)
    public JAXBElement<BigDecimal> createSalesAccountResourceAttributeNumber3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountResourceAttributeNumber3_QNAME, BigDecimal.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeNumber4", scope = SalesAccountResource.class)
    public JAXBElement<BigDecimal> createSalesAccountResourceAttributeNumber4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountResourceAttributeNumber4_QNAME, BigDecimal.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeNumber1", scope = SalesAccountResource.class)
    public JAXBElement<BigDecimal> createSalesAccountResourceAttributeNumber1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountResourceAttributeNumber1_QNAME, BigDecimal.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeNumber2", scope = SalesAccountResource.class)
    public JAXBElement<BigDecimal> createSalesAccountResourceAttributeNumber2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountResourceAttributeNumber2_QNAME, BigDecimal.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeNumber5", scope = SalesAccountResource.class)
    public JAXBElement<BigDecimal> createSalesAccountResourceAttributeNumber5(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountResourceAttributeNumber5_QNAME, BigDecimal.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Name1", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceName1(String value) {
        return new JAXBElement<String>(_SalesAccountResourceName1_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "NamedAccountFlag", scope = SalesAccountResource.class)
    public JAXBElement<Boolean> createSalesAccountResourceNamedAccountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountNamedAccountFlag_QNAME, Boolean.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "OrgTreeCode", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceOrgTreeCode(String value) {
        return new JAXBElement<String>(_SalesAccountResourceOrgTreeCode_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "RoleName", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceRoleName(String value) {
        return new JAXBElement<String>(_SalesAccountResourceRoleName_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeCategory", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttributeCategory(String value) {
        return new JAXBElement<String>(_MySalesAccountAttributeCategory_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute4", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute4(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute4_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute5", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute5(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute5_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute6", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute6(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute6_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute7", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute7(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute7_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute8", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute8(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute8_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute9", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute9(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute9_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ResourcePrimaryOrgName", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceResourcePrimaryOrgName(String value) {
        return new JAXBElement<String>(_SalesAccountResourceResourcePrimaryOrgName_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "FormattedPhoneNumber", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_SalesAccountResourceFormattedPhoneNumber_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PartyName1", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourcePartyName1(String value) {
        return new JAXBElement<String>(_SalesAccountResourcePartyName1_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ReportsToFlag", scope = SalesAccountResource.class)
    public JAXBElement<Boolean> createSalesAccountResourceReportsToFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SalesAccountResourceReportsToFlag_QNAME, Boolean.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AssignmentTypeCode", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAssignmentTypeCode(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAssignmentTypeCode_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ResourceId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceResourceId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceResourceId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute1", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute1(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute1_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute2", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute2(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute2_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute3", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute3(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute3_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ManagerPartyId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceManagerPartyId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceManagerPartyId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ResourcePrimaryOrgId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceResourcePrimaryOrgId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceResourcePrimaryOrgId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "StartDateActive", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryStartDateActive_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Attribute15", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceAttribute15(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAttribute15_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeDate1", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceAttributeDate1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountResourceAttributeDate1_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeDate3", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceAttributeDate3(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountResourceAttributeDate3_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeDate2", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceAttributeDate2(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountResourceAttributeDate2_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeDate5", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceAttributeDate5(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountResourceAttributeDate5_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "TerritoryVersionId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceTerritoryVersionId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeDate4", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceAttributeDate4(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountResourceAttributeDate4_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerPillar", scope = SalesAccountResource.class)
    public JAXBElement<Integer> createSalesAccountResourceCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerPillar_QNAME, Integer.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "MemberFunctionCode", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceMemberFunctionCode(String value) {
        return new JAXBElement<String>(_SalesAccountResourceMemberFunctionCode_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerSor", scope = SalesAccountResource.class)
    public JAXBElement<Integer> createSalesAccountResourceCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerSor_QNAME, Integer.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "EmailAddress", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceEmailAddress(String value) {
        return new JAXBElement<String>(_SalesAccountResourceEmailAddress_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ResourceOrgId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourceResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceResourceOrgId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PrTerritoryId", scope = SalesAccountResource.class)
    public JAXBElement<Long> createSalesAccountResourcePrTerritoryId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourcePrTerritoryId_QNAME, Long.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "EndDateActive", scope = SalesAccountResource.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountResourceEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryEndDateActive_QNAME, XMLGregorianCalendar.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LockAssignmentBooleanFlag", scope = SalesAccountResource.class)
    public JAXBElement<Boolean> createSalesAccountResourceLockAssignmentBooleanFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SalesAccountResourceLockAssignmentBooleanFlag_QNAME, Boolean.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "TypeCode", scope = SalesAccountResource.class)
    public JAXBElement<String> createSalesAccountResourceTypeCode(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryTypeCode_QNAME, String.class, SalesAccountResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfLastUpd", scope = SalesParty.class)
    public JAXBElement<String> createSalesPartyCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsCpdrfLastUpd_QNAME, String.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PartyName", scope = SalesParty.class)
    public JAXBElement<String> createSalesPartyPartyName(String value) {
        return new JAXBElement<String>(_SalesPartyPartyName_QNAME, String.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AssgnExceptionFlag", scope = SalesParty.class)
    public JAXBElement<Boolean> createSalesPartyAssgnExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountAssgnExceptionFlag_QNAME, Boolean.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ExistingFlag", scope = SalesParty.class)
    public JAXBElement<Boolean> createSalesPartyExistingFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountExistingFlag_QNAME, Boolean.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ExistingFlgLastUpdDate", scope = SalesParty.class)
    public JAXBElement<XMLGregorianCalendar> createSalesPartyExistingFlgLastUpdDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MySalesAccountExistingFlgLastUpdDate_QNAME, XMLGregorianCalendar.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerSor", scope = SalesParty.class)
    public JAXBElement<Integer> createSalesPartyCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerSor_QNAME, Integer.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PartyUniqueName", scope = SalesParty.class)
    public JAXBElement<String> createSalesPartyPartyUniqueName(String value) {
        return new JAXBElement<String>(_SalesPartyPartyUniqueName_QNAME, String.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerPillar", scope = SalesParty.class)
    public JAXBElement<Integer> createSalesPartyCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerPillar_QNAME, Integer.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "NamedAccountFlag", scope = SalesParty.class)
    public JAXBElement<Boolean> createSalesPartyNamedAccountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountNamedAccountFlag_QNAME, Boolean.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttachmentEntityName", scope = SalesParty.class, defaultValue = "ZCA_SALES_PARTY")
    public JAXBElement<String> createSalesPartyAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SalesPartyAttachmentEntityName_QNAME, String.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = SalesParty.class)
    public JAXBElement<XMLGregorianCalendar> createSalesPartyUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastAssignedDate", scope = SalesParty.class)
    public JAXBElement<XMLGregorianCalendar> createSalesPartyLastAssignedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MySalesAccountLastAssignedDate_QNAME, XMLGregorianCalendar.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeCategory", scope = SalesParty.class)
    public JAXBElement<String> createSalesPartyAttributeCategory(String value) {
        return new JAXBElement<String>(_MySalesAccountAttributeCategory_QNAME, String.class, SalesParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfLastUpd", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_SalesAccountContactsCpdrfLastUpd_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CodeAssignmentId", scope = SalesAccount.class)
    public JAXBElement<Long> createSalesAccountCodeAssignmentId(Long value) {
        return new JAXBElement<Long>(_SalesAccountCodeAssignmentId_QNAME, Long.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AccountDirectorId", scope = SalesAccount.class)
    public JAXBElement<Long> createSalesAccountAccountDirectorId(Long value) {
        return new JAXBElement<Long>(_SalesAccountAccountDirectorId_QNAME, Long.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CurrencyCode", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountCurrencyCode(String value) {
        return new JAXBElement<String>(_SalesAccountCurrencyCode_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AssgnExceptionFlag", scope = SalesAccount.class)
    public JAXBElement<Boolean> createSalesAccountAssgnExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountAssgnExceptionFlag_QNAME, Boolean.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountNameSuffix", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountSalesAccountNameSuffix(String value) {
        return new JAXBElement<String>(_SalesAccountSalesAccountNameSuffix_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastUpdateLogin", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesAccountTerritoryLastUpdateLogin_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerPillar", scope = SalesAccount.class)
    public JAXBElement<Integer> createSalesAccountCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerPillar_QNAME, Integer.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CorpCurrencyCode", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_SalesAccountCorpCurrencyCode_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ClassCategory1", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountClassCategory1(String value) {
        return new JAXBElement<String>(_SalesAccountClassCategory1_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "NamedAccountFlag", scope = SalesAccount.class)
    public JAXBElement<Boolean> createSalesAccountNamedAccountFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountNamedAccountFlag_QNAME, Boolean.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ViewApplicationId", scope = SalesAccount.class)
    public JAXBElement<Long> createSalesAccountViewApplicationId(Long value) {
        return new JAXBElement<Long>(_SalesAccountViewApplicationId_QNAME, Long.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Status", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountStatus(String value) {
        return new JAXBElement<String>(_SalesAccountStatus_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserLastUpdateDate", scope = SalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PartyUniqueName1", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountPartyUniqueName1(String value) {
        return new JAXBElement<String>(_SalesAccountPartyUniqueName1_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ClassCode", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountClassCode(String value) {
        return new JAXBElement<String>(_SalesAccountClassCode_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Rating", scope = SalesAccount.class)
    public JAXBElement<Integer> createSalesAccountRating(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountRating_QNAME, Integer.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "AttributeCategory", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountAttributeCategory(String value) {
        return new JAXBElement<String>(_MySalesAccountAttributeCategory_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Route_c", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountRouteC(String value) {
        return new JAXBElement<String>(_SalesAccountRouteC_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UpdateRating", scope = SalesAccount.class)
    public JAXBElement<Integer> createSalesAccountUpdateRating(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountUpdateRating_QNAME, Integer.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ClassCategory", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountClassCategory(String value) {
        return new JAXBElement<String>(_SalesAccountClassCategory_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "DeleteCustomerKey", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountDeleteCustomerKey(String value) {
        return new JAXBElement<String>(_SalesAccountDeleteCustomerKey_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ExistingFlag", scope = SalesAccount.class)
    public JAXBElement<Boolean> createSalesAccountExistingFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MySalesAccountExistingFlag_QNAME, Boolean.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ExistingFlgLastUpdDate", scope = SalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountExistingFlgLastUpdDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MySalesAccountExistingFlgLastUpdDate_QNAME, XMLGregorianCalendar.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PrimaryFlag", scope = SalesAccount.class)
    public JAXBElement<Boolean> createSalesAccountPrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SalesAccountPrimaryFlag_QNAME, Boolean.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CpdrfVerSor", scope = SalesAccount.class)
    public JAXBElement<Integer> createSalesAccountCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_SalesAccountContactsCpdrfVerSor_QNAME, Integer.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountStatus", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountSalesAccountStatus(String value) {
        return new JAXBElement<String>(_SalesAccountSalesAccountStatus_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountUniqueName", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_SalesAccountSalesAccountUniqueName_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "CurcyConvRateType", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountCurcyConvRateType(String value) {
        return new JAXBElement<String>(_SalesAccountCurcyConvRateType_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountName", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountSalesAccountName(String value) {
        return new JAXBElement<String>(_SalesAccountSalesAccountName_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "StartDateActive", scope = SalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryStartDateActive_QNAME, XMLGregorianCalendar.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountType", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountSalesAccountType(String value) {
        return new JAXBElement<String>(_MySalesAccountSalesAccountType_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "EndDateActive", scope = SalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAccountTerritoryEndDateActive_QNAME, XMLGregorianCalendar.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "LastAssignedDate", scope = SalesAccount.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAccountLastAssignedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MySalesAccountLastAssignedDate_QNAME, XMLGregorianCalendar.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "Meaning", scope = SalesAccount.class)
    public JAXBElement<String> createSalesAccountMeaning(String value) {
        return new JAXBElement<String>(_SalesAccountMeaning_QNAME, String.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SellToPartySiteId", scope = SalesAccount.class)
    public JAXBElement<Long> createSalesAccountSellToPartySiteId(Long value) {
        return new JAXBElement<Long>(_SalesAccountSellToPartySiteId_QNAME, Long.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "VisitFreq_c", scope = SalesAccount.class)
    public JAXBElement<BigDecimal> createSalesAccountVisitFreqC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountVisitFreqC_QNAME, BigDecimal.class, SalesAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "PartyName", scope = SalesAccountResourceAccess.class)
    public JAXBElement<String> createSalesAccountResourceAccessPartyName(String value) {
        return new JAXBElement<String>(_SalesPartyPartyName_QNAME, String.class, SalesAccountResourceAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "SalesAccountId", scope = SalesAccountResourceAccess.class)
    public JAXBElement<Long> createSalesAccountResourceAccessSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SalesAccountResourceAccessSalesAccountId_QNAME, Long.class, SalesAccountResourceAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "ResourceId", scope = SalesAccountResourceAccess.class)
    public JAXBElement<BigDecimal> createSalesAccountResourceAccessResourceId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalesAccountResourceResourceId_QNAME, BigDecimal.class, SalesAccountResourceAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", name = "UserGUID", scope = SalesAccountResourceAccess.class)
    public JAXBElement<String> createSalesAccountResourceAccessUserGUID(String value) {
        return new JAXBElement<String>(_SalesAccountResourceAccessUserGUID_QNAME, String.class, SalesAccountResourceAccess.class, value);
    }

}
