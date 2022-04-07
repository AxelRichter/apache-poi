/*
 * XML Type:  CT_Person
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTPerson
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Person(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTPerson extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTPerson> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctperson9431type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "presenceInfo" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo getPresenceInfo();

    /**
     * True if has "presenceInfo" element
     */
    boolean isSetPresenceInfo();

    /**
     * Sets the "presenceInfo" element
     */
    void setPresenceInfo(com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo presenceInfo);

    /**
     * Appends and returns a new empty "presenceInfo" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo addNewPresenceInfo();

    /**
     * Unsets the "presenceInfo" element
     */
    void unsetPresenceInfo();

    /**
     * Gets the "author" attribute
     */
    java.lang.String getAuthor();

    /**
     * Gets (as xml) the "author" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString xgetAuthor();

    /**
     * Sets the "author" attribute
     */
    void setAuthor(java.lang.String author);

    /**
     * Sets (as xml) the "author" attribute
     */
    void xsetAuthor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString author);
}
