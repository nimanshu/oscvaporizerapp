
package com.oracle.xmlns.apps.cdm.foundation.parties.personservice;

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
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.personservice package. 
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

    private final static QName _PersonProfile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "personProfile");
    private final static QName _Education_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "education");
    private final static QName _Citizenship_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "citizenship");
    private final static QName _PersonInterest_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "personInterest");
    private final static QName _PersonResult_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "personResult");
    private final static QName _EmploymentHistory_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "employmentHistory");
    private final static QName _AdditionalPersonName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "additionalPersonName");
    private final static QName _WorkClass_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "workClass");
    private final static QName _Person_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "person");
    private final static QName _PersonInterestTeam_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Team");
    private final static QName _PersonInterestSince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Since");
    private final static QName _PersonInterestLevelOfParticipation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LevelOfParticipation");
    private final static QName _PersonInterestInterestTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "InterestTypeCode");
    private final static QName _PersonInterestLevelOfInterest_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LevelOfInterest");
    private final static QName _PersonInterestCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CreatedByModule");
    private final static QName _PersonInterestLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastUpdateLogin");
    private final static QName _PersonInterestRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RequestId");
    private final static QName _PersonInterestSubInterestTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SubInterestTypeCode");
    private final static QName _PersonInterestStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Status");
    private final static QName _PersonInterestSportIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SportIndicator");
    private final static QName _PersonInterestComments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Comments");
    private final static QName _AdditionalPersonNamePersonTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonTitle");
    private final static QName _AdditionalPersonNamePersonLastNamePrefix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonLastNamePrefix");
    private final static QName _AdditionalPersonNameOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OrigSystemReference");
    private final static QName _AdditionalPersonNamePersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonFirstName");
    private final static QName _AdditionalPersonNamePersonNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonNameSuffix");
    private final static QName _AdditionalPersonNamePersonMiddleName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonMiddleName");
    private final static QName _AdditionalPersonNamePartyName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PartyName");
    private final static QName _AdditionalPersonNamePersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonLastName");
    private final static QName _AdditionalPersonNamePreferredFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredFlag");
    private final static QName _AdditionalPersonNameOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OrigSystem");
    private final static QName _AdditionalPersonNameTransliterationLang_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TransliterationLang");
    private final static QName _AdditionalPersonNamePersonAcademicTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonAcademicTitle");
    private final static QName _AdditionalPersonNamePersonSecondLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonSecondLastName");
    private final static QName _AdditionalPersonNameOverallPreferredFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OverallPreferredFlag");
    private final static QName _AdditionalPersonNamePersonPreNameAdjunct_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonPreNameAdjunct");
    private final static QName _AdditionalPersonNameDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Description");
    private final static QName _AdditionalPersonNamePersonPreviousLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonPreviousLastName");
    private final static QName _CitizenshipDocumentReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DocumentReference");
    private final static QName _CitizenshipBirthOrSelected_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "BirthOrSelected");
    private final static QName _CitizenshipDocumentType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DocumentType");
    private final static QName _CitizenshipDateRecognized_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateRecognized");
    private final static QName _CitizenshipDateDisowned_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateDisowned");
    private final static QName _CitizenshipEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EndDate");
    private final static QName _EmploymentHistorySupervisorName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SupervisorName");
    private final static QName _EmploymentHistoryEmployedAsTitleCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedAsTitleCode");
    private final static QName _EmploymentHistoryFractionOfTenure_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FractionOfTenure");
    private final static QName _EmploymentHistoryServed_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Served");
    private final static QName _EmploymentHistoryStation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Station");
    private final static QName _EmploymentHistoryEmployedAsTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedAsTitle");
    private final static QName _EmploymentHistoryEmployedByDivisionName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedByDivisionName");
    private final static QName _EmploymentHistoryEmploymentTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmploymentTypeCode");
    private final static QName _EmploymentHistoryReasonForLeaving_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ReasonForLeaving");
    private final static QName _EmploymentHistoryResponsibility_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Responsibility");
    private final static QName _EmploymentHistoryEmployedByNameCompany_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedByNameCompany");
    private final static QName _EmploymentHistoryWeeklyWorkHours_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "WeeklyWorkHours");
    private final static QName _EmploymentHistoryTenureCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TenureCode");
    private final static QName _EmploymentHistoryFacultyPositionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FacultyPositionFlag");
    private final static QName _EmploymentHistoryEmployedByPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedByPartyId");
    private final static QName _EmploymentHistoryBranch_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Branch");
    private final static QName _EmploymentHistoryMilitaryRank_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MilitaryRank");
    private final static QName _EmploymentHistoryBeginDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "BeginDate");
    private final static QName _WorkClassLevelOfExperience_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LevelOfExperience");
    private final static QName _PersonProfileJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "JobTitle");
    private final static QName _PersonProfileOpportunityStatusCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OpportunityStatus_cMeaning");
    private final static QName _PersonProfileLTDGiftsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LTDGifts_cCurcyConvRate");
    private final static QName _PersonProfilePersonalIncomeAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonalIncomeAmount");
    private final static QName _PersonProfileCurrentAcademicYearCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrentAcademicYear_cMeaning");
    private final static QName _PersonProfileJobTitleCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "JobTitleCode");
    private final static QName _PersonProfileDoNotMailFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DoNotMailFlag");
    private final static QName _PersonProfileOpportunityStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OpportunityStatus_c");
    private final static QName _PersonProfileAlias_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Alias");
    private final static QName _PersonProfilePrimaryPhoneExtension_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneExtension");
    private final static QName _PersonProfileCommerceProfileIDC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CommerceProfileID_c");
    private final static QName _PersonProfileConstituentTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ConstituentType_c");
    private final static QName _PersonProfileServiceCloudIDC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ServiceCloudID_c");
    private final static QName _PersonProfileCurrentSeasonTicketHolderC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrentSeasonTicketHolder_c");
    private final static QName _PersonProfileCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrencyCode");
    private final static QName _PersonProfileFavoriteContactFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FavoriteContactFlag");
    private final static QName _PersonProfilePlaceOfBirth_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PlaceOfBirth");
    private final static QName _PersonProfileRiskAssessmentScoreC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RiskAssessmentScore_c");
    private final static QName _PersonProfilePrimaryURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryURL");
    private final static QName _PersonProfileLSCallFrequencyC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSCallFrequency_c");
    private final static QName _PersonProfilePrimaryPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneNumber");
    private final static QName _PersonProfileSATScoreTextC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SATScoreText_c");
    private final static QName _PersonProfileGiftClubLevelCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "GiftClubLevel_cMeaning");
    private final static QName _PersonProfileDepartment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Department");
    private final static QName _PersonProfileValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ValidatedFlag");
    private final static QName _PersonProfileMaritalStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MaritalStatus");
    private final static QName _PersonProfileProductsInterestedC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ProductsInterested_c");
    private final static QName _PersonProfileLSRouteC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSRoute_c");
    private final static QName _PersonProfileProgramInterestC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ProgramInterest_c");
    private final static QName _PersonProfilePrimaryPhoneId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneId");
    private final static QName _PersonProfileLSSpecialtyCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSSpecialty_cMeaning");
    private final static QName _PersonProfilePreferredContactName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactName");
    private final static QName _PersonProfilePrimaryPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneAreaCode");
    private final static QName _PersonProfileTimeNowC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TimeNow_c");
    private final static QName _PersonProfileLSSpecialtyC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSSpecialty_c");
    private final static QName _PersonProfileLastGiftDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastGiftDate_c");
    private final static QName _PersonProfilePrimaryAddressCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressCountry");
    private final static QName _PersonProfileFinancialAidStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FinancialAidStatus_c");
    private final static QName _PersonProfileJgzzFiscalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "JgzzFiscalCode");
    private final static QName _PersonProfileSynchC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Synch_c");
    private final static QName _PersonProfileSalesAffinityCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SalesAffinityCode");
    private final static QName _PersonProfilePrimaryFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryFormattedPhoneNumber");
    private final static QName _PersonProfileCurrentSeasonTicketHolderCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrentSeasonTicketHolder_cMeaning");
    private final static QName _PersonProfileLastGiftValueC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastGiftValue_c");
    private final static QName _PersonProfileRatingTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RatingType_c");
    private final static QName _PersonProfileAwardsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Awards_c");
    private final static QName _PersonProfileSATScoreC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SATScore_c");
    private final static QName _PersonProfileGender_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Gender");
    private final static QName _PersonProfileDeclaredEthnicity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DeclaredEthnicity");
    private final static QName _PersonProfilePrimaryCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryCustomerId");
    private final static QName _PersonProfileTalkativenessC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Talkativeness_c");
    private final static QName _PersonProfileCertReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CertReasonCode");
    private final static QName _PersonProfileLastKnownGPS_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastKnownGPS");
    private final static QName _PersonProfileRatingTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RatingType_cMeaning");
    private final static QName _PersonProfileHighSchoolVisitDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HighSchoolVisitDate_c");
    private final static QName _PersonProfileDoNotContactFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DoNotContactFlag");
    private final static QName _PersonProfileManagerC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Manager_c");
    private final static QName _PersonProfilePrimaryWebId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryWebId");
    private final static QName _PersonProfilePrimaryCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryCustomerName");
    private final static QName _PersonProfileDistance_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Distance");
    private final static QName _PersonProfileCoreCourseCompletedC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CoreCourseCompleted_c");
    private final static QName _PersonProfileInternalFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "InternalFlag");
    private final static QName _PersonProfileDepartmentCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DepartmentCode");
    private final static QName _PersonProfilePreferredContactPhone_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactPhone");
    private final static QName _PersonProfilePrimaryFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryFormattedAddress");
    private final static QName _PersonProfileGraduationYearC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "GraduationYear_c");
    private final static QName _PersonProfilePrimaryAddressLine4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine4");
    private final static QName _PersonProfilePrimaryAddressLine3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine3");
    private final static QName _PersonProfilePrimaryAddressLine2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine2");
    private final static QName _PersonProfilePrimaryAddressLine1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine1");
    private final static QName _PersonProfilePreferredContactURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactURL");
    private final static QName _PersonProfileCurrentAcademicYearC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrentAcademicYear_c");
    private final static QName _PersonProfileLTDAthleticsGiftsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LTDAthleticsGifts_cCurrencyCode");
    private final static QName _PersonProfileCampusVisitDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CampusVisitDate_c");
    private final static QName _PersonProfilePreferredContactPersonId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactPersonId");
    private final static QName _PersonProfilePronunciation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Pronunciation");
    private final static QName _PersonProfileLastUpdateSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastUpdateSourceSystem");
    private final static QName _PersonProfilePrimaryAddressPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressPostalCode");
    private final static QName _PersonProfileConstituentTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ConstituentType_cMeaning");
    private final static QName _PersonProfilePrimaryAddressCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressCity");
    private final static QName _PersonProfileDoNotCallFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DoNotCallFlag");
    private final static QName _PersonProfileEmployeeNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployeeNumber_c");
    private final static QName _PersonProfileCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CorpCurrencyCode");
    private final static QName _PersonProfilePreferredNameId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredNameId");
    private final static QName _PersonProfilePrimaryPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneCountryCode");
    private final static QName _PersonProfileHouseholdIncomeAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HouseholdIncomeAmount");
    private final static QName _PersonProfileWeeklyStudyHoursC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "WeeklyStudyHours_c");
    private final static QName _PersonProfileACTScoreC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ACTScore_c");
    private final static QName _PersonProfileDataCloudStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DataCloudStatus");
    private final static QName _PersonProfileLastSourceUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastSourceUpdateDate");
    private final static QName _PersonProfilePersonInitials_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonInitials");
    private final static QName _PersonProfileAttendanceC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Attendance_c");
    private final static QName _PersonProfilePreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactMethod");
    private final static QName _PersonProfileEmployerC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Employer_c");
    private final static QName _PersonProfileUniqueNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "UniqueNameSuffix");
    private final static QName _PersonProfilePreferredContactEmail_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactEmail");
    private final static QName _PersonProfilePrimaryEmailId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryEmailId");
    private final static QName _PersonProfileProgramTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ProgramType_c");
    private final static QName _PersonProfileSuffixOverriddenFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SuffixOverriddenFlag");
    private final static QName _PersonProfileLastEnrichmentDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastEnrichmentDate");
    private final static QName _PersonProfileTwitterIDC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TwitterID_c");
    private final static QName _PersonProfilePrimaryCustomerRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryCustomerRelationshipId");
    private final static QName _PersonProfileAdviserNameC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "AdviserName_c");
    private final static QName _PersonProfileCLNOC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CLNO_c");
    private final static QName _PersonProfileLastCallDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastCallDate_c");
    private final static QName _PersonProfilePrimaryPhonePurpose_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhonePurpose");
    private final static QName _PersonProfilePrimaryEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryEmailAddress");
    private final static QName _PersonProfileLTDAthleticsGiftsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LTDAthleticsGifts_c");
    private final static QName _PersonProfileLSRouteCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSRoute_cMeaning");
    private final static QName _PersonProfileWeeklyStudyHoursCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "WeeklyStudyHours_cMeaning");
    private final static QName _PersonProfilePreferredName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredName");
    private final static QName _PersonProfileProgramTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ProgramType_cMeaning");
    private final static QName _PersonProfileCertificationLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CertificationLevel");
    private final static QName _PersonProfileLSContactTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSContactType_cMeaning");
    private final static QName _PersonProfileGiftClubLevelC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "GiftClubLevel_c");
    private final static QName _PersonProfileSalesBuyingRoleCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SalesBuyingRoleCode");
    private final static QName _PersonProfileStudentIDNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "StudentIDNumber_c");
    private final static QName _PersonProfilePrimaryAddressState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressState");
    private final static QName _PersonProfileProgramInterestCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ProgramInterest_cMeaning");
    private final static QName _PersonProfileLastAdvisingDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastAdvisingDate_c");
    private final static QName _PersonProfileCumulativeGPAC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CumulativeGPA_c");
    private final static QName _PersonProfileSynchErrorC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SynchError_c");
    private final static QName _PersonProfilePrimaryPhoneLineType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneLineType");
    private final static QName _PersonProfileMaritalStatusEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MaritalStatusEffectiveDate");
    private final static QName _PersonProfileCounselorMeetingDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CounselorMeetingDate_c");
    private final static QName _PersonProfileLastGiftValueCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastGiftValue_cCurrencyCode");
    private final static QName _PersonProfileDateOfBirth_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateOfBirth");
    private final static QName _PersonProfileCoreCourseCompletedCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CoreCourseCompleted_cMeaning");
    private final static QName _PersonProfileSalutation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Salutation");
    private final static QName _PersonProfileLSContactTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LSContactType_c");
    private final static QName _PersonProfileRatingDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RatingDate_c");
    private final static QName _PersonProfileEntryTermCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EntryTerm_cMeaning");
    private final static QName _PersonProfilePrimaryAddressLongitude_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLongitude");
    private final static QName _PersonProfileLTDAthleticsGiftsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LTDAthleticsGifts_cCurcyConvRate");
    private final static QName _PersonProfileRatingIndicatorC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RatingIndicator_c");
    private final static QName _PersonProfilePrimaryAddressCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressCounty");
    private final static QName _PersonProfileTestAttributeC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TestAttribute_c");
    private final static QName _PersonProfileAffiliationsCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Affiliations_cMeaning");
    private final static QName _PersonProfilePrimaryLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryLanguage");
    private final static QName _PersonProfileDoNotEmailFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DoNotEmailFlag");
    private final static QName _PersonProfileCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurcyConvRateType");
    private final static QName _PersonProfilePrimaryAddressLatitude_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLatitude");
    private final static QName _PersonProfileAffiliationsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Affiliations_c");
    private final static QName _PersonProfileHouseholdSize_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HouseholdSize");
    private final static QName _PersonProfileLTDGiftsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LTDGifts_cCurrencyCode");
    private final static QName _PersonProfilePreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredFunctionalCurrency");
    private final static QName _PersonProfilePrimaryAddressProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressProvince");
    private final static QName _PersonProfileLTDGiftsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LTDGifts_c");
    private final static QName _PersonProfileHeadOfHouseholdFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HeadOfHouseholdFlag");
    private final static QName _PersonProfileDateOfDeath_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateOfDeath");
    private final static QName _PersonProfileRentOwnInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RentOwnInd");
    private final static QName _PersonProfileSSNC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SSN_c");
    private final static QName _PersonProfileFinancialAidStatusCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FinancialAidStatus_cMeaning");
    private final static QName _PersonProfilePersonName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonName");
    private final static QName _PersonProfileEntryTermC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EntryTerm_c");
    private final static QName _PersonProfileLastGiftValueCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastGiftValue_cCurcyConvRate");
    private final static QName _PersonProfileLastContactDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastContactDate");
    private final static QName _EducationTypeOfSchool_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TypeOfSchool");
    private final static QName _EducationStartDateAttended_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "StartDateAttended");
    private final static QName _EducationCourseMajor_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CourseMajor");
    private final static QName _EducationSchoolPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SchoolPartyId");
    private final static QName _EducationSchoolAttendedName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SchoolAttendedName");
    private final static QName _EducationLastDateAttended_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastDateAttended");
    private final static QName _EducationDegreeReceived_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DegreeReceived");
    private final static QName _PersonSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SourceSystem");
    private final static QName _PersonState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "State");
    private final static QName _PersonSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SourceSystemReferenceValue");
    private final static QName _PersonCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "County");
    private final static QName _PersonPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PostalCode");
    private final static QName _PersonProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Province");
    private final static QName _PersonCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "City");
    private final static QName _PersonIdenAddrPartySiteId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "IdenAddrPartySiteId");
    private final static QName _PersonURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "URL");
    private final static QName _PersonPrimaryURLContactPTId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryURLContactPTId");
    private final static QName _PersonGSAIndicatorFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "GSAIndicatorFlag");
    private final static QName _PersonLanguageName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LanguageName");
    private final static QName _PersonCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Country");
    private final static QName _PersonAddress4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address4");
    private final static QName _PersonIdenAddrLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "IdenAddrLocationId");
    private final static QName _PersonSourceSystemUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SourceSystemUpdateDate");
    private final static QName _PersonSICCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SICCode");
    private final static QName _PersonPrimaryPhoneContactPTId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneContactPTId");
    private final static QName _PersonEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmailAddress");
    private final static QName _PersonPrimaryEmailContactPTId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryEmailContactPTId");
    private final static QName _PersonAddress3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address3");
    private final static QName _PersonAddress2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address2");
    private final static QName _PersonAddress1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address1");
    private final static QName _PersonSICCodeType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SICCodeType");
    private final static QName _PersonMissionStatement_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MissionStatement");
    private final static QName _PersonUserGUID_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "UserGUID");
    private final static QName _PersonThirdPartyFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ThirdPartyFlag");
    private final static QName _PersonCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CategoryCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.personservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonResult }
     * 
     */
    public PersonResult createPersonResult() {
        return new PersonResult();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PersonProfile }
     * 
     */
    public PersonProfile createPersonProfile() {
        return new PersonProfile();
    }

    /**
     * Create an instance of {@link EmploymentHistory }
     * 
     */
    public EmploymentHistory createEmploymentHistory() {
        return new EmploymentHistory();
    }

    /**
     * Create an instance of {@link PersonInterest }
     * 
     */
    public PersonInterest createPersonInterest() {
        return new PersonInterest();
    }

    /**
     * Create an instance of {@link Citizenship }
     * 
     */
    public Citizenship createCitizenship() {
        return new Citizenship();
    }

    /**
     * Create an instance of {@link WorkClass }
     * 
     */
    public WorkClass createWorkClass() {
        return new WorkClass();
    }

    /**
     * Create an instance of {@link Education }
     * 
     */
    public Education createEducation() {
        return new Education();
    }

    /**
     * Create an instance of {@link AdditionalPersonName }
     * 
     */
    public AdditionalPersonName createAdditionalPersonName() {
        return new AdditionalPersonName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "personProfile")
    public JAXBElement<PersonProfile> createPersonProfile(PersonProfile value) {
        return new JAXBElement<PersonProfile>(_PersonProfile_QNAME, PersonProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Education }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "education")
    public JAXBElement<Education> createEducation(Education value) {
        return new JAXBElement<Education>(_Education_QNAME, Education.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citizenship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "citizenship")
    public JAXBElement<Citizenship> createCitizenship(Citizenship value) {
        return new JAXBElement<Citizenship>(_Citizenship_QNAME, Citizenship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInterest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "personInterest")
    public JAXBElement<PersonInterest> createPersonInterest(PersonInterest value) {
        return new JAXBElement<PersonInterest>(_PersonInterest_QNAME, PersonInterest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "personResult")
    public JAXBElement<PersonResult> createPersonResult(PersonResult value) {
        return new JAXBElement<PersonResult>(_PersonResult_QNAME, PersonResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmploymentHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "employmentHistory")
    public JAXBElement<EmploymentHistory> createEmploymentHistory(EmploymentHistory value) {
        return new JAXBElement<EmploymentHistory>(_EmploymentHistory_QNAME, EmploymentHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalPersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "additionalPersonName")
    public JAXBElement<AdditionalPersonName> createAdditionalPersonName(AdditionalPersonName value) {
        return new JAXBElement<AdditionalPersonName>(_AdditionalPersonName_QNAME, AdditionalPersonName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "workClass")
    public JAXBElement<WorkClass> createWorkClass(WorkClass value) {
        return new JAXBElement<WorkClass>(_WorkClass_QNAME, WorkClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Team", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestTeam(String value) {
        return new JAXBElement<String>(_PersonInterestTeam_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Since", scope = PersonInterest.class)
    public JAXBElement<XMLGregorianCalendar> createPersonInterestSince(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonInterestSince_QNAME, XMLGregorianCalendar.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LevelOfParticipation", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestLevelOfParticipation(String value) {
        return new JAXBElement<String>(_PersonInterestLevelOfParticipation_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InterestTypeCode", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestInterestTypeCode(String value) {
        return new JAXBElement<String>(_PersonInterestInterestTypeCode_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LevelOfInterest", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestLevelOfInterest(String value) {
        return new JAXBElement<String>(_PersonInterestLevelOfInterest_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonInterestCreatedByModule_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = PersonInterest.class)
    public JAXBElement<Long> createPersonInterestRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SubInterestTypeCode", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestSubInterestTypeCode(String value) {
        return new JAXBElement<String>(_PersonInterestSubInterestTypeCode_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestStatus(String value) {
        return new JAXBElement<String>(_PersonInterestStatus_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SportIndicator", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestSportIndicator(String value) {
        return new JAXBElement<String>(_PersonInterestSportIndicator_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestComments(String value) {
        return new JAXBElement<String>(_PersonInterestComments_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonTitle", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonTitle(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonTitle_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastNamePrefix", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonLastNamePrefix(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonLastNamePrefix_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystemReference", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameOrigSystemReference(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameOrigSystemReference_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonFirstName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonFirstName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonFirstName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = AdditionalPersonName.class)
    public JAXBElement<Long> createAdditionalPersonNameRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonNameSuffix", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonNameSuffix(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonNameSuffix_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonMiddleName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonMiddleName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonMiddleName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PartyName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePartyName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePartyName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonLastName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredFlag", scope = AdditionalPersonName.class)
    public JAXBElement<Boolean> createAdditionalPersonNamePreferredFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AdditionalPersonNamePreferredFlag_QNAME, Boolean.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystem", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameOrigSystem(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameOrigSystem_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TransliterationLang", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameTransliterationLang(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameTransliterationLang_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonAcademicTitle", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonAcademicTitle(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonAcademicTitle_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonSecondLastName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonSecondLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonSecondLastName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OverallPreferredFlag", scope = AdditionalPersonName.class)
    public JAXBElement<Boolean> createAdditionalPersonNameOverallPreferredFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AdditionalPersonNameOverallPreferredFlag_QNAME, Boolean.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreNameAdjunct", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonPreNameAdjunct(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonPreNameAdjunct_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Description", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameDescription(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameDescription_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreviousLastName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonPreviousLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonPreviousLastName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DocumentReference", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipDocumentReference(String value) {
        return new JAXBElement<String>(_CitizenshipDocumentReference_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "BirthOrSelected", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipBirthOrSelected(String value) {
        return new JAXBElement<String>(_CitizenshipBirthOrSelected_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DocumentType", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipDocumentType(String value) {
        return new JAXBElement<String>(_CitizenshipDocumentType_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateRecognized", scope = Citizenship.class)
    public JAXBElement<XMLGregorianCalendar> createCitizenshipDateRecognized(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipDateRecognized_QNAME, XMLGregorianCalendar.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateDisowned", scope = Citizenship.class)
    public JAXBElement<XMLGregorianCalendar> createCitizenshipDateDisowned(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipDateDisowned_QNAME, XMLGregorianCalendar.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonInterestCreatedByModule_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = Citizenship.class)
    public JAXBElement<Long> createCitizenshipRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipStatus(String value) {
        return new JAXBElement<String>(_PersonInterestStatus_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EndDate", scope = Citizenship.class)
    public JAXBElement<XMLGregorianCalendar> createCitizenshipEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipEndDate_QNAME, XMLGregorianCalendar.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SupervisorName", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistorySupervisorName(String value) {
        return new JAXBElement<String>(_EmploymentHistorySupervisorName_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedAsTitleCode", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedAsTitleCode(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedAsTitleCode_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FractionOfTenure", scope = EmploymentHistory.class)
    public JAXBElement<BigDecimal> createEmploymentHistoryFractionOfTenure(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmploymentHistoryFractionOfTenure_QNAME, BigDecimal.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Served", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryServed(String value) {
        return new JAXBElement<String>(_EmploymentHistoryServed_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = EmploymentHistory.class)
    public JAXBElement<Long> createEmploymentHistoryRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Station", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryStation(String value) {
        return new JAXBElement<String>(_EmploymentHistoryStation_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryStatus(String value) {
        return new JAXBElement<String>(_PersonInterestStatus_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedAsTitle", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedAsTitle(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedAsTitle_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EndDate", scope = EmploymentHistory.class)
    public JAXBElement<XMLGregorianCalendar> createEmploymentHistoryEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipEndDate_QNAME, XMLGregorianCalendar.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedByDivisionName", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedByDivisionName(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedByDivisionName_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmploymentTypeCode", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmploymentTypeCode(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmploymentTypeCode_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonInterestCreatedByModule_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ReasonForLeaving", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryReasonForLeaving(String value) {
        return new JAXBElement<String>(_EmploymentHistoryReasonForLeaving_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Responsibility", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryResponsibility(String value) {
        return new JAXBElement<String>(_EmploymentHistoryResponsibility_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedByNameCompany", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedByNameCompany(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedByNameCompany_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "WeeklyWorkHours", scope = EmploymentHistory.class)
    public JAXBElement<BigDecimal> createEmploymentHistoryWeeklyWorkHours(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmploymentHistoryWeeklyWorkHours_QNAME, BigDecimal.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TenureCode", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryTenureCode(String value) {
        return new JAXBElement<String>(_EmploymentHistoryTenureCode_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FacultyPositionFlag", scope = EmploymentHistory.class)
    public JAXBElement<Boolean> createEmploymentHistoryFacultyPositionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_EmploymentHistoryFacultyPositionFlag_QNAME, Boolean.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryComments(String value) {
        return new JAXBElement<String>(_PersonInterestComments_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedByPartyId", scope = EmploymentHistory.class)
    public JAXBElement<Long> createEmploymentHistoryEmployedByPartyId(Long value) {
        return new JAXBElement<Long>(_EmploymentHistoryEmployedByPartyId_QNAME, Long.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Branch", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryBranch(String value) {
        return new JAXBElement<String>(_EmploymentHistoryBranch_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MilitaryRank", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryMilitaryRank(String value) {
        return new JAXBElement<String>(_EmploymentHistoryMilitaryRank_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "BeginDate", scope = EmploymentHistory.class)
    public JAXBElement<XMLGregorianCalendar> createEmploymentHistoryBeginDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmploymentHistoryBeginDate_QNAME, XMLGregorianCalendar.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonInterestCreatedByModule_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = WorkClass.class)
    public JAXBElement<Long> createWorkClassRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassStatus(String value) {
        return new JAXBElement<String>(_PersonInterestStatus_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LevelOfExperience", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassLevelOfExperience(String value) {
        return new JAXBElement<String>(_WorkClassLevelOfExperience_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JobTitle", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileJobTitle(String value) {
        return new JAXBElement<String>(_PersonProfileJobTitle_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OpportunityStatus_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileOpportunityStatusCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileOpportunityStatusCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LTDGifts_cCurcyConvRate", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileLTDGiftsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileLTDGiftsCCurcyConvRate_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonalIncomeAmount", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfilePersonalIncomeAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfilePersonalIncomeAmount_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrentAcademicYear_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurrentAcademicYearCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileCurrentAcademicYearCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JobTitleCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileJobTitleCode(String value) {
        return new JAXBElement<String>(_PersonProfileJobTitleCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DoNotMailFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileDoNotMailFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileDoNotMailFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OpportunityStatus_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileOpportunityStatusC(String value) {
        return new JAXBElement<String>(_PersonProfileOpportunityStatusC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Alias", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileAlias(String value) {
        return new JAXBElement<String>(_PersonProfileAlias_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneExtension", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneExtension(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneExtension_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CommerceProfileID_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCommerceProfileIDC(String value) {
        return new JAXBElement<String>(_PersonProfileCommerceProfileIDC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ConstituentType_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileConstituentTypeC(String value) {
        return new JAXBElement<String>(_PersonProfileConstituentTypeC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileStatus(String value) {
        return new JAXBElement<String>(_PersonInterestStatus_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ServiceCloudID_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileServiceCloudIDC(String value) {
        return new JAXBElement<String>(_PersonProfileServiceCloudIDC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrentSeasonTicketHolder_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurrentSeasonTicketHolderC(String value) {
        return new JAXBElement<String>(_PersonProfileCurrentSeasonTicketHolderC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FavoriteContactFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileFavoriteContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileFavoriteContactFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PlaceOfBirth", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePlaceOfBirth(String value) {
        return new JAXBElement<String>(_PersonProfilePlaceOfBirth_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RiskAssessmentScore_c", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileRiskAssessmentScoreC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileRiskAssessmentScoreC_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryURL", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryURL(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryURL_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSCallFrequency_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSCallFrequencyC(String value) {
        return new JAXBElement<String>(_PersonProfileLSCallFrequencyC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneNumber", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneNumber_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SATScoreText_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSATScoreTextC(String value) {
        return new JAXBElement<String>(_PersonProfileSATScoreTextC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "GiftClubLevel_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileGiftClubLevelCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileGiftClubLevelCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Department", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileDepartment(String value) {
        return new JAXBElement<String>(_PersonProfileDepartment_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ValidatedFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileValidatedFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MaritalStatus", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileMaritalStatus(String value) {
        return new JAXBElement<String>(_PersonProfileMaritalStatus_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ProductsInterested_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileProductsInterestedC(String value) {
        return new JAXBElement<String>(_PersonProfileProductsInterestedC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSRoute_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSRouteC(String value) {
        return new JAXBElement<String>(_PersonProfileLSRouteC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ProgramInterest_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileProgramInterestC(String value) {
        return new JAXBElement<String>(_PersonProfileProgramInterestC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryPhoneId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryPhoneId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSSpecialty_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSSpecialtyCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileLSSpecialtyCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactName(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneAreaCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneAreaCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TimeNow_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileTimeNowC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileTimeNowC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSSpecialty_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSSpecialtyC(String value) {
        return new JAXBElement<String>(_PersonProfileLSSpecialtyC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastGiftDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileLastGiftDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileLastGiftDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressCountry", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressCountry(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressCountry_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FinancialAidStatus_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileFinancialAidStatusC(String value) {
        return new JAXBElement<String>(_PersonProfileFinancialAidStatusC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JgzzFiscalCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileJgzzFiscalCode(String value) {
        return new JAXBElement<String>(_PersonProfileJgzzFiscalCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Synch_c", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileSynchC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileSynchC_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SalesAffinityCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSalesAffinityCode(String value) {
        return new JAXBElement<String>(_PersonProfileSalesAffinityCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryFormattedPhoneNumber", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryFormattedPhoneNumber_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrentSeasonTicketHolder_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurrentSeasonTicketHolderCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileCurrentSeasonTicketHolderCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastGiftValue_c", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfileLastGiftValueC(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfileLastGiftValueC_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RatingType_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileRatingTypeC(String value) {
        return new JAXBElement<String>(_PersonProfileRatingTypeC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Awards_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileAwardsC(String value) {
        return new JAXBElement<String>(_PersonProfileAwardsC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SATScore_c", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileSATScoreC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileSATScoreC_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Gender", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileGender(String value) {
        return new JAXBElement<String>(_PersonProfileGender_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DeclaredEthnicity", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileDeclaredEthnicity(String value) {
        return new JAXBElement<String>(_PersonProfileDeclaredEthnicity_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryCustomerId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryCustomerId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryCustomerId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonMiddleName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonMiddleName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonMiddleName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Talkativeness_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileTalkativenessC(String value) {
        return new JAXBElement<String>(_PersonProfileTalkativenessC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertReasonCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCertReasonCode(String value) {
        return new JAXBElement<String>(_PersonProfileCertReasonCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastKnownGPS", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLastKnownGPS(String value) {
        return new JAXBElement<String>(_PersonProfileLastKnownGPS_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RatingType_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileRatingTypeCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileRatingTypeCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HighSchoolVisitDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileHighSchoolVisitDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileHighSchoolVisitDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DoNotContactFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileDoNotContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileDoNotContactFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Manager_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileManagerC(String value) {
        return new JAXBElement<String>(_PersonProfileManagerC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryWebId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryWebId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryWebId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryCustomerName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryCustomerName(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryCustomerName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonSecondLastName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonSecondLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonSecondLastName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Distance", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileDistance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileDistance_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CoreCourseCompleted_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCoreCourseCompletedC(String value) {
        return new JAXBElement<String>(_PersonProfileCoreCourseCompletedC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileComments(String value) {
        return new JAXBElement<String>(_PersonInterestComments_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InternalFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileInternalFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DepartmentCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileDepartmentCode(String value) {
        return new JAXBElement<String>(_PersonProfileDepartmentCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactPhone", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactPhone(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactPhone_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryFormattedAddress", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryFormattedAddress(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryFormattedAddress_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "GraduationYear_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileGraduationYearC(String value) {
        return new JAXBElement<String>(_PersonProfileGraduationYearC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine4", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine4(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine4_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine3", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine3(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine3_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine2", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine2(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine2_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine1", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine1(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine1_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactURL", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactURL(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactURL_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrentAcademicYear_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurrentAcademicYearC(String value) {
        return new JAXBElement<String>(_PersonProfileCurrentAcademicYearC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LTDAthleticsGifts_cCurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLTDAthleticsGiftsCCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileLTDAthleticsGiftsCCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CampusVisitDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileCampusVisitDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileCampusVisitDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactPersonId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePreferredContactPersonId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePreferredContactPersonId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Pronunciation", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePronunciation(String value) {
        return new JAXBElement<String>(_PersonProfilePronunciation_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateSourceSystem", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLastUpdateSourceSystem(String value) {
        return new JAXBElement<String>(_PersonProfileLastUpdateSourceSystem_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressPostalCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressPostalCode(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressPostalCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ConstituentType_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileConstituentTypeCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileConstituentTypeCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressCity", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressCity(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressCity_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DoNotCallFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileDoNotCallFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileDoNotCallFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployeeNumber_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileEmployeeNumberC(String value) {
        return new JAXBElement<String>(_PersonProfileEmployeeNumberC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CorpCurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileCorpCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredNameId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePreferredNameId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePreferredNameId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneCountryCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneCountryCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HouseholdIncomeAmount", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfileHouseholdIncomeAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfileHouseholdIncomeAmount_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "WeeklyStudyHours_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileWeeklyStudyHoursC(String value) {
        return new JAXBElement<String>(_PersonProfileWeeklyStudyHoursC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ACTScore_c", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileACTScoreC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileACTScoreC_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DataCloudStatus", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileDataCloudStatus(String value) {
        return new JAXBElement<String>(_PersonProfileDataCloudStatus_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastSourceUpdateDate", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileLastSourceUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileLastSourceUpdateDate_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonInitials", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonInitials(String value) {
        return new JAXBElement<String>(_PersonProfilePersonInitials_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Attendance_c", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileAttendanceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileAttendanceC_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactMethod", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactMethod(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactMethod_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Employer_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileEmployerC(String value) {
        return new JAXBElement<String>(_PersonProfileEmployerC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "UniqueNameSuffix", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileUniqueNameSuffix(String value) {
        return new JAXBElement<String>(_PersonProfileUniqueNameSuffix_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactEmail", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactEmail(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactEmail_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryEmailId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryEmailId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryEmailId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ProgramType_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileProgramTypeC(String value) {
        return new JAXBElement<String>(_PersonProfileProgramTypeC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SuffixOverriddenFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileSuffixOverriddenFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileSuffixOverriddenFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastEnrichmentDate", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileLastEnrichmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileLastEnrichmentDate_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TwitterID_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileTwitterIDC(String value) {
        return new JAXBElement<String>(_PersonProfileTwitterIDC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryCustomerRelationshipId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryCustomerRelationshipId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryCustomerRelationshipId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "AdviserName_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileAdviserNameC(String value) {
        return new JAXBElement<String>(_PersonProfileAdviserNameC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CLNO_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCLNOC(String value) {
        return new JAXBElement<String>(_PersonProfileCLNOC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastCallDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileLastCallDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileLastCallDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhonePurpose", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhonePurpose_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryEmailAddress", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryEmailAddress(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryEmailAddress_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LTDAthleticsGifts_c", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfileLTDAthleticsGiftsC(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfileLTDAthleticsGiftsC_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSRoute_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSRouteCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileLSRouteCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "WeeklyStudyHours_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileWeeklyStudyHoursCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileWeeklyStudyHoursCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredName(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ProgramType_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileProgramTypeCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileProgramTypeCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertificationLevel", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCertificationLevel(String value) {
        return new JAXBElement<String>(_PersonProfileCertificationLevel_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystem", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileOrigSystem(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameOrigSystem_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSContactType_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSContactTypeCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileLSContactTypeCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonAcademicTitle", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonAcademicTitle(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonAcademicTitle_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "GiftClubLevel_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileGiftClubLevelC(String value) {
        return new JAXBElement<String>(_PersonProfileGiftClubLevelC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SalesBuyingRoleCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSalesBuyingRoleCode(String value) {
        return new JAXBElement<String>(_PersonProfileSalesBuyingRoleCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreNameAdjunct", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonPreNameAdjunct(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonPreNameAdjunct_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "StudentIDNumber_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileStudentIDNumberC(String value) {
        return new JAXBElement<String>(_PersonProfileStudentIDNumberC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressState", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressState(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressState_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ProgramInterest_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileProgramInterestCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileProgramInterestCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastAdvisingDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileLastAdvisingDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileLastAdvisingDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CumulativeGPA_c", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileCumulativeGPAC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileCumulativeGPAC_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SynchError_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSynchErrorC(String value) {
        return new JAXBElement<String>(_PersonProfileSynchErrorC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneLineType", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneLineType(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneLineType_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastNamePrefix", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonLastNamePrefix(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonLastNamePrefix_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MaritalStatusEffectiveDate", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileMaritalStatusEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileMaritalStatusEffectiveDate_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CounselorMeetingDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileCounselorMeetingDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileCounselorMeetingDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystemReference", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileOrigSystemReference(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameOrigSystemReference_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastGiftValue_cCurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLastGiftValueCCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileLastGiftValueCCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfileRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonNameSuffix", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonNameSuffix(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonNameSuffix_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateOfBirth", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileDateOfBirth_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CoreCourseCompleted_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCoreCourseCompletedCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileCoreCourseCompletedCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Salutation", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSalutation(String value) {
        return new JAXBElement<String>(_PersonProfileSalutation_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LSContactType_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLSContactTypeC(String value) {
        return new JAXBElement<String>(_PersonProfileLSContactTypeC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RatingDate_c", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileRatingDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileRatingDateC_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EntryTerm_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileEntryTermCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileEntryTermCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLongitude", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfilePrimaryAddressLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfilePrimaryAddressLongitude_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LTDAthleticsGifts_cCurcyConvRate", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileLTDAthleticsGiftsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileLTDAthleticsGiftsCCurcyConvRate_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RatingIndicator_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileRatingIndicatorC(String value) {
        return new JAXBElement<String>(_PersonProfileRatingIndicatorC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressCounty", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressCounty(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressCounty_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreviousLastName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonPreviousLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonPreviousLastName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TestAttribute_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileTestAttributeC(String value) {
        return new JAXBElement<String>(_PersonProfileTestAttributeC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Affiliations_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileAffiliationsCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileAffiliationsCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonTitle", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonTitle(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonTitle_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryLanguage", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryLanguage(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryLanguage_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DoNotEmailFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileDoNotEmailFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileDoNotEmailFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurcyConvRateType", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PersonProfileCurcyConvRateType_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLatitude", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfilePrimaryAddressLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfilePrimaryAddressLatitude_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonFirstName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonFirstName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonFirstName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Affiliations_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileAffiliationsC(String value) {
        return new JAXBElement<String>(_PersonProfileAffiliationsC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HouseholdSize", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileHouseholdSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileHouseholdSize_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LTDGifts_cCurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLTDGiftsCCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileLTDGiftsCCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredFunctionalCurrency", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredFunctionalCurrency_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressProvince", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressProvince(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressProvince_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LTDGifts_c", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfileLTDGiftsC(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfileLTDGiftsC_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HeadOfHouseholdFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileHeadOfHouseholdFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileHeadOfHouseholdFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonLastName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateOfDeath", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileDateOfDeath(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileDateOfDeath_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RentOwnInd", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileRentOwnInd(String value) {
        return new JAXBElement<String>(_PersonProfileRentOwnInd_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SSN_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSSNC(String value) {
        return new JAXBElement<String>(_PersonProfileSSNC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FinancialAidStatus_cMeaning", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileFinancialAidStatusCMeaning(String value) {
        return new JAXBElement<String>(_PersonProfileFinancialAidStatusCMeaning_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonName(String value) {
        return new JAXBElement<String>(_PersonProfilePersonName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EntryTerm_c", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileEntryTermC(String value) {
        return new JAXBElement<String>(_PersonProfileEntryTermC_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastGiftValue_cCurcyConvRate", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileLastGiftValueCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileLastGiftValueCCurcyConvRate_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastContactDate", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileLastContactDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileLastContactDate_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TypeOfSchool", scope = Education.class)
    public JAXBElement<String> createEducationTypeOfSchool(String value) {
        return new JAXBElement<String>(_EducationTypeOfSchool_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "StartDateAttended", scope = Education.class)
    public JAXBElement<XMLGregorianCalendar> createEducationStartDateAttended(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EducationStartDateAttended_QNAME, XMLGregorianCalendar.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CourseMajor", scope = Education.class)
    public JAXBElement<String> createEducationCourseMajor(String value) {
        return new JAXBElement<String>(_EducationCourseMajor_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = Education.class)
    public JAXBElement<String> createEducationCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonInterestCreatedByModule_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SchoolPartyId", scope = Education.class)
    public JAXBElement<Long> createEducationSchoolPartyId(Long value) {
        return new JAXBElement<Long>(_EducationSchoolPartyId_QNAME, Long.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SchoolAttendedName", scope = Education.class)
    public JAXBElement<String> createEducationSchoolAttendedName(String value) {
        return new JAXBElement<String>(_EducationSchoolAttendedName_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastDateAttended", scope = Education.class)
    public JAXBElement<XMLGregorianCalendar> createEducationLastDateAttended(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EducationLastDateAttended_QNAME, XMLGregorianCalendar.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = Education.class)
    public JAXBElement<String> createEducationLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = Education.class)
    public JAXBElement<Long> createEducationRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = Education.class)
    public JAXBElement<String> createEducationStatus(String value) {
        return new JAXBElement<String>(_PersonInterestStatus_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DegreeReceived", scope = Education.class)
    public JAXBElement<String> createEducationDegreeReceived(String value) {
        return new JAXBElement<String>(_EducationDegreeReceived_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredNameId", scope = Person.class)
    public JAXBElement<Long> createPersonPreferredNameId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePreferredNameId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SourceSystem", scope = Person.class)
    public JAXBElement<String> createPersonSourceSystem(String value) {
        return new JAXBElement<String>(_PersonSourceSystem_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneCountryCode", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneCountryCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "State", scope = Person.class)
    public JAXBElement<String> createPersonState(String value) {
        return new JAXBElement<String>(_PersonState_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneExtension", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneExtension(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneExtension_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SourceSystemReferenceValue", scope = Person.class)
    public JAXBElement<String> createPersonSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_PersonSourceSystemReferenceValue_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "County", scope = Person.class)
    public JAXBElement<String> createPersonCounty(String value) {
        return new JAXBElement<String>(_PersonCounty_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PostalCode", scope = Person.class)
    public JAXBElement<String> createPersonPostalCode(String value) {
        return new JAXBElement<String>(_PersonPostalCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Province", scope = Person.class)
    public JAXBElement<String> createPersonProvince(String value) {
        return new JAXBElement<String>(_PersonProvince_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "City", scope = Person.class)
    public JAXBElement<String> createPersonCity(String value) {
        return new JAXBElement<String>(_PersonCity_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactMethod", scope = Person.class)
    public JAXBElement<String> createPersonPreferredContactMethod(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactMethod_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = Person.class)
    public JAXBElement<String> createPersonLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonInterestLastUpdateLogin_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneNumber", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneNumber_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "IdenAddrPartySiteId", scope = Person.class)
    public JAXBElement<Long> createPersonIdenAddrPartySiteId(Long value) {
        return new JAXBElement<Long>(_PersonIdenAddrPartySiteId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "URL", scope = Person.class)
    public JAXBElement<String> createPersonURL(String value) {
        return new JAXBElement<String>(_PersonURL_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ValidatedFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileValidatedFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MaritalStatus", scope = Person.class)
    public JAXBElement<String> createPersonMaritalStatus(String value) {
        return new JAXBElement<String>(_PersonProfileMaritalStatus_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhonePurpose", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhonePurpose_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryURLContactPTId", scope = Person.class)
    public JAXBElement<Long> createPersonPrimaryURLContactPTId(Long value) {
        return new JAXBElement<Long>(_PersonPrimaryURLContactPTId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneAreaCode", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneAreaCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredName", scope = Person.class)
    public JAXBElement<String> createPersonPreferredName(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "GSAIndicatorFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonGSAIndicatorFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonGSAIndicatorFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertificationLevel", scope = Person.class)
    public JAXBElement<String> createPersonCertificationLevel(String value) {
        return new JAXBElement<String>(_PersonProfileCertificationLevel_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonAcademicTitle", scope = Person.class)
    public JAXBElement<String> createPersonPersonAcademicTitle(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonAcademicTitle_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JgzzFiscalCode", scope = Person.class)
    public JAXBElement<String> createPersonJgzzFiscalCode(String value) {
        return new JAXBElement<String>(_PersonProfileJgzzFiscalCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreNameAdjunct", scope = Person.class)
    public JAXBElement<String> createPersonPersonPreNameAdjunct(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonPreNameAdjunct_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneLineType", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneLineType(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryPhoneLineType_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastNamePrefix", scope = Person.class)
    public JAXBElement<String> createPersonPersonLastNamePrefix(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonLastNamePrefix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LanguageName", scope = Person.class)
    public JAXBElement<String> createPersonLanguageName(String value) {
        return new JAXBElement<String>(_PersonLanguageName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Gender", scope = Person.class)
    public JAXBElement<String> createPersonGender(String value) {
        return new JAXBElement<String>(_PersonProfileGender_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = Person.class)
    public JAXBElement<Long> createPersonRequestId(Long value) {
        return new JAXBElement<Long>(_PersonInterestRequestId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonNameSuffix", scope = Person.class)
    public JAXBElement<String> createPersonPersonNameSuffix(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonNameSuffix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateOfBirth", scope = Person.class)
    public JAXBElement<XMLGregorianCalendar> createPersonDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileDateOfBirth_QNAME, XMLGregorianCalendar.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonMiddleName", scope = Person.class)
    public JAXBElement<String> createPersonPersonMiddleName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonMiddleName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Country", scope = Person.class)
    public JAXBElement<String> createPersonCountry(String value) {
        return new JAXBElement<String>(_PersonCountry_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertReasonCode", scope = Person.class)
    public JAXBElement<String> createPersonCertReasonCode(String value) {
        return new JAXBElement<String>(_PersonProfileCertReasonCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address4", scope = Person.class)
    public JAXBElement<String> createPersonAddress4(String value) {
        return new JAXBElement<String>(_PersonAddress4_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Salutation", scope = Person.class)
    public JAXBElement<String> createPersonSalutation(String value) {
        return new JAXBElement<String>(_PersonProfileSalutation_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "IdenAddrLocationId", scope = Person.class)
    public JAXBElement<Long> createPersonIdenAddrLocationId(Long value) {
        return new JAXBElement<Long>(_PersonIdenAddrLocationId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SourceSystemUpdateDate", scope = Person.class)
    public JAXBElement<XMLGregorianCalendar> createPersonSourceSystemUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonSourceSystemUpdateDate_QNAME, XMLGregorianCalendar.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = Person.class)
    public JAXBElement<String> createPersonCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonInterestCreatedByModule_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonSecondLastName", scope = Person.class)
    public JAXBElement<String> createPersonPersonSecondLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonSecondLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SICCode", scope = Person.class)
    public JAXBElement<String> createPersonSICCode(String value) {
        return new JAXBElement<String>(_PersonSICCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = Person.class)
    public JAXBElement<String> createPersonComments(String value) {
        return new JAXBElement<String>(_PersonInterestComments_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InternalFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileInternalFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreviousLastName", scope = Person.class)
    public JAXBElement<String> createPersonPersonPreviousLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonPreviousLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonTitle", scope = Person.class)
    public JAXBElement<String> createPersonPersonTitle(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonTitle_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneContactPTId", scope = Person.class)
    public JAXBElement<Long> createPersonPrimaryPhoneContactPTId(Long value) {
        return new JAXBElement<Long>(_PersonPrimaryPhoneContactPTId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmailAddress", scope = Person.class)
    public JAXBElement<String> createPersonEmailAddress(String value) {
        return new JAXBElement<String>(_PersonEmailAddress_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryEmailContactPTId", scope = Person.class)
    public JAXBElement<Long> createPersonPrimaryEmailContactPTId(Long value) {
        return new JAXBElement<Long>(_PersonPrimaryEmailContactPTId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address3", scope = Person.class)
    public JAXBElement<String> createPersonAddress3(String value) {
        return new JAXBElement<String>(_PersonAddress3_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address2", scope = Person.class)
    public JAXBElement<String> createPersonAddress2(String value) {
        return new JAXBElement<String>(_PersonAddress2_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonFirstName", scope = Person.class)
    public JAXBElement<String> createPersonPersonFirstName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonFirstName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address1", scope = Person.class)
    public JAXBElement<String> createPersonAddress1(String value) {
        return new JAXBElement<String>(_PersonAddress1_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SICCodeType", scope = Person.class)
    public JAXBElement<String> createPersonSICCodeType(String value) {
        return new JAXBElement<String>(_PersonSICCodeType_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredFunctionalCurrency", scope = Person.class)
    public JAXBElement<String> createPersonPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredFunctionalCurrency_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MissionStatement", scope = Person.class)
    public JAXBElement<String> createPersonMissionStatement(String value) {
        return new JAXBElement<String>(_PersonMissionStatement_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastName", scope = Person.class)
    public JAXBElement<String> createPersonPersonLastName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePersonLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "UserGUID", scope = Person.class)
    public JAXBElement<String> createPersonUserGUID(String value) {
        return new JAXBElement<String>(_PersonUserGUID_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactPersonId", scope = Person.class)
    public JAXBElement<Long> createPersonPreferredContactPersonId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePreferredContactPersonId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ThirdPartyFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonThirdPartyFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonThirdPartyFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CategoryCode", scope = Person.class)
    public JAXBElement<String> createPersonCategoryCode(String value) {
        return new JAXBElement<String>(_PersonCategoryCode_QNAME, String.class, Person.class, value);
    }

}
