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
 * Defines Preference strongly typed object with
 * 				extensions 
 * 
 * <p>Java class for Preferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingInfoPrefs" type="{http://schema.intuit.com/finance/v3}CompanyAccountingPrefs" minOccurs="0"/&gt;
 *         &lt;element name="AdvancedInventoryPrefs" type="{http://schema.intuit.com/finance/v3}AdvancedInventoryPrefs" minOccurs="0"/&gt;
 *         &lt;element name="ProductAndServicesPrefs" type="{http://schema.intuit.com/finance/v3}ProductAndServicesPrefs" minOccurs="0"/&gt;
 *         &lt;element name="SalesFormsPrefs" type="{http://schema.intuit.com/finance/v3}SalesFormsPrefs" minOccurs="0"/&gt;
 *         &lt;element name="EmailMessagesPrefs" type="{http://schema.intuit.com/finance/v3}EmailMessagesPrefs" minOccurs="0"/&gt;
 *         &lt;element name="PrintDocumentPrefs" type="{http://schema.intuit.com/finance/v3}PrintDocumentPrefs" minOccurs="0"/&gt;
 *         &lt;element name="VendorAndPurchasesPrefs" type="{http://schema.intuit.com/finance/v3}VendorAndPurchasesPrefs" minOccurs="0"/&gt;
 *         &lt;element name="TimeTrackingPrefs" type="{http://schema.intuit.com/finance/v3}TimeTrackingPrefs" minOccurs="0"/&gt;
 *         &lt;element name="TaxPrefs" type="{http://schema.intuit.com/finance/v3}TaxPrefs" minOccurs="0"/&gt;
 *         &lt;element name="FinanceChargesPrefs" type="{http://schema.intuit.com/finance/v3}FinanceChargePrefs" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyPrefs" type="{http://schema.intuit.com/finance/v3}CurrencyPrefs" minOccurs="0"/&gt;
 *         &lt;element name="ReportPrefs" type="{http://schema.intuit.com/finance/v3}ReportPrefs" minOccurs="0"/&gt;
 *         &lt;element name="OtherPrefs" type="{http://schema.intuit.com/finance/v3}OtherPrefs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferences", propOrder = {
    "accountingInfoPrefs",
    "advancedInventoryPrefs",
    "productAndServicesPrefs",
    "salesFormsPrefs",
    "emailMessagesPrefs",
    "printDocumentPrefs",
    "vendorAndPurchasesPrefs",
    "timeTrackingPrefs",
    "taxPrefs",
    "financeChargesPrefs",
    "currencyPrefs",
    "reportPrefs",
    "otherPrefs"
})
public class Preferences
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountingInfoPrefs")
    protected CompanyAccountingPrefs accountingInfoPrefs;
    @XmlElement(name = "AdvancedInventoryPrefs")
    protected AdvancedInventoryPrefs advancedInventoryPrefs;
    @XmlElement(name = "ProductAndServicesPrefs")
    protected ProductAndServicesPrefs productAndServicesPrefs;
    @XmlElement(name = "SalesFormsPrefs")
    protected SalesFormsPrefs salesFormsPrefs;
    @XmlElement(name = "EmailMessagesPrefs")
    protected EmailMessagesPrefs emailMessagesPrefs;
    @XmlElement(name = "PrintDocumentPrefs")
    protected PrintDocumentPrefs printDocumentPrefs;
    @XmlElement(name = "VendorAndPurchasesPrefs")
    protected VendorAndPurchasesPrefs vendorAndPurchasesPrefs;
    @XmlElement(name = "TimeTrackingPrefs")
    protected TimeTrackingPrefs timeTrackingPrefs;
    @XmlElement(name = "TaxPrefs")
    protected TaxPrefs taxPrefs;
    @XmlElement(name = "FinanceChargesPrefs")
    protected FinanceChargePrefs financeChargesPrefs;
    @XmlElement(name = "CurrencyPrefs")
    protected CurrencyPrefs currencyPrefs;
    @XmlElement(name = "ReportPrefs")
    protected ReportPrefs reportPrefs;
    @XmlElement(name = "OtherPrefs")
    protected OtherPrefs otherPrefs;

    /**
     * Gets the value of the accountingInfoPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAccountingPrefs }
     *     
     */
    public CompanyAccountingPrefs getAccountingInfoPrefs() {
        return accountingInfoPrefs;
    }

    /**
     * Sets the value of the accountingInfoPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAccountingPrefs }
     *     
     */
    public void setAccountingInfoPrefs(CompanyAccountingPrefs value) {
        this.accountingInfoPrefs = value;
    }

    /**
     * Gets the value of the advancedInventoryPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link AdvancedInventoryPrefs }
     *     
     */
    public AdvancedInventoryPrefs getAdvancedInventoryPrefs() {
        return advancedInventoryPrefs;
    }

    /**
     * Sets the value of the advancedInventoryPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedInventoryPrefs }
     *     
     */
    public void setAdvancedInventoryPrefs(AdvancedInventoryPrefs value) {
        this.advancedInventoryPrefs = value;
    }

    /**
     * Gets the value of the productAndServicesPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAndServicesPrefs }
     *     
     */
    public ProductAndServicesPrefs getProductAndServicesPrefs() {
        return productAndServicesPrefs;
    }

    /**
     * Sets the value of the productAndServicesPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAndServicesPrefs }
     *     
     */
    public void setProductAndServicesPrefs(ProductAndServicesPrefs value) {
        this.productAndServicesPrefs = value;
    }

    /**
     * Gets the value of the salesFormsPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link SalesFormsPrefs }
     *     
     */
    public SalesFormsPrefs getSalesFormsPrefs() {
        return salesFormsPrefs;
    }

    /**
     * Sets the value of the salesFormsPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesFormsPrefs }
     *     
     */
    public void setSalesFormsPrefs(SalesFormsPrefs value) {
        this.salesFormsPrefs = value;
    }

    /**
     * Gets the value of the emailMessagesPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link EmailMessagesPrefs }
     *     
     */
    public EmailMessagesPrefs getEmailMessagesPrefs() {
        return emailMessagesPrefs;
    }

    /**
     * Sets the value of the emailMessagesPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailMessagesPrefs }
     *     
     */
    public void setEmailMessagesPrefs(EmailMessagesPrefs value) {
        this.emailMessagesPrefs = value;
    }

    /**
     * Gets the value of the printDocumentPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link PrintDocumentPrefs }
     *     
     */
    public PrintDocumentPrefs getPrintDocumentPrefs() {
        return printDocumentPrefs;
    }

    /**
     * Sets the value of the printDocumentPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintDocumentPrefs }
     *     
     */
    public void setPrintDocumentPrefs(PrintDocumentPrefs value) {
        this.printDocumentPrefs = value;
    }

    /**
     * Gets the value of the vendorAndPurchasesPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAndPurchasesPrefs }
     *     
     */
    public VendorAndPurchasesPrefs getVendorAndPurchasesPrefs() {
        return vendorAndPurchasesPrefs;
    }

    /**
     * Sets the value of the vendorAndPurchasesPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAndPurchasesPrefs }
     *     
     */
    public void setVendorAndPurchasesPrefs(VendorAndPurchasesPrefs value) {
        this.vendorAndPurchasesPrefs = value;
    }

    /**
     * Gets the value of the timeTrackingPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTrackingPrefs }
     *     
     */
    public TimeTrackingPrefs getTimeTrackingPrefs() {
        return timeTrackingPrefs;
    }

    /**
     * Sets the value of the timeTrackingPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTrackingPrefs }
     *     
     */
    public void setTimeTrackingPrefs(TimeTrackingPrefs value) {
        this.timeTrackingPrefs = value;
    }

    /**
     * Gets the value of the taxPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPrefs }
     *     
     */
    public TaxPrefs getTaxPrefs() {
        return taxPrefs;
    }

    /**
     * Sets the value of the taxPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPrefs }
     *     
     */
    public void setTaxPrefs(TaxPrefs value) {
        this.taxPrefs = value;
    }

    /**
     * Gets the value of the financeChargesPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link FinanceChargePrefs }
     *     
     */
    public FinanceChargePrefs getFinanceChargesPrefs() {
        return financeChargesPrefs;
    }

    /**
     * Sets the value of the financeChargesPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanceChargePrefs }
     *     
     */
    public void setFinanceChargesPrefs(FinanceChargePrefs value) {
        this.financeChargesPrefs = value;
    }

    /**
     * Gets the value of the currencyPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyPrefs }
     *     
     */
    public CurrencyPrefs getCurrencyPrefs() {
        return currencyPrefs;
    }

    /**
     * Sets the value of the currencyPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyPrefs }
     *     
     */
    public void setCurrencyPrefs(CurrencyPrefs value) {
        this.currencyPrefs = value;
    }

    /**
     * Gets the value of the reportPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPrefs }
     *     
     */
    public ReportPrefs getReportPrefs() {
        return reportPrefs;
    }

    /**
     * Sets the value of the reportPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPrefs }
     *     
     */
    public void setReportPrefs(ReportPrefs value) {
        this.reportPrefs = value;
    }

    /**
     * Gets the value of the otherPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPrefs }
     *     
     */
    public OtherPrefs getOtherPrefs() {
        return otherPrefs;
    }

    /**
     * Sets the value of the otherPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPrefs }
     *     
     */
    public void setOtherPrefs(OtherPrefs value) {
        this.otherPrefs = value;
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
        final Preferences that = ((Preferences) object);
        {
            CompanyAccountingPrefs lhsAccountingInfoPrefs;
            lhsAccountingInfoPrefs = this.getAccountingInfoPrefs();
            CompanyAccountingPrefs rhsAccountingInfoPrefs;
            rhsAccountingInfoPrefs = that.getAccountingInfoPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountingInfoPrefs", lhsAccountingInfoPrefs), LocatorUtils.property(thatLocator, "accountingInfoPrefs", rhsAccountingInfoPrefs), lhsAccountingInfoPrefs, rhsAccountingInfoPrefs, (this.accountingInfoPrefs!= null), (that.accountingInfoPrefs!= null))) {
                return false;
            }
        }
        {
            AdvancedInventoryPrefs lhsAdvancedInventoryPrefs;
            lhsAdvancedInventoryPrefs = this.getAdvancedInventoryPrefs();
            AdvancedInventoryPrefs rhsAdvancedInventoryPrefs;
            rhsAdvancedInventoryPrefs = that.getAdvancedInventoryPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advancedInventoryPrefs", lhsAdvancedInventoryPrefs), LocatorUtils.property(thatLocator, "advancedInventoryPrefs", rhsAdvancedInventoryPrefs), lhsAdvancedInventoryPrefs, rhsAdvancedInventoryPrefs, (this.advancedInventoryPrefs!= null), (that.advancedInventoryPrefs!= null))) {
                return false;
            }
        }
        {
            ProductAndServicesPrefs lhsProductAndServicesPrefs;
            lhsProductAndServicesPrefs = this.getProductAndServicesPrefs();
            ProductAndServicesPrefs rhsProductAndServicesPrefs;
            rhsProductAndServicesPrefs = that.getProductAndServicesPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productAndServicesPrefs", lhsProductAndServicesPrefs), LocatorUtils.property(thatLocator, "productAndServicesPrefs", rhsProductAndServicesPrefs), lhsProductAndServicesPrefs, rhsProductAndServicesPrefs, (this.productAndServicesPrefs!= null), (that.productAndServicesPrefs!= null))) {
                return false;
            }
        }
        {
            SalesFormsPrefs lhsSalesFormsPrefs;
            lhsSalesFormsPrefs = this.getSalesFormsPrefs();
            SalesFormsPrefs rhsSalesFormsPrefs;
            rhsSalesFormsPrefs = that.getSalesFormsPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesFormsPrefs", lhsSalesFormsPrefs), LocatorUtils.property(thatLocator, "salesFormsPrefs", rhsSalesFormsPrefs), lhsSalesFormsPrefs, rhsSalesFormsPrefs, (this.salesFormsPrefs!= null), (that.salesFormsPrefs!= null))) {
                return false;
            }
        }
        {
            EmailMessagesPrefs lhsEmailMessagesPrefs;
            lhsEmailMessagesPrefs = this.getEmailMessagesPrefs();
            EmailMessagesPrefs rhsEmailMessagesPrefs;
            rhsEmailMessagesPrefs = that.getEmailMessagesPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailMessagesPrefs", lhsEmailMessagesPrefs), LocatorUtils.property(thatLocator, "emailMessagesPrefs", rhsEmailMessagesPrefs), lhsEmailMessagesPrefs, rhsEmailMessagesPrefs, (this.emailMessagesPrefs!= null), (that.emailMessagesPrefs!= null))) {
                return false;
            }
        }
        {
            PrintDocumentPrefs lhsPrintDocumentPrefs;
            lhsPrintDocumentPrefs = this.getPrintDocumentPrefs();
            PrintDocumentPrefs rhsPrintDocumentPrefs;
            rhsPrintDocumentPrefs = that.getPrintDocumentPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "printDocumentPrefs", lhsPrintDocumentPrefs), LocatorUtils.property(thatLocator, "printDocumentPrefs", rhsPrintDocumentPrefs), lhsPrintDocumentPrefs, rhsPrintDocumentPrefs, (this.printDocumentPrefs!= null), (that.printDocumentPrefs!= null))) {
                return false;
            }
        }
        {
            VendorAndPurchasesPrefs lhsVendorAndPurchasesPrefs;
            lhsVendorAndPurchasesPrefs = this.getVendorAndPurchasesPrefs();
            VendorAndPurchasesPrefs rhsVendorAndPurchasesPrefs;
            rhsVendorAndPurchasesPrefs = that.getVendorAndPurchasesPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorAndPurchasesPrefs", lhsVendorAndPurchasesPrefs), LocatorUtils.property(thatLocator, "vendorAndPurchasesPrefs", rhsVendorAndPurchasesPrefs), lhsVendorAndPurchasesPrefs, rhsVendorAndPurchasesPrefs, (this.vendorAndPurchasesPrefs!= null), (that.vendorAndPurchasesPrefs!= null))) {
                return false;
            }
        }
        {
            TimeTrackingPrefs lhsTimeTrackingPrefs;
            lhsTimeTrackingPrefs = this.getTimeTrackingPrefs();
            TimeTrackingPrefs rhsTimeTrackingPrefs;
            rhsTimeTrackingPrefs = that.getTimeTrackingPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeTrackingPrefs", lhsTimeTrackingPrefs), LocatorUtils.property(thatLocator, "timeTrackingPrefs", rhsTimeTrackingPrefs), lhsTimeTrackingPrefs, rhsTimeTrackingPrefs, (this.timeTrackingPrefs!= null), (that.timeTrackingPrefs!= null))) {
                return false;
            }
        }
        {
            TaxPrefs lhsTaxPrefs;
            lhsTaxPrefs = this.getTaxPrefs();
            TaxPrefs rhsTaxPrefs;
            rhsTaxPrefs = that.getTaxPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxPrefs", lhsTaxPrefs), LocatorUtils.property(thatLocator, "taxPrefs", rhsTaxPrefs), lhsTaxPrefs, rhsTaxPrefs, (this.taxPrefs!= null), (that.taxPrefs!= null))) {
                return false;
            }
        }
        {
            FinanceChargePrefs lhsFinanceChargesPrefs;
            lhsFinanceChargesPrefs = this.getFinanceChargesPrefs();
            FinanceChargePrefs rhsFinanceChargesPrefs;
            rhsFinanceChargesPrefs = that.getFinanceChargesPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financeChargesPrefs", lhsFinanceChargesPrefs), LocatorUtils.property(thatLocator, "financeChargesPrefs", rhsFinanceChargesPrefs), lhsFinanceChargesPrefs, rhsFinanceChargesPrefs, (this.financeChargesPrefs!= null), (that.financeChargesPrefs!= null))) {
                return false;
            }
        }
        {
            CurrencyPrefs lhsCurrencyPrefs;
            lhsCurrencyPrefs = this.getCurrencyPrefs();
            CurrencyPrefs rhsCurrencyPrefs;
            rhsCurrencyPrefs = that.getCurrencyPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyPrefs", lhsCurrencyPrefs), LocatorUtils.property(thatLocator, "currencyPrefs", rhsCurrencyPrefs), lhsCurrencyPrefs, rhsCurrencyPrefs, (this.currencyPrefs!= null), (that.currencyPrefs!= null))) {
                return false;
            }
        }
        {
            ReportPrefs lhsReportPrefs;
            lhsReportPrefs = this.getReportPrefs();
            ReportPrefs rhsReportPrefs;
            rhsReportPrefs = that.getReportPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportPrefs", lhsReportPrefs), LocatorUtils.property(thatLocator, "reportPrefs", rhsReportPrefs), lhsReportPrefs, rhsReportPrefs, (this.reportPrefs!= null), (that.reportPrefs!= null))) {
                return false;
            }
        }
        {
            OtherPrefs lhsOtherPrefs;
            lhsOtherPrefs = this.getOtherPrefs();
            OtherPrefs rhsOtherPrefs;
            rhsOtherPrefs = that.getOtherPrefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherPrefs", lhsOtherPrefs), LocatorUtils.property(thatLocator, "otherPrefs", rhsOtherPrefs), lhsOtherPrefs, rhsOtherPrefs, (this.otherPrefs!= null), (that.otherPrefs!= null))) {
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
            CompanyAccountingPrefs theAccountingInfoPrefs;
            theAccountingInfoPrefs = this.getAccountingInfoPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountingInfoPrefs", theAccountingInfoPrefs), currentHashCode, theAccountingInfoPrefs, (this.accountingInfoPrefs!= null));
        }
        {
            AdvancedInventoryPrefs theAdvancedInventoryPrefs;
            theAdvancedInventoryPrefs = this.getAdvancedInventoryPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advancedInventoryPrefs", theAdvancedInventoryPrefs), currentHashCode, theAdvancedInventoryPrefs, (this.advancedInventoryPrefs!= null));
        }
        {
            ProductAndServicesPrefs theProductAndServicesPrefs;
            theProductAndServicesPrefs = this.getProductAndServicesPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productAndServicesPrefs", theProductAndServicesPrefs), currentHashCode, theProductAndServicesPrefs, (this.productAndServicesPrefs!= null));
        }
        {
            SalesFormsPrefs theSalesFormsPrefs;
            theSalesFormsPrefs = this.getSalesFormsPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesFormsPrefs", theSalesFormsPrefs), currentHashCode, theSalesFormsPrefs, (this.salesFormsPrefs!= null));
        }
        {
            EmailMessagesPrefs theEmailMessagesPrefs;
            theEmailMessagesPrefs = this.getEmailMessagesPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailMessagesPrefs", theEmailMessagesPrefs), currentHashCode, theEmailMessagesPrefs, (this.emailMessagesPrefs!= null));
        }
        {
            PrintDocumentPrefs thePrintDocumentPrefs;
            thePrintDocumentPrefs = this.getPrintDocumentPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "printDocumentPrefs", thePrintDocumentPrefs), currentHashCode, thePrintDocumentPrefs, (this.printDocumentPrefs!= null));
        }
        {
            VendorAndPurchasesPrefs theVendorAndPurchasesPrefs;
            theVendorAndPurchasesPrefs = this.getVendorAndPurchasesPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorAndPurchasesPrefs", theVendorAndPurchasesPrefs), currentHashCode, theVendorAndPurchasesPrefs, (this.vendorAndPurchasesPrefs!= null));
        }
        {
            TimeTrackingPrefs theTimeTrackingPrefs;
            theTimeTrackingPrefs = this.getTimeTrackingPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeTrackingPrefs", theTimeTrackingPrefs), currentHashCode, theTimeTrackingPrefs, (this.timeTrackingPrefs!= null));
        }
        {
            TaxPrefs theTaxPrefs;
            theTaxPrefs = this.getTaxPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxPrefs", theTaxPrefs), currentHashCode, theTaxPrefs, (this.taxPrefs!= null));
        }
        {
            FinanceChargePrefs theFinanceChargesPrefs;
            theFinanceChargesPrefs = this.getFinanceChargesPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financeChargesPrefs", theFinanceChargesPrefs), currentHashCode, theFinanceChargesPrefs, (this.financeChargesPrefs!= null));
        }
        {
            CurrencyPrefs theCurrencyPrefs;
            theCurrencyPrefs = this.getCurrencyPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyPrefs", theCurrencyPrefs), currentHashCode, theCurrencyPrefs, (this.currencyPrefs!= null));
        }
        {
            ReportPrefs theReportPrefs;
            theReportPrefs = this.getReportPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportPrefs", theReportPrefs), currentHashCode, theReportPrefs, (this.reportPrefs!= null));
        }
        {
            OtherPrefs theOtherPrefs;
            theOtherPrefs = this.getOtherPrefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherPrefs", theOtherPrefs), currentHashCode, theOtherPrefs, (this.otherPrefs!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
