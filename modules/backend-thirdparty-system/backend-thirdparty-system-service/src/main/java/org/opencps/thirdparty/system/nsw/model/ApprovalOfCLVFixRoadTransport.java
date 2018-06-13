//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.11 at 08:51:11 AM ICT 
//


package org.opencps.thirdparty.system.nsw.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalOfCLVFixRoadTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalOfCLVFixRoadTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuingDispatchNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OfficialDispatchNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OfficialDispatchDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfCompany">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepartureFrom">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DepartureTo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromParkingLot">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromProvinceCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromProvinceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToParkingLot">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToProvinceCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToProvinceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromBorderGate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToBorderGate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CircularNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CircularDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumberOfVehicle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToVNAuthority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToLAOAuthority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AtParkingLot">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AtProvinceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AttachedFile" maxOccurs="unbounded"/>
 *         &lt;element ref="{}IssuingAuthority"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalOfCLVFixRoadTransport", propOrder = {
    "issuingDispatchNo",
    "officialDispatchNo",
    "officialDispatchDate",
    "nameOfCompany",
    "departureFrom",
    "departureTo",
    "fromParkingLot",
    "fromProvinceCode",
    "fromProvinceName",
    "toParkingLot",
    "toProvinceCode",
    "toProvinceName",
    "fromBorderGate",
    "toBorderGate",
    "circularNo",
    "circularDate",
    "numberOfVehicle",
    "toVNAuthority",
    "toLAOAuthority",
    "atParkingLot",
    "atProvinceName",
    "attachedFile",
    "issuingAuthority"
})
public class ApprovalOfCLVFixRoadTransport {

    @XmlElement(name = "IssuingDispatchNo", required = true)
    protected String issuingDispatchNo;
    @XmlElement(name = "OfficialDispatchNo")
    protected String officialDispatchNo;
    @XmlElement(name = "OfficialDispatchDate", required = true)
    protected String officialDispatchDate;
    @XmlElement(name = "NameOfCompany", required = true)
    protected String nameOfCompany;
    @XmlElement(name = "DepartureFrom", required = true)
    protected String departureFrom;
    @XmlElement(name = "DepartureTo", required = true)
    protected String departureTo;
    @XmlElement(name = "FromParkingLot", required = true)
    protected String fromParkingLot;
    @XmlElement(name = "FromProvinceCode", required = true)
    protected String fromProvinceCode;
    @XmlElement(name = "FromProvinceName", required = true)
    protected String fromProvinceName;
    @XmlElement(name = "ToParkingLot", required = true)
    protected String toParkingLot;
    @XmlElement(name = "ToProvinceCode", required = true)
    protected String toProvinceCode;
    @XmlElement(name = "ToProvinceName", required = true)
    protected String toProvinceName;
    @XmlElement(name = "FromBorderGate", required = true)
    protected String fromBorderGate;
    @XmlElement(name = "ToBorderGate", required = true)
    protected String toBorderGate;
    @XmlElement(name = "CircularNo", required = true)
    protected String circularNo;
    @XmlElement(name = "CircularDate", required = true)
    protected String circularDate;
    @XmlElement(name = "NumberOfVehicle", required = true)
    protected String numberOfVehicle;
    @XmlElement(name = "ToVNAuthority", required = true)
    protected String toVNAuthority;
    @XmlElement(name = "ToLAOAuthority", required = true)
    protected String toLAOAuthority;
    @XmlElement(name = "AtParkingLot", required = true)
    protected String atParkingLot;
    @XmlElement(name = "AtProvinceName", required = true)
    protected String atProvinceName;
    @XmlElement(name = "AttachedFile", required = true)
    protected List<AttachedFile> attachedFile;
    @XmlElement(name = "IssuingAuthority", required = true)
    protected IssuingAuthority issuingAuthority;

    /**
     * Gets the value of the issuingDispatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingDispatchNo() {
        return issuingDispatchNo;
    }

    /**
     * Sets the value of the issuingDispatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingDispatchNo(String value) {
        this.issuingDispatchNo = value;
    }

    /**
     * Gets the value of the officialDispatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialDispatchNo() {
        return officialDispatchNo;
    }

    /**
     * Sets the value of the officialDispatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialDispatchNo(String value) {
        this.officialDispatchNo = value;
    }

    /**
     * Gets the value of the officialDispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialDispatchDate() {
        return officialDispatchDate;
    }

    /**
     * Sets the value of the officialDispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialDispatchDate(String value) {
        this.officialDispatchDate = value;
    }

    /**
     * Gets the value of the nameOfCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    /**
     * Sets the value of the nameOfCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfCompany(String value) {
        this.nameOfCompany = value;
    }

    /**
     * Gets the value of the departureFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFrom() {
        return departureFrom;
    }

    /**
     * Sets the value of the departureFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFrom(String value) {
        this.departureFrom = value;
    }

    /**
     * Gets the value of the departureTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTo() {
        return departureTo;
    }

    /**
     * Sets the value of the departureTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTo(String value) {
        this.departureTo = value;
    }

    /**
     * Gets the value of the fromParkingLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromParkingLot() {
        return fromParkingLot;
    }

    /**
     * Sets the value of the fromParkingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromParkingLot(String value) {
        this.fromParkingLot = value;
    }

    /**
     * Gets the value of the fromProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromProvinceCode() {
        return fromProvinceCode;
    }

    /**
     * Sets the value of the fromProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromProvinceCode(String value) {
        this.fromProvinceCode = value;
    }

    /**
     * Gets the value of the fromProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromProvinceName() {
        return fromProvinceName;
    }

    /**
     * Sets the value of the fromProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromProvinceName(String value) {
        this.fromProvinceName = value;
    }

    /**
     * Gets the value of the toParkingLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToParkingLot() {
        return toParkingLot;
    }

    /**
     * Sets the value of the toParkingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToParkingLot(String value) {
        this.toParkingLot = value;
    }

    /**
     * Gets the value of the toProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToProvinceCode() {
        return toProvinceCode;
    }

    /**
     * Sets the value of the toProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToProvinceCode(String value) {
        this.toProvinceCode = value;
    }

    /**
     * Gets the value of the toProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToProvinceName() {
        return toProvinceName;
    }

    /**
     * Sets the value of the toProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToProvinceName(String value) {
        this.toProvinceName = value;
    }

    /**
     * Gets the value of the fromBorderGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBorderGate() {
        return fromBorderGate;
    }

    /**
     * Sets the value of the fromBorderGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBorderGate(String value) {
        this.fromBorderGate = value;
    }

    /**
     * Gets the value of the toBorderGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBorderGate() {
        return toBorderGate;
    }

    /**
     * Sets the value of the toBorderGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBorderGate(String value) {
        this.toBorderGate = value;
    }

    /**
     * Gets the value of the circularNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircularNo() {
        return circularNo;
    }

    /**
     * Sets the value of the circularNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircularNo(String value) {
        this.circularNo = value;
    }

    /**
     * Gets the value of the circularDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircularDate() {
        return circularDate;
    }

    /**
     * Sets the value of the circularDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircularDate(String value) {
        this.circularDate = value;
    }

    /**
     * Gets the value of the numberOfVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfVehicle() {
        return numberOfVehicle;
    }

    /**
     * Sets the value of the numberOfVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfVehicle(String value) {
        this.numberOfVehicle = value;
    }

    /**
     * Gets the value of the toVNAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToVNAuthority() {
        return toVNAuthority;
    }

    /**
     * Sets the value of the toVNAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToVNAuthority(String value) {
        this.toVNAuthority = value;
    }

    /**
     * Gets the value of the toLAOAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLAOAuthority() {
        return toLAOAuthority;
    }

    /**
     * Sets the value of the toLAOAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLAOAuthority(String value) {
        this.toLAOAuthority = value;
    }

    /**
     * Gets the value of the atParkingLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtParkingLot() {
        return atParkingLot;
    }

    /**
     * Sets the value of the atParkingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtParkingLot(String value) {
        this.atParkingLot = value;
    }

    /**
     * Gets the value of the atProvinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtProvinceName() {
        return atProvinceName;
    }

    /**
     * Sets the value of the atProvinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtProvinceName(String value) {
        this.atProvinceName = value;
    }

    /**
     * Gets the value of the attachedFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedFile }
     * 
     * 
     */
    public List<AttachedFile> getAttachedFile() {
        if (attachedFile == null) {
            attachedFile = new ArrayList<AttachedFile>();
        }
        return this.attachedFile;
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link IssuingAuthority }
     *     
     */
    public IssuingAuthority getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuingAuthority }
     *     
     */
    public void setIssuingAuthority(IssuingAuthority value) {
        this.issuingAuthority = value;
    }

}
