//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.model.stub.ebrs21.rs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.openehealth.ipf.commons.ihe.xds.model.stub.ebrs21.query.AdhocQueryRequest;
import org.openehealth.ipf.commons.ihe.xds.model.stub.ebrs21.query.GetContentRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}SubmitObjectsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}UpdateObjectsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}ApproveObjectsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}DeprecateObjectsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}RemoveObjectsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}AdhocQueryRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}GetContentRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}AddSlotsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}RemoveSlotsRequest"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}RegistryResponse"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}RegistryProfile"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "submitObjectsRequest",
    "updateObjectsRequest",
    "approveObjectsRequest",
    "deprecateObjectsRequest",
    "removeObjectsRequest",
    "adhocQueryRequest",
    "getContentRequest",
    "addSlotsRequest",
    "removeSlotsRequest",
    "registryResponse",
    "registryProfile"
})
@XmlRootElement(name = "RootElement")
public class RootElement {

    @XmlElement(name = "SubmitObjectsRequest")
    protected SubmitObjectsRequest submitObjectsRequest;
    @XmlElement(name = "UpdateObjectsRequest")
    protected UpdateObjectsRequest updateObjectsRequest;
    @XmlElement(name = "ApproveObjectsRequest")
    protected ApproveObjectsRequest approveObjectsRequest;
    @XmlElement(name = "DeprecateObjectsRequest")
    protected DeprecateObjectsRequest deprecateObjectsRequest;
    @XmlElement(name = "RemoveObjectsRequest")
    protected RemoveObjectsRequest removeObjectsRequest;
    @XmlElement(name = "AdhocQueryRequest", namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1")
    protected AdhocQueryRequest adhocQueryRequest;
    @XmlElement(name = "GetContentRequest", namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1")
    protected GetContentRequest getContentRequest;
    @XmlElement(name = "AddSlotsRequest")
    protected AddSlotsRequest addSlotsRequest;
    @XmlElement(name = "RemoveSlotsRequest")
    protected RemoveSlotsRequest removeSlotsRequest;
    @XmlElement(name = "RegistryResponse")
    protected RegistryResponse registryResponse;
    @XmlElement(name = "RegistryProfile")
    protected RegistryProfile registryProfile;

    /**
     * Gets the value of the submitObjectsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitObjectsRequest }
     *     
     */
    public SubmitObjectsRequest getSubmitObjectsRequest() {
        return submitObjectsRequest;
    }

    /**
     * Sets the value of the submitObjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitObjectsRequest }
     *     
     */
    public void setSubmitObjectsRequest(SubmitObjectsRequest value) {
        this.submitObjectsRequest = value;
    }

    /**
     * Gets the value of the updateObjectsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateObjectsRequest }
     *     
     */
    public UpdateObjectsRequest getUpdateObjectsRequest() {
        return updateObjectsRequest;
    }

    /**
     * Sets the value of the updateObjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateObjectsRequest }
     *     
     */
    public void setUpdateObjectsRequest(UpdateObjectsRequest value) {
        this.updateObjectsRequest = value;
    }

    /**
     * Gets the value of the approveObjectsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ApproveObjectsRequest }
     *     
     */
    public ApproveObjectsRequest getApproveObjectsRequest() {
        return approveObjectsRequest;
    }

    /**
     * Sets the value of the approveObjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproveObjectsRequest }
     *     
     */
    public void setApproveObjectsRequest(ApproveObjectsRequest value) {
        this.approveObjectsRequest = value;
    }

    /**
     * Gets the value of the deprecateObjectsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeprecateObjectsRequest }
     *     
     */
    public DeprecateObjectsRequest getDeprecateObjectsRequest() {
        return deprecateObjectsRequest;
    }

    /**
     * Sets the value of the deprecateObjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeprecateObjectsRequest }
     *     
     */
    public void setDeprecateObjectsRequest(DeprecateObjectsRequest value) {
        this.deprecateObjectsRequest = value;
    }

    /**
     * Gets the value of the removeObjectsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveObjectsRequest }
     *     
     */
    public RemoveObjectsRequest getRemoveObjectsRequest() {
        return removeObjectsRequest;
    }

    /**
     * Sets the value of the removeObjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveObjectsRequest }
     *     
     */
    public void setRemoveObjectsRequest(RemoveObjectsRequest value) {
        this.removeObjectsRequest = value;
    }

    /**
     * Gets the value of the adhocQueryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryRequest }
     *     
     */
    public AdhocQueryRequest getAdhocQueryRequest() {
        return adhocQueryRequest;
    }

    /**
     * Sets the value of the adhocQueryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryRequest }
     *     
     */
    public void setAdhocQueryRequest(AdhocQueryRequest value) {
        this.adhocQueryRequest = value;
    }

    /**
     * Gets the value of the getContentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetContentRequest }
     *     
     */
    public GetContentRequest getGetContentRequest() {
        return getContentRequest;
    }

    /**
     * Sets the value of the getContentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContentRequest }
     *     
     */
    public void setGetContentRequest(GetContentRequest value) {
        this.getContentRequest = value;
    }

    /**
     * Gets the value of the addSlotsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddSlotsRequest }
     *     
     */
    public AddSlotsRequest getAddSlotsRequest() {
        return addSlotsRequest;
    }

    /**
     * Sets the value of the addSlotsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddSlotsRequest }
     *     
     */
    public void setAddSlotsRequest(AddSlotsRequest value) {
        this.addSlotsRequest = value;
    }

    /**
     * Gets the value of the removeSlotsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveSlotsRequest }
     *     
     */
    public RemoveSlotsRequest getRemoveSlotsRequest() {
        return removeSlotsRequest;
    }

    /**
     * Sets the value of the removeSlotsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveSlotsRequest }
     *     
     */
    public void setRemoveSlotsRequest(RemoveSlotsRequest value) {
        this.removeSlotsRequest = value;
    }

    /**
     * Gets the value of the registryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryResponse }
     *     
     */
    public RegistryResponse getRegistryResponse() {
        return registryResponse;
    }

    /**
     * Sets the value of the registryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryResponse }
     *     
     */
    public void setRegistryResponse(RegistryResponse value) {
        this.registryResponse = value;
    }

    /**
     * Gets the value of the registryProfile property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryProfile }
     *     
     */
    public RegistryProfile getRegistryProfile() {
        return registryProfile;
    }

    /**
     * Sets the value of the registryProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryProfile }
     *     
     */
    public void setRegistryProfile(RegistryProfile value) {
        this.registryProfile = value;
    }

}
