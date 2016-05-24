
package com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice package. 
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

    private final static QName _OrganizationParty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "organizationParty");
    private final static QName _SWOTAnalysisC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "sWOTAnalysis_c");
    private final static QName _AdditionalOrganizationName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "additionalOrganizationName");
    private final static QName _OrganizationProfile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "organizationProfile");
    private final static QName _OrganizationPartyResult_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "organizationPartyResult");
    private final static QName _OINTJDEMatchC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "o_INT_JDE_Match_c");
    private final static QName _FinancialReport_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "financialReport");
    private final static QName _FinancialNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "financialNumber");
    private final static QName _IncidentC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "incident_c");
    private final static QName _IncidentCRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "RequestId");
    private final static QName _IncidentCIsOwner_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "IsOwner");
    private final static QName _IncidentCLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LastUpdateDate");
    private final static QName _IncidentCUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "UserLastUpdateDate");
    private final static QName _IncidentCJobDefinitionName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "JobDefinitionName");
    private final static QName _IncidentCJobDefinitionPackage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "JobDefinitionPackage");
    private final static QName _IncidentCCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CorpCurrencyCode");
    private final static QName _IncidentCCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CreatedBy");
    private final static QName _IncidentCCpdrfVerPillar_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CpdrfVerPillar");
    private final static QName _IncidentCCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CurcyConvRateType");
    private final static QName _IncidentCLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LastUpdateLogin");
    private final static QName _IncidentCOrganizationProfileIdC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OrganizationProfile_Id_c");
    private final static QName _IncidentCCpdrfVerSor_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CpdrfVerSor");
    private final static QName _IncidentCLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LastUpdatedBy");
    private final static QName _IncidentCObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ObjectVersionNumber");
    private final static QName _IncidentCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CurrencyCode");
    private final static QName _IncidentCCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CreationDate");
    private final static QName _IncidentCCpdrfLastUpd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CpdrfLastUpd");
    private final static QName _FinancialReportDateReportIssued_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DateReportIssued");
    private final static QName _FinancialReportStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Status");
    private final static QName _FinancialReportFiscalInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "FiscalInd");
    private final static QName _FinancialReportReportStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ReportStartDate");
    private final static QName _FinancialReportWhUdpateId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "WhUdpateId");
    private final static QName _FinancialReportUnbalancedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "UnbalancedInd");
    private final static QName _FinancialReportRequiringAuthority_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "RequiringAuthority");
    private final static QName _FinancialReportCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CreatedByModule");
    private final static QName _FinancialReportReportEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ReportEndDate");
    private final static QName _FinancialReportDocumentReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DocumentReference");
    private final static QName _FinancialReportQualifiedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "QualifiedInd");
    private final static QName _FinancialReportConsolidatedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ConsolidatedInd");
    private final static QName _FinancialReportTypeOfFinancialReport_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TypeOfFinancialReport");
    private final static QName _FinancialReportOpeningInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OpeningInd");
    private final static QName _FinancialReportTrialBalanceInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TrialBalanceInd");
    private final static QName _FinancialReportIssuedPeriod_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "IssuedPeriod");
    private final static QName _FinancialReportSignedByPrincipalsInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SignedByPrincipalsInd");
    private final static QName _FinancialReportForecastInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ForecastInd");
    private final static QName _FinancialReportRestatedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "RestatedInd");
    private final static QName _FinancialReportProformaInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ProformaInd");
    private final static QName _FinancialReportAuditInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "AuditInd");
    private final static QName _FinancialReportFinalInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "FinalInd");
    private final static QName _FinancialReportEstimatedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EstimatedInd");
    private final static QName _FinancialNumberFinancialNumberCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "FinancialNumberCurrency");
    private final static QName _FinancialNumberFinancialUnitsApplied_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "FinancialUnitsApplied");
    private final static QName _FinancialNumberProjectedActualCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ProjectedActualCode");
    private final static QName _FinancialNumberFinancialNumberName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "FinancialNumberName");
    private final static QName _OINTJDEMatchCPartyTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PartyType_c");
    private final static QName _OINTJDEMatchCCountryC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Country_c");
    private final static QName _OINTJDEMatchCStateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "State_c");
    private final static QName _OINTJDEMatchCIndustryClassificationC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "IndustryClassification_c");
    private final static QName _OINTJDEMatchCPostalCodeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PostalCode_c");
    private final static QName _OINTJDEMatchCPartyIDC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PartyID_c");
    private final static QName _OINTJDEMatchCPrimaryEmailC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryEmail_c");
    private final static QName _OINTJDEMatchCPrimaryPhoneNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneNumber_c");
    private final static QName _OINTJDEMatchCCityC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "City_c");
    private final static QName _OINTJDEMatchCPartyNameC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PartyName_c");
    private final static QName _OINTJDEMatchCPrimaryPhoneAreaCodeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneAreaCode_c");
    private final static QName _OINTJDEMatchCAddress1C_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Address1_c");
    private final static QName _OINTJDEMatchCProvinceC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Province_c");
    private final static QName _AdditionalOrganizationNameOverallPreferredFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OverallPreferredFlag");
    private final static QName _AdditionalOrganizationNameOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OrigSystemReference");
    private final static QName _AdditionalOrganizationNameOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OrigSystem");
    private final static QName _AdditionalOrganizationNameTransliterationLang_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TransliterationLang");
    private final static QName _AdditionalOrganizationNameDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Description");
    private final static QName _AdditionalOrganizationNamePreferredFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredFlag");
    private final static QName _AdditionalOrganizationNamePartyName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PartyName");
    private final static QName _OrganizationProfileParentSubInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ParentSubInd");
    private final static QName _OrganizationProfileOrganizationType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OrganizationType");
    private final static QName _OrganizationProfileStrategicContactIdC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "StrategicContact_Id_c");
    private final static QName _OrganizationProfilePreferredNameId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredNameId");
    private final static QName _OrganizationProfileTotalEmployeesText_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TotalEmployeesText");
    private final static QName _OrganizationProfileContentSourceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ContentSourceNumber");
    private final static QName _OrganizationProfilePrimaryPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneCountryCode");
    private final static QName _OrganizationProfileUniqueNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "UniqueNameSuffix");
    private final static QName _OrganizationProfileEmployeesAtPrimaryAddressEstimation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EmployeesAtPrimaryAddressEstimation");
    private final static QName _OrganizationProfileLocalActivityCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LocalActivityCode");
    private final static QName _OrganizationProfilePreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredContactMethod");
    private final static QName _OrganizationProfilePrimaryEmailId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryEmailId");
    private final static QName _OrganizationProfileCeoTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CeoTitle");
    private final static QName _OrganizationProfileIdenAddrPartySiteId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "IdenAddrPartySiteId");
    private final static QName _OrganizationProfileLastSourceUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LastSourceUpdateDate");
    private final static QName _OrganizationProfileDataCloudStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DataCloudStatus");
    private final static QName _OrganizationProfileOobInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OobInd");
    private final static QName _OrganizationProfileNextFyPotentialRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "NextFyPotentialRevenueAmount");
    private final static QName _OrganizationProfileAccountNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "AccountNumber_c");
    private final static QName _OrganizationProfileLSAccountTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSAccountType_c");
    private final static QName _OrganizationProfileControlYr_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ControlYr");
    private final static QName _OrganizationProfileImportInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ImportInd");
    private final static QName _OrganizationProfilePrimaryPhonePurpose_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhonePurpose");
    private final static QName _OrganizationProfileExportInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ExportInd");
    private final static QName _OrganizationProfilePrimaryEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryEmailAddress");
    private final static QName _OrganizationProfileLSRouteCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSRoute_cMeaning");
    private final static QName _OrganizationProfileTotalPaymentAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TotalPaymentAmount");
    private final static QName _OrganizationProfilePreferredName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredName");
    private final static QName _OrganizationProfileIncorpYear_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "IncorpYear");
    private final static QName _OrganizationProfileSuffixOverriddenFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SuffixOverriddenFlag");
    private final static QName _OrganizationProfileLastEnrichmentDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LastEnrichmentDate");
    private final static QName _OrganizationProfileEmployeesTotal_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EmployeesTotal");
    private final static QName _OrganizationProfilePlanManagerCalcC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PlanManagerCalc_c");
    private final static QName _OrganizationProfileInstitutionTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "InstitutionType_c");
    private final static QName _OrganizationProfileCertificationLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CertificationLevel");
    private final static QName _OrganizationProfilePrimaryAddressState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressState");
    private final static QName _OrganizationProfileGlobalUltimateDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "GlobalUltimateDUNSNumberC");
    private final static QName _OrganizationProfileLSNumberOfBedsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSNumberOfBeds_c");
    private final static QName _OrganizationProfileStrategicContactC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "StrategicContact_c");
    private final static QName _OrganizationProfileMinorityOwnedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "MinorityOwnedInd");
    private final static QName _OrganizationProfileAccountPlanStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "AccountPlanStatus_c");
    private final static QName _OrganizationProfileLegalStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LegalStatus");
    private final static QName _OrganizationProfileLaborSurplusInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LaborSurplusInd");
    private final static QName _OrganizationProfileSynchErrorC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SynchError_c");
    private final static QName _OrganizationProfileBusinessScope_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "BusinessScope");
    private final static QName _OrganizationProfilePrimaryPhoneLineType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneLineType");
    private final static QName _OrganizationProfileDoNotConfuseWith_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DoNotConfuseWith");
    private final static QName _OrganizationProfileBusinessReport_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "BusinessReport");
    private final static QName _OrganizationProfileHomeCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "HomeCountry");
    private final static QName _OrganizationProfilePrimaryAddressCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressCounty");
    private final static QName _OrganizationProfileTotalEmployeesInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TotalEmployeesInd");
    private final static QName _OrganizationProfileIdenAddrLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "IdenAddrLocationId");
    private final static QName _OrganizationProfileParentDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ParentDUNSNumberC");
    private final static QName _OrganizationProfileCustomerTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CustomerType_c");
    private final static QName _OrganizationProfileCustomObject3IdCustomFeedbacktoAccount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CustomObject3_Id_CustomFeedbacktoAccount");
    private final static QName _OrganizationProfileRegistrationType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "RegistrationType");
    private final static QName _OrganizationProfileEmployeesAtPrimaryAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EmployeesAtPrimaryAddress");
    private final static QName _OrganizationProfileSICCodeType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SICCodeType");
    private final static QName _OrganizationProfilePrimaryLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryLanguage");
    private final static QName _OrganizationProfileOrganizationSize_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OrganizationSize");
    private final static QName _OrganizationProfileLSAccountTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSAccountType_cMeaning");
    private final static QName _OrganizationProfileCurrentFiscalYearPotentialRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CurrentFiscalYearPotentialRevenueAmount");
    private final static QName _OrganizationProfileIndustryC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Industry_c");
    private final static QName _OrganizationProfileOfferSegmentC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "OfferSegment_c");
    private final static QName _OrganizationProfilePrincipalTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrincipalTitle");
    private final static QName _OrganizationProfilePublicPrivateOwnershipFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PublicPrivateOwnershipFlag");
    private final static QName _OrganizationProfilePrincipalName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrincipalName");
    private final static QName _OrganizationProfileWomanOwnedInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "WomanOwnedInd");
    private final static QName _OrganizationProfileRentOwnInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "RentOwnInd");
    private final static QName _OrganizationProfileDisplayedDUNSPartyIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DisplayedDUNSPartyIdentifier");
    private final static QName _OrganizationProfilePrimaryAddressProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressProvince");
    private final static QName _OrganizationProfilePreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredFunctionalCurrency");
    private final static QName _OrganizationProfileMissionStatement_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "MissionStatement");
    private final static QName _OrganizationProfileMinorityOwnedType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "MinorityOwnedType");
    private final static QName _OrganizationProfileEnquiryDUNS_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EnquiryDUNS");
    private final static QName _OrganizationProfilePreferredContactFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredContactFormattedPhoneNumber");
    private final static QName _OrganizationProfilePrimaryPhoneExtension_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneExtension");
    private final static QName _OrganizationProfileFiscalYearendMonth_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "FiscalYearendMonth");
    private final static QName _OrganizationProfileAlias_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Alias");
    private final static QName _OrganizationProfileServiceCloudIDC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ServiceCloudID_c");
    private final static QName _OrganizationProfileTotalEmployeesEstimatedIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TotalEmployeesEstimatedIndicator");
    private final static QName _OrganizationProfileBankOrBranchNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "BankOrBranchNumber");
    private final static QName _OrganizationProfilePrimaryURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryURL");
    private final static QName _OrganizationProfileDisadv8AInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Disadv8aInd");
    private final static QName _OrganizationProfileLSCallFrequencyC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSCallFrequency_c");
    private final static QName _OrganizationProfilePrimaryPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneNumber");
    private final static QName _OrganizationProfileCustomerIndustryC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CustomerIndustry_c");
    private final static QName _OrganizationProfileLineOfBusiness_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LineOfBusiness");
    private final static QName _OrganizationProfileStockSymbol_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "StockSymbol");
    private final static QName _OrganizationProfileOINTJDESyncStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "O_INT_JDE_Sync_Status_c");
    private final static QName _OrganizationProfileLocalBusIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LocalBusIdentifier");
    private final static QName _OrganizationProfileHQBranchIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "HQBranchIndicator");
    private final static QName _OrganizationProfileLSRouteC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSRoute_c");
    private final static QName _OrganizationProfileBankCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "BankCode");
    private final static QName _OrganizationProfileTotalEmployeesMinimumIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TotalEmployeesMinimumIndicator");
    private final static QName _OrganizationProfilePrimaryPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneAreaCode");
    private final static QName _OrganizationProfilePreferredContactName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredContactName");
    private final static QName _OrganizationProfilePrimaryPhoneId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneId");
    private final static QName _OrganizationProfileLSNumberOfPhysiciansC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LSNumberOfPhysicians_c");
    private final static QName _OrganizationProfileDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DUNSNumberC");
    private final static QName _OrganizationProfileValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ValidatedFlag");
    private final static QName _OrganizationProfilePreferredContactEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredContactEmailAddress");
    private final static QName _OrganizationProfileSynchC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Synch_c");
    private final static QName _OrganizationProfileJgzzFiscalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "JgzzFiscalCode");
    private final static QName _OrganizationProfileYearEstablished_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "YearEstablished");
    private final static QName _OrganizationProfileAnalysisFy_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "AnalysisFy");
    private final static QName _OrganizationProfileGSAIndicatorFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "GSAIndicatorFlag");
    private final static QName _OrganizationProfileCongDistCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CongDistCode");
    private final static QName _OrganizationProfileBranchCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "BranchCode");
    private final static QName _OrganizationProfilePrimaryAddressCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressCountry");
    private final static QName _OrganizationProfileStrategicPlanC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "StrategicPlan_c");
    private final static QName _OrganizationProfileSeblUserKeyLoc_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SeblUserKeyLoc");
    private final static QName _OrganizationProfileLocalBusIdenType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LocalBusIdenType");
    private final static QName _OrganizationProfileEmployeesAtPrimaryAddressText_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EmployeesAtPrimaryAddressText");
    private final static QName _OrganizationProfileBranchFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "BranchFlag");
    private final static QName _OrganizationProfilePrimaryFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryFormattedPhoneNumber");
    private final static QName _OrganizationProfileTradingPartnerIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "TradingPartnerIdentifier");
    private final static QName _OrganizationProfileGrowthStrategyDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "GrowthStrategyDescription");
    private final static QName _OrganizationProfileComments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Comments");
    private final static QName _OrganizationProfileInternalFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "InternalFlag");
    private final static QName _OrganizationProfileSICCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SICCode");
    private final static QName _OrganizationProfileCertReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CertReasonCode");
    private final static QName _OrganizationProfilePrimaryWebId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryWebId");
    private final static QName _OrganizationProfileCorporationClass_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CorporationClass");
    private final static QName _OrganizationProfileDbRating_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DbRating");
    private final static QName _OrganizationProfilePrimaryAddressLine3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressLine3");
    private final static QName _OrganizationProfilePrimaryAddressLine2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressLine2");
    private final static QName _OrganizationProfilePrimaryAddressLine4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressLine4");
    private final static QName _OrganizationProfileInstitutionTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "InstitutionType_cMeaning");
    private final static QName _OrganizationProfilePrimaryAddressLine1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressLine1");
    private final static QName _OrganizationProfileEmployeesAtPrimaryAddressMinimum_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EmployeesAtPrimaryAddressMinimum");
    private final static QName _OrganizationProfileLocalActivityCodeType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LocalActivityCodeType");
    private final static QName _OrganizationProfileCeoName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CeoName");
    private final static QName _OrganizationProfileDomesticUltimateDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "DomesticUltimateDUNSNumberC");
    private final static QName _OrganizationProfilePrimaryFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryFormattedAddress");
    private final static QName _OrganizationProfilePrimaryAddressPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressPostalCode");
    private final static QName _OrganizationProfileSmallBusInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SmallBusInd");
    private final static QName _OrganizationProfileStrategicPlanIdC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "StrategicPlan_Id_c");
    private final static QName _OrganizationProfileLastUpdateSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LastUpdateSourceSystem");
    private final static QName _OrganizationProfilePronunciation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Pronunciation");
    private final static QName _OrganizationProfilePreferredContactPersonId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PreferredContactPersonId");
    private final static QName _OrganizationProfilePrimaryAddressCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryAddressCity");
    private final static QName _OrganizationProfileThirdPartyFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "ThirdPartyFlag");
    private final static QName _OrganizationProfileCustomerTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CustomerType_cMeaning");
    private final static QName _OrganizationProfileAccountPlanStatusCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "AccountPlanStatus_cMeaning");
    private final static QName _SWOTAnalysisCEntryTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EntryType_cMeaning");
    private final static QName _SWOTAnalysisCSWOTEntryC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SWOTEntry_c");
    private final static QName _SWOTAnalysisCEntryTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EntryType_c");
    private final static QName _OrganizationPartyState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "State");
    private final static QName _OrganizationPartySourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SourceSystemReferenceValue");
    private final static QName _OrganizationPartyCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "County");
    private final static QName _OrganizationPartyPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PostalCode");
    private final static QName _OrganizationPartySourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SourceSystem");
    private final static QName _OrganizationPartyCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "City");
    private final static QName _OrganizationPartyProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Province");
    private final static QName _OrganizationPartyPrimaryURLContactPointId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryURLContactPointId");
    private final static QName _OrganizationPartyURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "URL");
    private final static QName _OrganizationPartyGroupType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "GroupType");
    private final static QName _OrganizationPartyLanguageName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "LanguageName");
    private final static QName _OrganizationPartyPersonSecondLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PersonSecondLastName");
    private final static QName _OrganizationPartyPrimaryPhoneContactPointId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryPhoneContactPointId");
    private final static QName _OrganizationPartyPrimaryEmailContactPointId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "PrimaryEmailContactPointId");
    private final static QName _OrganizationPartySourceSystemUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "SourceSystemUpdateDate");
    private final static QName _OrganizationPartyCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Country");
    private final static QName _OrganizationPartyAddress4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Address4");
    private final static QName _OrganizationPartyAddress1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Address1");
    private final static QName _OrganizationPartyAddress3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Address3");
    private final static QName _OrganizationPartyAddress2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "Address2");
    private final static QName _OrganizationPartyEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "EmailAddress");
    private final static QName _OrganizationPartyCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", "CategoryCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganizationParty }
     * 
     */
    public OrganizationParty createOrganizationParty() {
        return new OrganizationParty();
    }

    /**
     * Create an instance of {@link OrganizationPartyResult }
     * 
     */
    public OrganizationPartyResult createOrganizationPartyResult() {
        return new OrganizationPartyResult();
    }

    /**
     * Create an instance of {@link FinancialNumber }
     * 
     */
    public FinancialNumber createFinancialNumber() {
        return new FinancialNumber();
    }

    /**
     * Create an instance of {@link AdditionalOrganizationName }
     * 
     */
    public AdditionalOrganizationName createAdditionalOrganizationName() {
        return new AdditionalOrganizationName();
    }

    /**
     * Create an instance of {@link FinancialReport }
     * 
     */
    public FinancialReport createFinancialReport() {
        return new FinancialReport();
    }

    /**
     * Create an instance of {@link SWOTAnalysisC }
     * 
     */
    public SWOTAnalysisC createSWOTAnalysisC() {
        return new SWOTAnalysisC();
    }

    /**
     * Create an instance of {@link OINTJDEMatchC }
     * 
     */
    public OINTJDEMatchC createOINTJDEMatchC() {
        return new OINTJDEMatchC();
    }

    /**
     * Create an instance of {@link IncidentC }
     * 
     */
    public IncidentC createIncidentC() {
        return new IncidentC();
    }

    /**
     * Create an instance of {@link OrganizationProfile }
     * 
     */
    public OrganizationProfile createOrganizationProfile() {
        return new OrganizationProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "organizationParty")
    public JAXBElement<OrganizationParty> createOrganizationParty(OrganizationParty value) {
        return new JAXBElement<OrganizationParty>(_OrganizationParty_QNAME, OrganizationParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SWOTAnalysisC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "sWOTAnalysis_c")
    public JAXBElement<SWOTAnalysisC> createSWOTAnalysisC(SWOTAnalysisC value) {
        return new JAXBElement<SWOTAnalysisC>(_SWOTAnalysisC_QNAME, SWOTAnalysisC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalOrganizationName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "additionalOrganizationName")
    public JAXBElement<AdditionalOrganizationName> createAdditionalOrganizationName(AdditionalOrganizationName value) {
        return new JAXBElement<AdditionalOrganizationName>(_AdditionalOrganizationName_QNAME, AdditionalOrganizationName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "organizationProfile")
    public JAXBElement<OrganizationProfile> createOrganizationProfile(OrganizationProfile value) {
        return new JAXBElement<OrganizationProfile>(_OrganizationProfile_QNAME, OrganizationProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPartyResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "organizationPartyResult")
    public JAXBElement<OrganizationPartyResult> createOrganizationPartyResult(OrganizationPartyResult value) {
        return new JAXBElement<OrganizationPartyResult>(_OrganizationPartyResult_QNAME, OrganizationPartyResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OINTJDEMatchC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "o_INT_JDE_Match_c")
    public JAXBElement<OINTJDEMatchC> createOINTJDEMatchC(OINTJDEMatchC value) {
        return new JAXBElement<OINTJDEMatchC>(_OINTJDEMatchC_QNAME, OINTJDEMatchC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "financialReport")
    public JAXBElement<FinancialReport> createFinancialReport(FinancialReport value) {
        return new JAXBElement<FinancialReport>(_FinancialReport_QNAME, FinancialReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "financialNumber")
    public JAXBElement<FinancialNumber> createFinancialNumber(FinancialNumber value) {
        return new JAXBElement<FinancialNumber>(_FinancialNumber_QNAME, FinancialNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "incident_c")
    public JAXBElement<IncidentC> createIncidentC(IncidentC value) {
        return new JAXBElement<IncidentC>(_IncidentC_QNAME, IncidentC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = IncidentC.class)
    public JAXBElement<Long> createIncidentCRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IsOwner", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCIsOwner(String value) {
        return new JAXBElement<String>(_IncidentCIsOwner_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateDate", scope = IncidentC.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCLastUpdateDate_QNAME, XMLGregorianCalendar.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "UserLastUpdateDate", scope = IncidentC.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JobDefinitionName", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCJobDefinitionName(String value) {
        return new JAXBElement<String>(_IncidentCJobDefinitionName_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JobDefinitionPackage", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_IncidentCJobDefinitionPackage_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CorpCurrencyCode", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCorpCurrencyCode_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreatedBy", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCCreatedBy(String value) {
        return new JAXBElement<String>(_IncidentCCreatedBy_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfVerPillar", scope = IncidentC.class)
    public JAXBElement<Integer> createIncidentCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_IncidentCCpdrfVerPillar_QNAME, Integer.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurcyConvRateType", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_IncidentCCurcyConvRateType_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrganizationProfile_Id_c", scope = IncidentC.class)
    public JAXBElement<BigDecimal> createIncidentCOrganizationProfileIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IncidentCOrganizationProfileIdC_QNAME, BigDecimal.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfVerSor", scope = IncidentC.class)
    public JAXBElement<Integer> createIncidentCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_IncidentCCpdrfVerSor_QNAME, Integer.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdatedBy", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdatedBy_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ObjectVersionNumber", scope = IncidentC.class)
    public JAXBElement<BigDecimal> createIncidentCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IncidentCObjectVersionNumber_QNAME, BigDecimal.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurrencyCode", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCurrencyCode_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreationDate", scope = IncidentC.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCCreationDate_QNAME, XMLGregorianCalendar.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfLastUpd", scope = IncidentC.class)
    public JAXBElement<String> createIncidentCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_IncidentCCpdrfLastUpd_QNAME, String.class, IncidentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = FinancialReport.class)
    public JAXBElement<Long> createFinancialReportRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DateReportIssued", scope = FinancialReport.class)
    public JAXBElement<XMLGregorianCalendar> createFinancialReportDateReportIssued(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinancialReportDateReportIssued_QNAME, XMLGregorianCalendar.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Status", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportStatus(String value) {
        return new JAXBElement<String>(_FinancialReportStatus_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FiscalInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportFiscalInd(String value) {
        return new JAXBElement<String>(_FinancialReportFiscalInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ReportStartDate", scope = FinancialReport.class)
    public JAXBElement<XMLGregorianCalendar> createFinancialReportReportStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinancialReportReportStartDate_QNAME, XMLGregorianCalendar.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "WhUdpateId", scope = FinancialReport.class)
    public JAXBElement<XMLGregorianCalendar> createFinancialReportWhUdpateId(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinancialReportWhUdpateId_QNAME, XMLGregorianCalendar.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "UnbalancedInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportUnbalancedInd(String value) {
        return new JAXBElement<String>(_FinancialReportUnbalancedInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequiringAuthority", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportRequiringAuthority(String value) {
        return new JAXBElement<String>(_FinancialReportRequiringAuthority_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreatedByModule", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportCreatedByModule(String value) {
        return new JAXBElement<String>(_FinancialReportCreatedByModule_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ReportEndDate", scope = FinancialReport.class)
    public JAXBElement<XMLGregorianCalendar> createFinancialReportReportEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinancialReportReportEndDate_QNAME, XMLGregorianCalendar.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DocumentReference", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportDocumentReference(String value) {
        return new JAXBElement<String>(_FinancialReportDocumentReference_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "QualifiedInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportQualifiedInd(String value) {
        return new JAXBElement<String>(_FinancialReportQualifiedInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ConsolidatedInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportConsolidatedInd(String value) {
        return new JAXBElement<String>(_FinancialReportConsolidatedInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TypeOfFinancialReport", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportTypeOfFinancialReport(String value) {
        return new JAXBElement<String>(_FinancialReportTypeOfFinancialReport_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OpeningInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportOpeningInd(String value) {
        return new JAXBElement<String>(_FinancialReportOpeningInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TrialBalanceInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportTrialBalanceInd(String value) {
        return new JAXBElement<String>(_FinancialReportTrialBalanceInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IssuedPeriod", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportIssuedPeriod(String value) {
        return new JAXBElement<String>(_FinancialReportIssuedPeriod_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SignedByPrincipalsInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportSignedByPrincipalsInd(String value) {
        return new JAXBElement<String>(_FinancialReportSignedByPrincipalsInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ForecastInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportForecastInd(String value) {
        return new JAXBElement<String>(_FinancialReportForecastInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RestatedInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportRestatedInd(String value) {
        return new JAXBElement<String>(_FinancialReportRestatedInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ProformaInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportProformaInd(String value) {
        return new JAXBElement<String>(_FinancialReportProformaInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "AuditInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportAuditInd(String value) {
        return new JAXBElement<String>(_FinancialReportAuditInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FinalInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportFinalInd(String value) {
        return new JAXBElement<String>(_FinancialReportFinalInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EstimatedInd", scope = FinancialReport.class)
    public JAXBElement<String> createFinancialReportEstimatedInd(String value) {
        return new JAXBElement<String>(_FinancialReportEstimatedInd_QNAME, String.class, FinancialReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = FinancialNumber.class)
    public JAXBElement<String> createFinancialNumberLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = FinancialNumber.class)
    public JAXBElement<Long> createFinancialNumberRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreatedByModule", scope = FinancialNumber.class)
    public JAXBElement<String> createFinancialNumberCreatedByModule(String value) {
        return new JAXBElement<String>(_FinancialReportCreatedByModule_QNAME, String.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FinancialNumberCurrency", scope = FinancialNumber.class)
    public JAXBElement<String> createFinancialNumberFinancialNumberCurrency(String value) {
        return new JAXBElement<String>(_FinancialNumberFinancialNumberCurrency_QNAME, String.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Status", scope = FinancialNumber.class)
    public JAXBElement<String> createFinancialNumberStatus(String value) {
        return new JAXBElement<String>(_FinancialReportStatus_QNAME, String.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FinancialUnitsApplied", scope = FinancialNumber.class)
    public JAXBElement<BigDecimal> createFinancialNumberFinancialUnitsApplied(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FinancialNumberFinancialUnitsApplied_QNAME, BigDecimal.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ProjectedActualCode", scope = FinancialNumber.class)
    public JAXBElement<String> createFinancialNumberProjectedActualCode(String value) {
        return new JAXBElement<String>(_FinancialNumberProjectedActualCode_QNAME, String.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FinancialNumberName", scope = FinancialNumber.class)
    public JAXBElement<String> createFinancialNumberFinancialNumberName(String value) {
        return new JAXBElement<String>(_FinancialNumberFinancialNumberName_QNAME, String.class, FinancialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PartyType_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPartyTypeC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPartyTypeC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = OINTJDEMatchC.class)
    public JAXBElement<Long> createOINTJDEMatchCRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "UserLastUpdateDate", scope = OINTJDEMatchC.class)
    public JAXBElement<XMLGregorianCalendar> createOINTJDEMatchCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Country_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCCountryC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCCountryC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JobDefinitionPackage", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_IncidentCJobDefinitionPackage_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CorpCurrencyCode", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCorpCurrencyCode_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfVerPillar", scope = OINTJDEMatchC.class)
    public JAXBElement<Integer> createOINTJDEMatchCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_IncidentCCpdrfVerPillar_QNAME, Integer.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrganizationProfile_Id_c", scope = OINTJDEMatchC.class)
    public JAXBElement<BigDecimal> createOINTJDEMatchCOrganizationProfileIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IncidentCOrganizationProfileIdC_QNAME, BigDecimal.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "State_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCStateC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCStateC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IndustryClassification_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCIndustryClassificationC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCIndustryClassificationC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PostalCode_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPostalCodeC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPostalCodeC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ObjectVersionNumber", scope = OINTJDEMatchC.class)
    public JAXBElement<BigDecimal> createOINTJDEMatchCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IncidentCObjectVersionNumber_QNAME, BigDecimal.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurrencyCode", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCurrencyCode_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PartyID_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPartyIDC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPartyIDC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryEmail_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPrimaryEmailC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPrimaryEmailC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfLastUpd", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_IncidentCCpdrfLastUpd_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IsOwner", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCIsOwner(String value) {
        return new JAXBElement<String>(_IncidentCIsOwner_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneNumber_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPrimaryPhoneNumberC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPrimaryPhoneNumberC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JobDefinitionName", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCJobDefinitionName(String value) {
        return new JAXBElement<String>(_IncidentCJobDefinitionName_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurcyConvRateType", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_IncidentCCurcyConvRateType_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfVerSor", scope = OINTJDEMatchC.class)
    public JAXBElement<Integer> createOINTJDEMatchCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_IncidentCCpdrfVerSor_QNAME, Integer.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "City_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCCityC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCCityC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PartyName_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPartyNameC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPartyNameC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneAreaCode_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCPrimaryPhoneAreaCodeC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCPrimaryPhoneAreaCodeC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Address1_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCAddress1C(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCAddress1C_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Province_c", scope = OINTJDEMatchC.class)
    public JAXBElement<String> createOINTJDEMatchCProvinceC(String value) {
        return new JAXBElement<String>(_OINTJDEMatchCProvinceC_QNAME, String.class, OINTJDEMatchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = AdditionalOrganizationName.class)
    public JAXBElement<String> createAdditionalOrganizationNameLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OverallPreferredFlag", scope = AdditionalOrganizationName.class)
    public JAXBElement<Boolean> createAdditionalOrganizationNameOverallPreferredFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AdditionalOrganizationNameOverallPreferredFlag_QNAME, Boolean.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = AdditionalOrganizationName.class)
    public JAXBElement<Long> createAdditionalOrganizationNameRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrigSystemReference", scope = AdditionalOrganizationName.class)
    public JAXBElement<String> createAdditionalOrganizationNameOrigSystemReference(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNameOrigSystemReference_QNAME, String.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrigSystem", scope = AdditionalOrganizationName.class)
    public JAXBElement<String> createAdditionalOrganizationNameOrigSystem(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNameOrigSystem_QNAME, String.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TransliterationLang", scope = AdditionalOrganizationName.class)
    public JAXBElement<String> createAdditionalOrganizationNameTransliterationLang(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNameTransliterationLang_QNAME, String.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Description", scope = AdditionalOrganizationName.class)
    public JAXBElement<String> createAdditionalOrganizationNameDescription(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNameDescription_QNAME, String.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredFlag", scope = AdditionalOrganizationName.class)
    public JAXBElement<Boolean> createAdditionalOrganizationNamePreferredFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AdditionalOrganizationNamePreferredFlag_QNAME, Boolean.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PartyName", scope = AdditionalOrganizationName.class)
    public JAXBElement<String> createAdditionalOrganizationNamePartyName(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNamePartyName_QNAME, String.class, AdditionalOrganizationName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ParentSubInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileParentSubInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileParentSubInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrganizationType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOrganizationType(String value) {
        return new JAXBElement<String>(_OrganizationProfileOrganizationType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "StrategicContact_Id_c", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileStrategicContactIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileStrategicContactIdC_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredNameId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfilePreferredNameId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePreferredNameId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TotalEmployeesText", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileTotalEmployeesText(String value) {
        return new JAXBElement<String>(_OrganizationProfileTotalEmployeesText_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CorpCurrencyCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCorpCurrencyCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ContentSourceNumber", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileContentSourceNumber(String value) {
        return new JAXBElement<String>(_OrganizationProfileContentSourceNumber_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneCountryCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneCountryCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "UniqueNameSuffix", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileUniqueNameSuffix(String value) {
        return new JAXBElement<String>(_OrganizationProfileUniqueNameSuffix_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmployeesAtPrimaryAddressEstimation", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileEmployeesAtPrimaryAddressEstimation(String value) {
        return new JAXBElement<String>(_OrganizationProfileEmployeesAtPrimaryAddressEstimation_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LocalActivityCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLocalActivityCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileLocalActivityCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactMethod", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePreferredContactMethod(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredContactMethod_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryEmailId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfilePrimaryEmailId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePrimaryEmailId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CeoTitle", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCeoTitle(String value) {
        return new JAXBElement<String>(_OrganizationProfileCeoTitle_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IdenAddrPartySiteId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfileIdenAddrPartySiteId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfileIdenAddrPartySiteId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastSourceUpdateDate", scope = OrganizationProfile.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationProfileLastSourceUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationProfileLastSourceUpdateDate_QNAME, XMLGregorianCalendar.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DataCloudStatus", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileDataCloudStatus(String value) {
        return new JAXBElement<String>(_OrganizationProfileDataCloudStatus_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OobInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOobInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileOobInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "NextFyPotentialRevenueAmount", scope = OrganizationProfile.class)
    public JAXBElement<AmountType> createOrganizationProfileNextFyPotentialRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OrganizationProfileNextFyPotentialRevenueAmount_QNAME, AmountType.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "AccountNumber_c", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileAccountNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileAccountNumberC_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSAccountType_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLSAccountTypeC(String value) {
        return new JAXBElement<String>(_OrganizationProfileLSAccountTypeC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ControlYr", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileControlYr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileControlYr_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ImportInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileImportInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileImportInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhonePurpose", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhonePurpose_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ExportInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileExportInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileExportInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryEmailAddress", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryEmailAddress(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryEmailAddress_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSRoute_cMeaning", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLSRouteCMeaning(String value) {
        return new JAXBElement<String>(_OrganizationProfileLSRouteCMeaning_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TotalPaymentAmount", scope = OrganizationProfile.class)
    public JAXBElement<AmountType> createOrganizationProfileTotalPaymentAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OrganizationProfileTotalPaymentAmount_QNAME, AmountType.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredName", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePreferredName(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredName_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IncorpYear", scope = OrganizationProfile.class)
    public JAXBElement<Integer> createOrganizationProfileIncorpYear(Integer value) {
        return new JAXBElement<Integer>(_OrganizationProfileIncorpYear_QNAME, Integer.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SuffixOverriddenFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfileSuffixOverriddenFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileSuffixOverriddenFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastEnrichmentDate", scope = OrganizationProfile.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationProfileLastEnrichmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationProfileLastEnrichmentDate_QNAME, XMLGregorianCalendar.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmployeesTotal", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileEmployeesTotal_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PlanManagerCalc_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePlanManagerCalcC(String value) {
        return new JAXBElement<String>(_OrganizationProfilePlanManagerCalcC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "InstitutionType_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileInstitutionTypeC(String value) {
        return new JAXBElement<String>(_OrganizationProfileInstitutionTypeC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrigSystem", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOrigSystem(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNameOrigSystem_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CertificationLevel", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCertificationLevel(String value) {
        return new JAXBElement<String>(_OrganizationProfileCertificationLevel_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressState", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressState(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressState_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "GlobalUltimateDUNSNumberC", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileGlobalUltimateDUNSNumberC(String value) {
        return new JAXBElement<String>(_OrganizationProfileGlobalUltimateDUNSNumberC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSNumberOfBeds_c", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileLSNumberOfBedsC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileLSNumberOfBedsC_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "StrategicContact_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileStrategicContactC(String value) {
        return new JAXBElement<String>(_OrganizationProfileStrategicContactC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "MinorityOwnedInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileMinorityOwnedInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileMinorityOwnedInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "AccountPlanStatus_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileAccountPlanStatusC(String value) {
        return new JAXBElement<String>(_OrganizationProfileAccountPlanStatusC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LegalStatus", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLegalStatus(String value) {
        return new JAXBElement<String>(_OrganizationProfileLegalStatus_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfileRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrigSystemReference", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOrigSystemReference(String value) {
        return new JAXBElement<String>(_AdditionalOrganizationNameOrigSystemReference_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LaborSurplusInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLaborSurplusInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileLaborSurplusInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SynchError_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileSynchErrorC(String value) {
        return new JAXBElement<String>(_OrganizationProfileSynchErrorC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "BusinessScope", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileBusinessScope(String value) {
        return new JAXBElement<String>(_OrganizationProfileBusinessScope_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneLineType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryPhoneLineType(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneLineType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DoNotConfuseWith", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileDoNotConfuseWith(String value) {
        return new JAXBElement<String>(_OrganizationProfileDoNotConfuseWith_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "BusinessReport", scope = OrganizationProfile.class)
    public JAXBElement<byte[]> createOrganizationProfileBusinessReport(byte[] value) {
        return new JAXBElement<byte[]>(_OrganizationProfileBusinessReport_QNAME, byte[].class, OrganizationProfile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "HomeCountry", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileHomeCountry(String value) {
        return new JAXBElement<String>(_OrganizationProfileHomeCountry_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressCounty", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressCounty(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressCounty_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TotalEmployeesInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileTotalEmployeesInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileTotalEmployeesInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IdenAddrLocationId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfileIdenAddrLocationId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfileIdenAddrLocationId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ParentDUNSNumberC", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileParentDUNSNumberC(String value) {
        return new JAXBElement<String>(_OrganizationProfileParentDUNSNumberC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CustomerType_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCustomerTypeC(String value) {
        return new JAXBElement<String>(_OrganizationProfileCustomerTypeC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CustomObject3_Id_CustomFeedbacktoAccount", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileCustomObject3IdCustomFeedbacktoAccount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileCustomObject3IdCustomFeedbacktoAccount_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RegistrationType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileRegistrationType(String value) {
        return new JAXBElement<String>(_OrganizationProfileRegistrationType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmployeesAtPrimaryAddress", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileEmployeesAtPrimaryAddress(String value) {
        return new JAXBElement<String>(_OrganizationProfileEmployeesAtPrimaryAddress_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SICCodeType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileSICCodeType(String value) {
        return new JAXBElement<String>(_OrganizationProfileSICCodeType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryLanguage", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryLanguage(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryLanguage_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrganizationSize", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOrganizationSize(String value) {
        return new JAXBElement<String>(_OrganizationProfileOrganizationSize_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSAccountType_cMeaning", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLSAccountTypeCMeaning(String value) {
        return new JAXBElement<String>(_OrganizationProfileLSAccountTypeCMeaning_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurrentFiscalYearPotentialRevenueAmount", scope = OrganizationProfile.class)
    public JAXBElement<AmountType> createOrganizationProfileCurrentFiscalYearPotentialRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OrganizationProfileCurrentFiscalYearPotentialRevenueAmount_QNAME, AmountType.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurcyConvRateType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCurcyConvRateType(String value) {
        return new JAXBElement<String>(_IncidentCCurcyConvRateType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Industry_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileIndustryC(String value) {
        return new JAXBElement<String>(_OrganizationProfileIndustryC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OfferSegment_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOfferSegmentC(String value) {
        return new JAXBElement<String>(_OrganizationProfileOfferSegmentC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrincipalTitle", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrincipalTitle(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrincipalTitle_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PublicPrivateOwnershipFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfilePublicPrivateOwnershipFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfilePublicPrivateOwnershipFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrincipalName", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrincipalName(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrincipalName_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "WomanOwnedInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileWomanOwnedInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileWomanOwnedInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RentOwnInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileRentOwnInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileRentOwnInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DisplayedDUNSPartyIdentifier", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfileDisplayedDUNSPartyIdentifier(Long value) {
        return new JAXBElement<Long>(_OrganizationProfileDisplayedDUNSPartyIdentifier_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressProvince", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressProvince(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressProvince_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredFunctionalCurrency", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredFunctionalCurrency_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "MissionStatement", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileMissionStatement(String value) {
        return new JAXBElement<String>(_OrganizationProfileMissionStatement_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "MinorityOwnedType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileMinorityOwnedType(String value) {
        return new JAXBElement<String>(_OrganizationProfileMinorityOwnedType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EnquiryDUNS", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileEnquiryDUNS(String value) {
        return new JAXBElement<String>(_OrganizationProfileEnquiryDUNS_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactFormattedPhoneNumber", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePreferredContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredContactFormattedPhoneNumber_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneExtension", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryPhoneExtension(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneExtension_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FiscalYearendMonth", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileFiscalYearendMonth(String value) {
        return new JAXBElement<String>(_OrganizationProfileFiscalYearendMonth_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Alias", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileAlias(String value) {
        return new JAXBElement<String>(_OrganizationProfileAlias_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ServiceCloudID_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileServiceCloudIDC(String value) {
        return new JAXBElement<String>(_OrganizationProfileServiceCloudIDC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TotalEmployeesEstimatedIndicator", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileTotalEmployeesEstimatedIndicator(String value) {
        return new JAXBElement<String>(_OrganizationProfileTotalEmployeesEstimatedIndicator_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Status", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileStatus(String value) {
        return new JAXBElement<String>(_FinancialReportStatus_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "BankOrBranchNumber", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileBankOrBranchNumber(String value) {
        return new JAXBElement<String>(_OrganizationProfileBankOrBranchNumber_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryURL", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryURL(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryURL_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Disadv8aInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileDisadv8AInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileDisadv8AInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSCallFrequency_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLSCallFrequencyC(String value) {
        return new JAXBElement<String>(_OrganizationProfileLSCallFrequencyC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneNumber", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneNumber_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CustomerIndustry_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCustomerIndustryC(String value) {
        return new JAXBElement<String>(_OrganizationProfileCustomerIndustryC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LineOfBusiness", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLineOfBusiness(String value) {
        return new JAXBElement<String>(_OrganizationProfileLineOfBusiness_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurrencyCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCurrencyCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "StockSymbol", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileStockSymbol(String value) {
        return new JAXBElement<String>(_OrganizationProfileStockSymbol_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "O_INT_JDE_Sync_Status_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileOINTJDESyncStatusC(String value) {
        return new JAXBElement<String>(_OrganizationProfileOINTJDESyncStatusC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LocalBusIdentifier", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLocalBusIdentifier(String value) {
        return new JAXBElement<String>(_OrganizationProfileLocalBusIdentifier_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "HQBranchIndicator", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileHQBranchIndicator(String value) {
        return new JAXBElement<String>(_OrganizationProfileHQBranchIndicator_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSRoute_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLSRouteC(String value) {
        return new JAXBElement<String>(_OrganizationProfileLSRouteC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "BankCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileBankCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileBankCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TotalEmployeesMinimumIndicator", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileTotalEmployeesMinimumIndicator(String value) {
        return new JAXBElement<String>(_OrganizationProfileTotalEmployeesMinimumIndicator_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneAreaCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneAreaCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactName", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePreferredContactName(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredContactName_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfilePrimaryPhoneId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePrimaryPhoneId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LSNumberOfPhysicians_c", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileLSNumberOfPhysiciansC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileLSNumberOfPhysiciansC_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DUNSNumberC", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileDUNSNumberC(String value) {
        return new JAXBElement<String>(_OrganizationProfileDUNSNumberC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ValidatedFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfileValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileValidatedFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactEmailAddress", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePreferredContactEmailAddress(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredContactEmailAddress_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Synch_c", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileSynchC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileSynchC_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JgzzFiscalCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileJgzzFiscalCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileJgzzFiscalCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "YearEstablished", scope = OrganizationProfile.class)
    public JAXBElement<Integer> createOrganizationProfileYearEstablished(Integer value) {
        return new JAXBElement<Integer>(_OrganizationProfileYearEstablished_QNAME, Integer.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "AnalysisFy", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileAnalysisFy(String value) {
        return new JAXBElement<String>(_OrganizationProfileAnalysisFy_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "GSAIndicatorFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfileGSAIndicatorFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileGSAIndicatorFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CongDistCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCongDistCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileCongDistCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "BranchCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileBranchCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileBranchCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressCountry", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressCountry(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressCountry_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "StrategicPlan_c", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileStrategicPlanC(String value) {
        return new JAXBElement<String>(_OrganizationProfileStrategicPlanC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SeblUserKeyLoc", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileSeblUserKeyLoc(String value) {
        return new JAXBElement<String>(_OrganizationProfileSeblUserKeyLoc_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LocalBusIdenType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLocalBusIdenType(String value) {
        return new JAXBElement<String>(_OrganizationProfileLocalBusIdenType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmployeesAtPrimaryAddressText", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileEmployeesAtPrimaryAddressText(String value) {
        return new JAXBElement<String>(_OrganizationProfileEmployeesAtPrimaryAddressText_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "BranchFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfileBranchFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileBranchFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryFormattedPhoneNumber", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryFormattedPhoneNumber_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TradingPartnerIdentifier", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileTradingPartnerIdentifier(String value) {
        return new JAXBElement<String>(_OrganizationProfileTradingPartnerIdentifier_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "GrowthStrategyDescription", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileGrowthStrategyDescription(String value) {
        return new JAXBElement<String>(_OrganizationProfileGrowthStrategyDescription_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Comments", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileComments(String value) {
        return new JAXBElement<String>(_OrganizationProfileComments_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "InternalFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfileInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileInternalFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SICCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileSICCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileSICCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CertReasonCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCertReasonCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileCertReasonCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryWebId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfilePrimaryWebId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePrimaryWebId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CorporationClass", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCorporationClass(String value) {
        return new JAXBElement<String>(_OrganizationProfileCorporationClass_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DbRating", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileDbRating(String value) {
        return new JAXBElement<String>(_OrganizationProfileDbRating_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressLine3", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressLine3(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressLine3_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressLine2", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressLine2(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressLine2_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressLine4", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressLine4(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressLine4_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "InstitutionType_cMeaning", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileInstitutionTypeCMeaning(String value) {
        return new JAXBElement<String>(_OrganizationProfileInstitutionTypeCMeaning_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressLine1", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressLine1(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressLine1_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmployeesAtPrimaryAddressMinimum", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileEmployeesAtPrimaryAddressMinimum(String value) {
        return new JAXBElement<String>(_OrganizationProfileEmployeesAtPrimaryAddressMinimum_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LocalActivityCodeType", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLocalActivityCodeType(String value) {
        return new JAXBElement<String>(_OrganizationProfileLocalActivityCodeType_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CeoName", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCeoName(String value) {
        return new JAXBElement<String>(_OrganizationProfileCeoName_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DomesticUltimateDUNSNumberC", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileDomesticUltimateDUNSNumberC(String value) {
        return new JAXBElement<String>(_OrganizationProfileDomesticUltimateDUNSNumberC_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryFormattedAddress", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryFormattedAddress(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryFormattedAddress_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressPostalCode", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressPostalCode(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressPostalCode_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SmallBusInd", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileSmallBusInd(String value) {
        return new JAXBElement<String>(_OrganizationProfileSmallBusInd_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "StrategicPlan_Id_c", scope = OrganizationProfile.class)
    public JAXBElement<BigDecimal> createOrganizationProfileStrategicPlanIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileStrategicPlanIdC_QNAME, BigDecimal.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateSourceSystem", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileLastUpdateSourceSystem(String value) {
        return new JAXBElement<String>(_OrganizationProfileLastUpdateSourceSystem_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Pronunciation", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePronunciation(String value) {
        return new JAXBElement<String>(_OrganizationProfilePronunciation_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactPersonId", scope = OrganizationProfile.class)
    public JAXBElement<Long> createOrganizationProfilePreferredContactPersonId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePreferredContactPersonId_QNAME, Long.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryAddressCity", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfilePrimaryAddressCity(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryAddressCity_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ThirdPartyFlag", scope = OrganizationProfile.class)
    public JAXBElement<Boolean> createOrganizationProfileThirdPartyFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileThirdPartyFlag_QNAME, Boolean.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CustomerType_cMeaning", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileCustomerTypeCMeaning(String value) {
        return new JAXBElement<String>(_OrganizationProfileCustomerTypeCMeaning_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "AccountPlanStatus_cMeaning", scope = OrganizationProfile.class)
    public JAXBElement<String> createOrganizationProfileAccountPlanStatusCMeaning(String value) {
        return new JAXBElement<String>(_OrganizationProfileAccountPlanStatusCMeaning_QNAME, String.class, OrganizationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = SWOTAnalysisC.class)
    public JAXBElement<Long> createSWOTAnalysisCRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IsOwner", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCIsOwner(String value) {
        return new JAXBElement<String>(_IncidentCIsOwner_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateDate", scope = SWOTAnalysisC.class)
    public JAXBElement<XMLGregorianCalendar> createSWOTAnalysisCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCLastUpdateDate_QNAME, XMLGregorianCalendar.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "UserLastUpdateDate", scope = SWOTAnalysisC.class)
    public JAXBElement<XMLGregorianCalendar> createSWOTAnalysisCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EntryType_cMeaning", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCEntryTypeCMeaning(String value) {
        return new JAXBElement<String>(_SWOTAnalysisCEntryTypeCMeaning_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JobDefinitionName", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCJobDefinitionName(String value) {
        return new JAXBElement<String>(_IncidentCJobDefinitionName_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SWOTEntry_c", scope = SWOTAnalysisC.class)
    public JAXBElement<byte[]> createSWOTAnalysisCSWOTEntryC(byte[] value) {
        return new JAXBElement<byte[]>(_SWOTAnalysisCSWOTEntryC_QNAME, byte[].class, SWOTAnalysisC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JobDefinitionPackage", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_IncidentCJobDefinitionPackage_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CorpCurrencyCode", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCorpCurrencyCode_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreatedBy", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCCreatedBy(String value) {
        return new JAXBElement<String>(_IncidentCCreatedBy_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfVerPillar", scope = SWOTAnalysisC.class)
    public JAXBElement<Integer> createSWOTAnalysisCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_IncidentCCpdrfVerPillar_QNAME, Integer.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EntryType_c", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCEntryTypeC(String value) {
        return new JAXBElement<String>(_SWOTAnalysisCEntryTypeC_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurcyConvRateType", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_IncidentCCurcyConvRateType_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrganizationProfile_Id_c", scope = SWOTAnalysisC.class)
    public JAXBElement<BigDecimal> createSWOTAnalysisCOrganizationProfileIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IncidentCOrganizationProfileIdC_QNAME, BigDecimal.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfVerSor", scope = SWOTAnalysisC.class)
    public JAXBElement<Integer> createSWOTAnalysisCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_IncidentCCpdrfVerSor_QNAME, Integer.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdatedBy", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdatedBy_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ObjectVersionNumber", scope = SWOTAnalysisC.class)
    public JAXBElement<BigDecimal> createSWOTAnalysisCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IncidentCObjectVersionNumber_QNAME, BigDecimal.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurrencyCode", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCCurrencyCode(String value) {
        return new JAXBElement<String>(_IncidentCCurrencyCode_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreationDate", scope = SWOTAnalysisC.class)
    public JAXBElement<XMLGregorianCalendar> createSWOTAnalysisCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentCCreationDate_QNAME, XMLGregorianCalendar.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CpdrfLastUpd", scope = SWOTAnalysisC.class)
    public JAXBElement<String> createSWOTAnalysisCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_IncidentCCpdrfLastUpd_QNAME, String.class, SWOTAnalysisC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "FiscalYearendMonth", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyFiscalYearendMonth(String value) {
        return new JAXBElement<String>(_OrganizationProfileFiscalYearendMonth_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "State", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyState(String value) {
        return new JAXBElement<String>(_OrganizationPartyState_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneExtension", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrimaryPhoneExtension(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneExtension_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SourceSystemReferenceValue", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartySourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_OrganizationPartySourceSystemReferenceValue_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "County", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCounty(String value) {
        return new JAXBElement<String>(_OrganizationPartyCounty_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PostalCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPostalCode(String value) {
        return new JAXBElement<String>(_OrganizationPartyPostalCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredNameId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyPreferredNameId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePreferredNameId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SourceSystem", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartySourceSystem(String value) {
        return new JAXBElement<String>(_OrganizationPartySourceSystem_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneCountryCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneCountryCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LastUpdateLogin", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyLastUpdateLogin(String value) {
        return new JAXBElement<String>(_IncidentCLastUpdateLogin_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactMethod", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPreferredContactMethod(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredContactMethod_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneNumber", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneNumber_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IdenAddrPartySiteId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyIdenAddrPartySiteId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfileIdenAddrPartySiteId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "City", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCity(String value) {
        return new JAXBElement<String>(_OrganizationPartyCity_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Province", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyProvince(String value) {
        return new JAXBElement<String>(_OrganizationPartyProvince_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "NextFyPotentialRevenueAmount", scope = OrganizationParty.class)
    public JAXBElement<AmountType> createOrganizationPartyNextFyPotentialRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OrganizationProfileNextFyPotentialRevenueAmount_QNAME, AmountType.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "HQBranchIndicator", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyHQBranchIndicator(String value) {
        return new JAXBElement<String>(_OrganizationProfileHQBranchIndicator_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryURLContactPointId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyPrimaryURLContactPointId(Long value) {
        return new JAXBElement<Long>(_OrganizationPartyPrimaryURLContactPointId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhonePurpose", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhonePurpose_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneAreaCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneAreaCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredName", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPreferredName(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredName_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "URL", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyURL(String value) {
        return new JAXBElement<String>(_OrganizationPartyURL_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "DUNSNumberC", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyDUNSNumberC(String value) {
        return new JAXBElement<String>(_OrganizationProfileDUNSNumberC_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmployeesTotal", scope = OrganizationParty.class)
    public JAXBElement<BigDecimal> createOrganizationPartyEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrganizationProfileEmployeesTotal_QNAME, BigDecimal.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ValidatedFlag", scope = OrganizationParty.class)
    public JAXBElement<Boolean> createOrganizationPartyValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileValidatedFlag_QNAME, Boolean.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CertificationLevel", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCertificationLevel(String value) {
        return new JAXBElement<String>(_OrganizationProfileCertificationLevel_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "GroupType", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyGroupType(String value) {
        return new JAXBElement<String>(_OrganizationPartyGroupType_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "JgzzFiscalCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyJgzzFiscalCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileJgzzFiscalCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "YearEstablished", scope = OrganizationParty.class)
    public JAXBElement<Integer> createOrganizationPartyYearEstablished(Integer value) {
        return new JAXBElement<Integer>(_OrganizationProfileYearEstablished_QNAME, Integer.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "AnalysisFy", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyAnalysisFy(String value) {
        return new JAXBElement<String>(_OrganizationProfileAnalysisFy_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "GSAIndicatorFlag", scope = OrganizationParty.class)
    public JAXBElement<Boolean> createOrganizationPartyGSAIndicatorFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileGSAIndicatorFlag_QNAME, Boolean.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "RequestId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyRequestId(Long value) {
        return new JAXBElement<Long>(_IncidentCRequestId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "LanguageName", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyLanguageName(String value) {
        return new JAXBElement<String>(_OrganizationPartyLanguageName_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneLineType", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrimaryPhoneLineType(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrimaryPhoneLineType_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PersonSecondLastName", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPersonSecondLastName(String value) {
        return new JAXBElement<String>(_OrganizationPartyPersonSecondLastName_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "HomeCountry", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyHomeCountry(String value) {
        return new JAXBElement<String>(_OrganizationProfileHomeCountry_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "TradingPartnerIdentifier", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyTradingPartnerIdentifier(String value) {
        return new JAXBElement<String>(_OrganizationProfileTradingPartnerIdentifier_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryPhoneContactPointId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyPrimaryPhoneContactPointId(Long value) {
        return new JAXBElement<Long>(_OrganizationPartyPrimaryPhoneContactPointId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrimaryEmailContactPointId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyPrimaryEmailContactPointId(Long value) {
        return new JAXBElement<Long>(_OrganizationPartyPrimaryEmailContactPointId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SourceSystemUpdateDate", scope = OrganizationParty.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationPartySourceSystemUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationPartySourceSystemUpdateDate_QNAME, XMLGregorianCalendar.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CreatedByModule", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCreatedByModule(String value) {
        return new JAXBElement<String>(_FinancialReportCreatedByModule_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Comments", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyComments(String value) {
        return new JAXBElement<String>(_OrganizationProfileComments_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "InternalFlag", scope = OrganizationParty.class)
    public JAXBElement<Boolean> createOrganizationPartyInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileInternalFlag_QNAME, Boolean.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SICCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartySICCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileSICCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CertReasonCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCertReasonCode(String value) {
        return new JAXBElement<String>(_OrganizationProfileCertReasonCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Country", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCountry(String value) {
        return new JAXBElement<String>(_OrganizationPartyCountry_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "IdenAddrLocationId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyIdenAddrLocationId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfileIdenAddrLocationId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Address4", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyAddress4(String value) {
        return new JAXBElement<String>(_OrganizationPartyAddress4_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Address1", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyAddress1(String value) {
        return new JAXBElement<String>(_OrganizationPartyAddress1_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Address3", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyAddress3(String value) {
        return new JAXBElement<String>(_OrganizationPartyAddress3_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "Address2", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyAddress2(String value) {
        return new JAXBElement<String>(_OrganizationPartyAddress2_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "SICCodeType", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartySICCodeType(String value) {
        return new JAXBElement<String>(_OrganizationProfileSICCodeType_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "OrganizationSize", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyOrganizationSize(String value) {
        return new JAXBElement<String>(_OrganizationProfileOrganizationSize_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CeoName", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCeoName(String value) {
        return new JAXBElement<String>(_OrganizationProfileCeoName_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CurrentFiscalYearPotentialRevenueAmount", scope = OrganizationParty.class)
    public JAXBElement<AmountType> createOrganizationPartyCurrentFiscalYearPotentialRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OrganizationProfileCurrentFiscalYearPotentialRevenueAmount_QNAME, AmountType.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "EmailAddress", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyEmailAddress(String value) {
        return new JAXBElement<String>(_OrganizationPartyEmailAddress_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredContactPersonId", scope = OrganizationParty.class)
    public JAXBElement<Long> createOrganizationPartyPreferredContactPersonId(Long value) {
        return new JAXBElement<Long>(_OrganizationProfilePreferredContactPersonId_QNAME, Long.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "CategoryCode", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyCategoryCode(String value) {
        return new JAXBElement<String>(_OrganizationPartyCategoryCode_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PrincipalName", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPrincipalName(String value) {
        return new JAXBElement<String>(_OrganizationProfilePrincipalName_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "ThirdPartyFlag", scope = OrganizationParty.class)
    public JAXBElement<Boolean> createOrganizationPartyThirdPartyFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationProfileThirdPartyFlag_QNAME, Boolean.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "PreferredFunctionalCurrency", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_OrganizationProfilePreferredFunctionalCurrency_QNAME, String.class, OrganizationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", name = "MissionStatement", scope = OrganizationParty.class)
    public JAXBElement<String> createOrganizationPartyMissionStatement(String value) {
        return new JAXBElement<String>(_OrganizationProfileMissionStatement_QNAME, String.class, OrganizationParty.class, value);
    }

}
