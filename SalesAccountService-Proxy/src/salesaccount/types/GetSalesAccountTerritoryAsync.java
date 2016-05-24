
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
 *         &lt;element name="sAccountTerritoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "sAccountTerritoryId"
})
@XmlRootElement(name = "getSalesAccountTerritoryAsync")
public class GetSalesAccountTerritoryAsync {

    protected long sAccountTerritoryId;

    /**
     * Gets the value of the sAccountTerritoryId property.
     * 
     */
    public long getSAccountTerritoryId() {
        return sAccountTerritoryId;
    }

    /**
     * Sets the value of the sAccountTerritoryId property.
     * 
     */
    public void setSAccountTerritoryId(long value) {
        this.sAccountTerritoryId = value;
    }

}
