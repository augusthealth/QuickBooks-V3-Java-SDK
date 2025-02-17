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
 * 				Product: QBO
 * 				Description: The Inventory Adjustment request element
 * 			
 * 
 * <p>Java class for InventoryAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType"/&gt;
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAdjustment", propOrder = {
    "shippingAdjustment",
    "adjustAccountRef",
    "customerRef"
})
public class InventoryAdjustment
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ShippingAdjustment")
    protected Boolean shippingAdjustment;
    @XmlElement(name = "AdjustAccountRef", required = true)
    protected ReferenceType adjustAccountRef;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;

    /**
     * Gets the value of the shippingAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingAdjustment() {
        return shippingAdjustment;
    }

    /**
     * Sets the value of the shippingAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingAdjustment(Boolean value) {
        this.shippingAdjustment = value;
    }

    /**
     * Gets the value of the adjustAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAdjustAccountRef() {
        return adjustAccountRef;
    }

    /**
     * Sets the value of the adjustAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAdjustAccountRef(ReferenceType value) {
        this.adjustAccountRef = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final InventoryAdjustment that = ((InventoryAdjustment) object);
        {
            Boolean lhsShippingAdjustment;
            lhsShippingAdjustment = this.isShippingAdjustment();
            Boolean rhsShippingAdjustment;
            rhsShippingAdjustment = that.isShippingAdjustment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingAdjustment", lhsShippingAdjustment), LocatorUtils.property(thatLocator, "shippingAdjustment", rhsShippingAdjustment), lhsShippingAdjustment, rhsShippingAdjustment, (this.shippingAdjustment!= null), (that.shippingAdjustment!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAdjustAccountRef;
            lhsAdjustAccountRef = this.getAdjustAccountRef();
            ReferenceType rhsAdjustAccountRef;
            rhsAdjustAccountRef = that.getAdjustAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adjustAccountRef", lhsAdjustAccountRef), LocatorUtils.property(thatLocator, "adjustAccountRef", rhsAdjustAccountRef), lhsAdjustAccountRef, rhsAdjustAccountRef, (this.adjustAccountRef!= null), (that.adjustAccountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef, (this.customerRef!= null), (that.customerRef!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Boolean theShippingAdjustment;
            theShippingAdjustment = this.isShippingAdjustment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingAdjustment", theShippingAdjustment), currentHashCode, theShippingAdjustment, (this.shippingAdjustment!= null));
        }
        {
            ReferenceType theAdjustAccountRef;
            theAdjustAccountRef = this.getAdjustAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adjustAccountRef", theAdjustAccountRef), currentHashCode, theAdjustAccountRef, (this.adjustAccountRef!= null));
        }
        {
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef, (this.customerRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
