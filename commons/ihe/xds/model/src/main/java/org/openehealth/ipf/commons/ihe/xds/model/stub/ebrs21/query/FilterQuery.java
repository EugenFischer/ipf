//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.model.stub.ebrs21.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}RegistryObjectQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}RegistryEntryQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}AssociationQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}AuditableEventQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationNodeQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationSchemeQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}RegistryPackageQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ExtrinsicObjectQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}OrganizationQuery"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ServiceQuery"/>
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
    "registryObjectQuery",
    "registryEntryQuery",
    "associationQuery",
    "auditableEventQuery",
    "classificationQuery",
    "classificationNodeQuery",
    "classificationSchemeQuery",
    "registryPackageQuery",
    "extrinsicObjectQuery",
    "organizationQuery",
    "serviceQuery"
})
@XmlRootElement(name = "FilterQuery")
public class FilterQuery {

    @XmlElement(name = "RegistryObjectQuery")
    protected RegistryObjectQueryType registryObjectQuery;
    @XmlElement(name = "RegistryEntryQuery")
    protected RegistryEntryQueryType registryEntryQuery;
    @XmlElement(name = "AssociationQuery")
    protected AssociationQueryType associationQuery;
    @XmlElement(name = "AuditableEventQuery")
    protected AuditableEventQueryType auditableEventQuery;
    @XmlElement(name = "ClassificationQuery")
    protected ClassificationQueryType classificationQuery;
    @XmlElement(name = "ClassificationNodeQuery")
    protected ClassificationNodeQueryType classificationNodeQuery;
    @XmlElement(name = "ClassificationSchemeQuery")
    protected ClassificationSchemeQueryType classificationSchemeQuery;
    @XmlElement(name = "RegistryPackageQuery")
    protected RegistryPackageQueryType registryPackageQuery;
    @XmlElement(name = "ExtrinsicObjectQuery")
    protected ExtrinsicObjectQueryType extrinsicObjectQuery;
    @XmlElement(name = "OrganizationQuery")
    protected OrganizationQueryType organizationQuery;
    @XmlElement(name = "ServiceQuery")
    protected ServiceQueryType serviceQuery;

    /**
     * Gets the value of the registryObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getRegistryObjectQuery() {
        return registryObjectQuery;
    }

    /**
     * Sets the value of the registryObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setRegistryObjectQuery(RegistryObjectQueryType value) {
        this.registryObjectQuery = value;
    }

    /**
     * Gets the value of the registryEntryQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryEntryQueryType }
     *     
     */
    public RegistryEntryQueryType getRegistryEntryQuery() {
        return registryEntryQuery;
    }

    /**
     * Sets the value of the registryEntryQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryEntryQueryType }
     *     
     */
    public void setRegistryEntryQuery(RegistryEntryQueryType value) {
        this.registryEntryQuery = value;
    }

    /**
     * Gets the value of the associationQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationQueryType }
     *     
     */
    public AssociationQueryType getAssociationQuery() {
        return associationQuery;
    }

    /**
     * Sets the value of the associationQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationQueryType }
     *     
     */
    public void setAssociationQuery(AssociationQueryType value) {
        this.associationQuery = value;
    }

    /**
     * Gets the value of the auditableEventQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AuditableEventQueryType }
     *     
     */
    public AuditableEventQueryType getAuditableEventQuery() {
        return auditableEventQuery;
    }

    /**
     * Sets the value of the auditableEventQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditableEventQueryType }
     *     
     */
    public void setAuditableEventQuery(AuditableEventQueryType value) {
        this.auditableEventQuery = value;
    }

    /**
     * Gets the value of the classificationQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationQueryType }
     *     
     */
    public ClassificationQueryType getClassificationQuery() {
        return classificationQuery;
    }

    /**
     * Sets the value of the classificationQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationQueryType }
     *     
     */
    public void setClassificationQuery(ClassificationQueryType value) {
        this.classificationQuery = value;
    }

    /**
     * Gets the value of the classificationNodeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getClassificationNodeQuery() {
        return classificationNodeQuery;
    }

    /**
     * Sets the value of the classificationNodeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setClassificationNodeQuery(ClassificationNodeQueryType value) {
        this.classificationNodeQuery = value;
    }

    /**
     * Gets the value of the classificationSchemeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public ClassificationSchemeQueryType getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }

    /**
     * Sets the value of the classificationSchemeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public void setClassificationSchemeQuery(ClassificationSchemeQueryType value) {
        this.classificationSchemeQuery = value;
    }

    /**
     * Gets the value of the registryPackageQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryPackageQueryType }
     *     
     */
    public RegistryPackageQueryType getRegistryPackageQuery() {
        return registryPackageQuery;
    }

    /**
     * Sets the value of the registryPackageQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryPackageQueryType }
     *     
     */
    public void setRegistryPackageQuery(RegistryPackageQueryType value) {
        this.registryPackageQuery = value;
    }

    /**
     * Gets the value of the extrinsicObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ExtrinsicObjectQueryType }
     *     
     */
    public ExtrinsicObjectQueryType getExtrinsicObjectQuery() {
        return extrinsicObjectQuery;
    }

    /**
     * Sets the value of the extrinsicObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrinsicObjectQueryType }
     *     
     */
    public void setExtrinsicObjectQuery(ExtrinsicObjectQueryType value) {
        this.extrinsicObjectQuery = value;
    }

    /**
     * Gets the value of the organizationQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getOrganizationQuery() {
        return organizationQuery;
    }

    /**
     * Sets the value of the organizationQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setOrganizationQuery(OrganizationQueryType value) {
        this.organizationQuery = value;
    }

    /**
     * Gets the value of the serviceQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQueryType }
     *     
     */
    public ServiceQueryType getServiceQuery() {
        return serviceQuery;
    }

    /**
     * Sets the value of the serviceQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQueryType }
     *     
     */
    public void setServiceQuery(ServiceQueryType value) {
        this.serviceQuery = value;
    }

}
