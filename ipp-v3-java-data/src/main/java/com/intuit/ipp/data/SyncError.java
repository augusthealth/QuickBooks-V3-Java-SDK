//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 *                 Product: QBW
 *                 Description: Wrapper object for specifying both version of the objects
 *                 If there is any warnings on a object basis that is also send back
 *                 This object is output object only
 *             
 * 
 * <p>Java class for SyncError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{http://schema.intuit.com/finance/v3}Error" minOccurs="0"/&gt;
 *         &lt;element name="CloudVersion" type="{http://schema.intuit.com/finance/v3}SyncObject" minOccurs="0"/&gt;
 *         &lt;element name="QBVersion" type="{http://schema.intuit.com/finance/v3}SyncObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AppToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncError", propOrder = {
    "error",
    "cloudVersion",
    "qbVersion"
})
public class SyncError implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "CloudVersion")
    protected SyncObject cloudVersion;
    @XmlElement(name = "QBVersion")
    protected SyncObject qbVersion;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "AppToken")
    protected String appToken;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the cloudVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SyncObject }
     *     
     */
    public SyncObject getCloudVersion() {
        return cloudVersion;
    }

    /**
     * Sets the value of the cloudVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncObject }
     *     
     */
    public void setCloudVersion(SyncObject value) {
        this.cloudVersion = value;
    }

    /**
     * Gets the value of the qbVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SyncObject }
     *     
     */
    public SyncObject getQBVersion() {
        return qbVersion;
    }

    /**
     * Sets the value of the qbVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncObject }
     *     
     */
    public void setQBVersion(SyncObject value) {
        this.qbVersion = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the appToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppToken() {
        return appToken;
    }

    /**
     * Sets the value of the appToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppToken(String value) {
        this.appToken = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SyncError that = ((SyncError) object);
        {
            Error lhsError;
            lhsError = this.getError();
            Error rhsError;
            rhsError = that.getError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError, (this.error!= null), (that.error!= null))) {
                return false;
            }
        }
        {
            SyncObject lhsCloudVersion;
            lhsCloudVersion = this.getCloudVersion();
            SyncObject rhsCloudVersion;
            rhsCloudVersion = that.getCloudVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cloudVersion", lhsCloudVersion), LocatorUtils.property(thatLocator, "cloudVersion", rhsCloudVersion), lhsCloudVersion, rhsCloudVersion, (this.cloudVersion!= null), (that.cloudVersion!= null))) {
                return false;
            }
        }
        {
            SyncObject lhsQBVersion;
            lhsQBVersion = this.getQBVersion();
            SyncObject rhsQBVersion;
            rhsQBVersion = that.getQBVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qbVersion", lhsQBVersion), LocatorUtils.property(thatLocator, "qbVersion", rhsQBVersion), lhsQBVersion, rhsQBVersion, (this.qbVersion!= null), (that.qbVersion!= null))) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            String lhsAppToken;
            lhsAppToken = this.getAppToken();
            String rhsAppToken;
            rhsAppToken = that.getAppToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appToken", lhsAppToken), LocatorUtils.property(thatLocator, "appToken", rhsAppToken), lhsAppToken, rhsAppToken, (this.appToken!= null), (that.appToken!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Error theError;
            theError = this.getError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError, (this.error!= null));
        }
        {
            SyncObject theCloudVersion;
            theCloudVersion = this.getCloudVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cloudVersion", theCloudVersion), currentHashCode, theCloudVersion, (this.cloudVersion!= null));
        }
        {
            SyncObject theQBVersion;
            theQBVersion = this.getQBVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qbVersion", theQBVersion), currentHashCode, theQBVersion, (this.qbVersion!= null));
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            String theAppToken;
            theAppToken = this.getAppToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appToken", theAppToken), currentHashCode, theAppToken, (this.appToken!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
