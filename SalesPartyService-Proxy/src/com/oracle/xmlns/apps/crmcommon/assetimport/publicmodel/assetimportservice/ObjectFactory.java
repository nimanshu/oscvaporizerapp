
package com.oracle.xmlns.apps.crmcommon.assetimport.publicmodel.assetimportservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;
import com.oracle.xmlns.adf.svc.types.MeasureType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.assetimport.publicmodel.assetimportservice package. 
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

    private final static QName _Asset_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "asset");
    private final static QName _AssetAssetOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetOrigSystemReference");
    private final static QName _AssetCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CurcyConvRateType");
    private final static QName _AssetCrmConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CrmConvRate");
    private final static QName _AssetAssetDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetDescription");
    private final static QName _AssetLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "LastUpdateDate");
    private final static QName _AssetStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "StartDate");
    private final static QName _AssetCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CustomerId");
    private final static QName _AssetPurchaseDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "PurchaseDate");
    private final static QName _AssetSerialNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "SerialNumber");
    private final static QName _AssetAssetName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetName");
    private final static QName _AssetAssetOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetOrigSystem");
    private final static QName _AssetEnteredCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "EnteredCurrencyCode");
    private final static QName _AssetAssetAmount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetAmount");
    private final static QName _AssetInterfaceRowId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "InterfaceRowId");
    private final static QName _AssetAssetTag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetTag");
    private final static QName _AssetProdGroupId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "ProdGroupId");
    private final static QName _AssetDeleteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "DeleteFlag");
    private final static QName _AssetInventoryOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "InventoryOrgId");
    private final static QName _AssetStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "StatusCode");
    private final static QName _AssetUOMCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "UOMCode");
    private final static QName _AssetCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CorpCurrencyCode");
    private final static QName _AssetItemNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "ItemNumber");
    private final static QName _AssetCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CreatedBy");
    private final static QName _AssetAssetNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AssetNumber");
    private final static QName _AssetRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "RequestId");
    private final static QName _AssetExchangeRate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "ExchangeRate");
    private final static QName _AssetAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "AttributeCategory");
    private final static QName _AssetEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "EndDate");
    private final static QName _AssetInstallDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "InstallDate");
    private final static QName _AssetBatchId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "BatchId");
    private final static QName _AssetCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CurrencyCode");
    private final static QName _AssetCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CreationDate");
    private final static QName _AssetLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "LastUpdateLogin");
    private final static QName _AssetCrmCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "CrmCorpCurrencyCode");
    private final static QName _AssetDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "Description");
    private final static QName _AssetInventoryItemId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "InventoryItemId");
    private final static QName _AssetQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "Quantity");
    private final static QName _AssetLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", "LastUpdatedBy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.assetimport.publicmodel.assetimportservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "asset")
    public JAXBElement<Asset> createAsset(Asset value) {
        return new JAXBElement<Asset>(_Asset_QNAME, Asset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetOrigSystemReference", scope = Asset.class)
    public JAXBElement<String> createAssetAssetOrigSystemReference(String value) {
        return new JAXBElement<String>(_AssetAssetOrigSystemReference_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CurcyConvRateType", scope = Asset.class)
    public JAXBElement<String> createAssetCurcyConvRateType(String value) {
        return new JAXBElement<String>(_AssetCurcyConvRateType_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CrmConvRate", scope = Asset.class)
    public JAXBElement<String> createAssetCrmConvRate(String value) {
        return new JAXBElement<String>(_AssetCrmConvRate_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetDescription", scope = Asset.class)
    public JAXBElement<String> createAssetAssetDescription(String value) {
        return new JAXBElement<String>(_AssetAssetDescription_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "LastUpdateDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetLastUpdateDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "StartDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetStartDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CustomerId", scope = Asset.class)
    public JAXBElement<Long> createAssetCustomerId(Long value) {
        return new JAXBElement<Long>(_AssetCustomerId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "PurchaseDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetPurchaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetPurchaseDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "SerialNumber", scope = Asset.class)
    public JAXBElement<String> createAssetSerialNumber(String value) {
        return new JAXBElement<String>(_AssetSerialNumber_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetName", scope = Asset.class)
    public JAXBElement<String> createAssetAssetName(String value) {
        return new JAXBElement<String>(_AssetAssetName_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetOrigSystem", scope = Asset.class)
    public JAXBElement<String> createAssetAssetOrigSystem(String value) {
        return new JAXBElement<String>(_AssetAssetOrigSystem_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "EnteredCurrencyCode", scope = Asset.class)
    public JAXBElement<String> createAssetEnteredCurrencyCode(String value) {
        return new JAXBElement<String>(_AssetEnteredCurrencyCode_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetAmount", scope = Asset.class)
    public JAXBElement<AmountType> createAssetAssetAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AssetAssetAmount_QNAME, AmountType.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "InterfaceRowId", scope = Asset.class)
    public JAXBElement<Long> createAssetInterfaceRowId(Long value) {
        return new JAXBElement<Long>(_AssetInterfaceRowId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetTag", scope = Asset.class)
    public JAXBElement<String> createAssetAssetTag(String value) {
        return new JAXBElement<String>(_AssetAssetTag_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "ProdGroupId", scope = Asset.class)
    public JAXBElement<Long> createAssetProdGroupId(Long value) {
        return new JAXBElement<Long>(_AssetProdGroupId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "DeleteFlag", scope = Asset.class)
    public JAXBElement<Boolean> createAssetDeleteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AssetDeleteFlag_QNAME, Boolean.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "InventoryOrgId", scope = Asset.class)
    public JAXBElement<Long> createAssetInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_AssetInventoryOrgId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "StatusCode", scope = Asset.class)
    public JAXBElement<String> createAssetStatusCode(String value) {
        return new JAXBElement<String>(_AssetStatusCode_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "UOMCode", scope = Asset.class)
    public JAXBElement<String> createAssetUOMCode(String value) {
        return new JAXBElement<String>(_AssetUOMCode_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CorpCurrencyCode", scope = Asset.class)
    public JAXBElement<String> createAssetCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_AssetCorpCurrencyCode_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "ItemNumber", scope = Asset.class)
    public JAXBElement<String> createAssetItemNumber(String value) {
        return new JAXBElement<String>(_AssetItemNumber_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CreatedBy", scope = Asset.class)
    public JAXBElement<String> createAssetCreatedBy(String value) {
        return new JAXBElement<String>(_AssetCreatedBy_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AssetNumber", scope = Asset.class)
    public JAXBElement<String> createAssetAssetNumber(String value) {
        return new JAXBElement<String>(_AssetAssetNumber_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "RequestId", scope = Asset.class)
    public JAXBElement<Long> createAssetRequestId(Long value) {
        return new JAXBElement<Long>(_AssetRequestId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "ExchangeRate", scope = Asset.class)
    public JAXBElement<BigDecimal> createAssetExchangeRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AssetExchangeRate_QNAME, BigDecimal.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "AttributeCategory", scope = Asset.class)
    public JAXBElement<String> createAssetAttributeCategory(String value) {
        return new JAXBElement<String>(_AssetAttributeCategory_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "EndDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetEndDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "InstallDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetInstallDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetInstallDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "BatchId", scope = Asset.class)
    public JAXBElement<Long> createAssetBatchId(Long value) {
        return new JAXBElement<Long>(_AssetBatchId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CurrencyCode", scope = Asset.class)
    public JAXBElement<String> createAssetCurrencyCode(String value) {
        return new JAXBElement<String>(_AssetCurrencyCode_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CreationDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetCreationDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "LastUpdateLogin", scope = Asset.class)
    public JAXBElement<String> createAssetLastUpdateLogin(String value) {
        return new JAXBElement<String>(_AssetLastUpdateLogin_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "CrmCorpCurrencyCode", scope = Asset.class)
    public JAXBElement<String> createAssetCrmCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_AssetCrmCorpCurrencyCode_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "Description", scope = Asset.class)
    public JAXBElement<String> createAssetDescription(String value) {
        return new JAXBElement<String>(_AssetDescription_QNAME, String.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "InventoryItemId", scope = Asset.class)
    public JAXBElement<Long> createAssetInventoryItemId(Long value) {
        return new JAXBElement<Long>(_AssetInventoryItemId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "Quantity", scope = Asset.class)
    public JAXBElement<MeasureType> createAssetQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_AssetQuantity_QNAME, MeasureType.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", name = "LastUpdatedBy", scope = Asset.class)
    public JAXBElement<String> createAssetLastUpdatedBy(String value) {
        return new JAXBElement<String>(_AssetLastUpdatedBy_QNAME, String.class, Asset.class, value);
    }

}
