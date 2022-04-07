/*
 * An XML document type.
 * Localname: appearance
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.AppearanceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one appearance(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface AppearanceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.AppearanceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "appearancec12edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "appearance" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance getAppearance();

    /**
     * Sets the "appearance" element
     */
    void setAppearance(com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance appearance);

    /**
     * Appends and returns a new empty "appearance" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance addNewAppearance();
}
