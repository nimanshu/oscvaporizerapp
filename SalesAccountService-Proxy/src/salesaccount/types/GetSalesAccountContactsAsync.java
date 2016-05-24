
package salesaccount.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sAccountContactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "sAccountContactId"
})
@XmlRootElement(name = "getSalesAccountContactsAsync")
public class GetSalesAccountContactsAsync {

    protected long sAccountContactId;

    /**
     * Gets the value of the sAccountContactId property.
     * 
     */
    public long getSAccountContactId() {
        return sAccountContactId;
    }

    /**
     * Sets the value of the sAccountContactId property.
     * 
     */
    public void setSAccountContactId(long value) {
        this.sAccountContactId = value;
    }

}
