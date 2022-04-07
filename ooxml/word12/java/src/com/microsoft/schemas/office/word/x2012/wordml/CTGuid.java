/*
 * XML Type:  CT_Guid
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTGuid
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Guid(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTGuid extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTGuid> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctguid643dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    java.lang.String getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    com.microsoft.schemas.office.word.x2012.wordml.STGuid xgetVal();

    /**
     * True if has "val" attribute
     */
    boolean isSetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(java.lang.String val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(com.microsoft.schemas.office.word.x2012.wordml.STGuid val);

    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
}
