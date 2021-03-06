
package salesaccount.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salesAccountContactPoints" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountContactPoints"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salesAccountContactPoints"
})
@XmlRootElement(name = "deleteSalesAccountContactPoints")
public class DeleteSalesAccountContactPoints {

    @XmlElement(required = true)
    protected SalesAccountContactPoints salesAccountContactPoints;

    /**
     * Gets the value of the salesAccountContactPoints property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAccountContactPoints }
     *     
     */
    public SalesAccountContactPoints getSalesAccountContactPoints() {
        return salesAccountContactPoints;
    }

    /**
     * Sets the value of the salesAccountContactPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAccountContactPoints }
     *     
     */
    public void setSalesAccountContactPoints(SalesAccountContactPoints value) {
        this.salesAccountContactPoints = value;
    }

}
