//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.19 at 02:41:29 PM ICT 
//


package org.opencps.api.dossier.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processActionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preStepCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="postStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preCondition " type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowAssignUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="toUsers" type="{}UserModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionModel", propOrder = {
    "processActionId",
    "actionCode",
    "actionName",
    "preStepCode",
    "postStepCode",
    "autoEvent",
    "preCondition0020",
    "allowAssignUser",
    "assignUserId",
    "toUsers"
})
public class ActionModel {

    protected Integer processActionId;
    protected String actionCode;
    protected String actionName;
    protected Integer preStepCode;
    protected String postStepCode;
    protected String autoEvent;
    @XmlElement(name = "preCondition")
    protected String preCondition0020;
    protected String allowAssignUser;
    protected Integer assignUserId;
    protected List<UserModel> toUsers;

    /**
     * Gets the value of the processActionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessActionId() {
        return processActionId;
    }

    /**
     * Sets the value of the processActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessActionId(Integer value) {
        this.processActionId = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the preStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreStepCode() {
        return preStepCode;
    }

    /**
     * Sets the value of the preStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreStepCode(Integer value) {
        this.preStepCode = value;
    }

    /**
     * Gets the value of the postStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostStepCode() {
        return postStepCode;
    }

    /**
     * Sets the value of the postStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostStepCode(String value) {
        this.postStepCode = value;
    }

    /**
     * Gets the value of the autoEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEvent() {
        return autoEvent;
    }

    /**
     * Sets the value of the autoEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEvent(String value) {
        this.autoEvent = value;
    }

    /**
     * Gets the value of the preCondition0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition_0020() {
        return preCondition0020;
    }

    /**
     * Sets the value of the preCondition0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition_0020(String value) {
        this.preCondition0020 = value;
    }

    /**
     * Gets the value of the allowAssignUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAssignUser() {
        return allowAssignUser;
    }

    /**
     * Sets the value of the allowAssignUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAssignUser(String value) {
        this.allowAssignUser = value;
    }

    /**
     * Gets the value of the assignUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssignUserId() {
        return assignUserId;
    }

    /**
     * Sets the value of the assignUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignUserId(Integer value) {
        this.assignUserId = value;
    }

    /**
     * Gets the value of the toUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserModel }
     * 
     * 
     */
    public List<UserModel> getToUsers() {
        if (toUsers == null) {
            toUsers = new ArrayList<UserModel>();
        }
        return this.toUsers;
    }

}