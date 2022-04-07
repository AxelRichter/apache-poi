/*
 * An XML document type.
 * Localname: color
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.ColorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one color(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface ColorDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.ColorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "colorb261doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "color" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor getColor();

    /**
     * Sets the "color" element
     */
    void setColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor color);

    /**
     * Appends and returns a new empty "color" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor addNewColor();
}
