//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.29 at 12:41:31 PM CET 
//


package com.setantamedia.fulcrum.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{}paramList" minOccurs="0"/>
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="successWorkflow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failWorkflow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflow", propOrder = {
    "params",
    "actions",
    "successWorkflow",
    "failWorkflow"
})
public class Workflow {

    protected ParamList params;
    protected List<String> actions;
    protected String successWorkflow;
    protected String failWorkflow;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ParamList }
     *     
     */
    public ParamList getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamList }
     *     
     */
    public void setParams(ParamList value) {
        this.params = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActions() {
        if (actions == null) {
            actions = new ArrayList<String>();
        }
        return this.actions;
    }

    /**
     * Gets the value of the successWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessWorkflow() {
        return successWorkflow;
    }

    /**
     * Sets the value of the successWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessWorkflow(String value) {
        this.successWorkflow = value;
    }

    /**
     * Gets the value of the failWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailWorkflow() {
        return failWorkflow;
    }

    /**
     * Sets the value of the failWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailWorkflow(String value) {
        this.failWorkflow = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
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
    public void setName(String value) {
        this.name = value;
    }

}
