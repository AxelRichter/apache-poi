/*
 * XML Type:  CT_PresenceInfo
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PresenceInfo(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTPresenceInfo extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctpresenceinfo677dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "providerId" attribute
     */
    java.lang.String getProviderId();

    /**
     * Gets (as xml) the "providerId" attribute
     */
    org.apache.xmlbeans.XmlString xgetProviderId();

    /**
     * Sets the "providerId" attribute
     */
    void setProviderId(java.lang.String providerId);

    /**
     * Sets (as xml) the "providerId" attribute
     */
    void xsetProviderId(org.apache.xmlbeans.XmlString providerId);

    /**
     * Gets the "userId" attribute
     */
    java.lang.String getUserId();

    /**
     * Gets (as xml) the "userId" attribute
     */
    org.apache.xmlbeans.XmlString xgetUserId();

    /**
     * Sets the "userId" attribute
     */
    void setUserId(java.lang.String userId);

    /**
     * Sets (as xml) the "userId" attribute
     */
    void xsetUserId(org.apache.xmlbeans.XmlString userId);
}
