//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.30 at 10:14:10 AM ICT 
//


package org.opencps.api.dossierstatistic.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DossierStatisticYearDataModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DossierStatisticYearDataModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workingUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingRole" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="months" type="{}DossierStatisticYearModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DossierStatisticYearDataModel", propOrder = {
    "userId",
    "userName",
    "workingUnitId",
    "workingUnitName",
    "workingRole",
    "months"
})
public class DossierStatisticYearDataModel {

    protected Long userId;
    protected String userName;
    protected Long workingUnitId;
    protected String workingUnitName;
    protected Long workingRole;
    protected List<DossierStatisticYearModel> months;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the workingUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkingUnitId() {
        return workingUnitId;
    }

    /**
     * Sets the value of the workingUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkingUnitId(Long value) {
        this.workingUnitId = value;
    }

    /**
     * Gets the value of the workingUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingUnitName() {
        return workingUnitName;
    }

    /**
     * Sets the value of the workingUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingUnitName(String value) {
        this.workingUnitName = value;
    }

    /**
     * Gets the value of the workingRole property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkingRole() {
        return workingRole;
    }

    /**
     * Sets the value of the workingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkingRole(Long value) {
        this.workingRole = value;
    }

    /**
     * Gets the value of the months property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the months property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DossierStatisticYearModel }
     * 
     * 
     */
    public List<DossierStatisticYearModel> getMonths() {
        if (months == null) {
            months = new ArrayList<DossierStatisticYearModel>();
        }
        return this.months;
    }

}