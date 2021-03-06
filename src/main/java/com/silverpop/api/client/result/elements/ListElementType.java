//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.25 at 11:03:15 AM EDT 
//


package com.silverpop.api.client.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPE" type="{SilverpopApi:EngageService.ListMgmt.UserActions}ListTypeId"/>
 *         &lt;element name="SIZE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUM_OPT_OUTS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUM_UNDELIVERABLE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LAST_MODIFIED" type="{SilverpopApi:EngageService.ListMgmt.UserActions}DateTime2"/>
 *         &lt;element name="VISIBILITY" type="{SilverpopApi:EngageService.ListMgmt.UserActions}Visibility"/>
 *         &lt;element name="PARENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PARENT_FOLDER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IS_FOLDER" type="{SilverpopApi:EngageService.ListMgmt.UserActions}True"/>
 *         &lt;element name="FLAGGED_FOR_BACKUP" type="{SilverpopApi:EngageService.ListMgmt.UserActions}True"/>
 *         &lt;element name="SUPPRESSION_LIST_ID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XStreamAlias("LIST")
public class ListElementType {

    @XStreamAlias("ID")
    protected long id;
    @XStreamAlias("NAME")
    protected String name;
    @XStreamAlias("TYPE")
    protected int type;
    @XStreamAlias("SIZE")
    protected int size;
    @XStreamAlias("NUM_OPT_OUTS")
    protected int numoptouts;
    @XStreamAlias("NUM_UNDELIVERABLE")
    protected int numundeliverable;
    @XStreamAlias("LAST_MODIFIED")
    protected String lastmodified;
    @XStreamAlias("VISIBILITY")
    protected int visibility;
    @XStreamAlias("PARENT_NAME")
    protected String parentname;
    @XStreamAlias("USER_ID")
    protected String userid;
    @XStreamAlias("PARENT_FOLDER_ID")
    protected Long parentfolderid;
    @XStreamAlias("IS_FOLDER")
    protected boolean isfolder;
    @XStreamAlias("FLAGGED_FOR_BACKUP")
    protected boolean flaggedforbackup;
    @XStreamAlias("SUPPRESSION_LIST_ID")
    protected List<Long> suppressionlistids;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setTYPE(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSIZE() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSIZE(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the numoptouts property.
     * 
     */
    public int getNUMOPTOUTS() {
        return numoptouts;
    }

    /**
     * Sets the value of the numoptouts property.
     * 
     */
    public void setNUMOPTOUTS(int value) {
        this.numoptouts = value;
    }

    /**
     * Gets the value of the numundeliverable property.
     * 
     */
    public int getNUMUNDELIVERABLE() {
        return numundeliverable;
    }

    /**
     * Sets the value of the numundeliverable property.
     * 
     */
    public void setNUMUNDELIVERABLE(int value) {
        this.numundeliverable = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTMODIFIED() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTMODIFIED(String value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     */
    public int getVISIBILITY() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     */
    public void setVISIBILITY(int value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the parentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTNAME() {
        return parentname;
    }

    /**
     * Sets the value of the parentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTNAME(String value) {
        this.parentname = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the parentfolderid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARENTFOLDERID() {
        return parentfolderid;
    }

    /**
     * Sets the value of the parentfolderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARENTFOLDERID(Long value) {
        this.parentfolderid = value;
    }

    /**
     * Gets the value of the isfolder property.
     * 
     */
    public boolean isISFOLDER() {
        return isfolder;
    }

    /**
     * Sets the value of the isfolder property.
     * 
     */
    public void setISFOLDER(boolean value) {
        this.isfolder = value;
    }

    /**
     * Gets the value of the flaggedforbackup property.
     * 
     */
    public boolean isFLAGGEDFORBACKUP() {
        return flaggedforbackup;
    }

    /**
     * Sets the value of the flaggedforbackup property.
     * 
     */
    public void setFLAGGEDFORBACKUP(boolean value) {
        this.flaggedforbackup = value;
    }

    /**
     * Gets the value of the suppressionlistids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppressionlistids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUPPRESSIONLISTIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSUPPRESSIONLISTIDS() {
        if (suppressionlistids == null) {
            suppressionlistids = new ArrayList<Long>();
        }
        return this.suppressionlistids;
    }

}
