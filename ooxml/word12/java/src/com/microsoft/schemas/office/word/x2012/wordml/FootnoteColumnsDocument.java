/*
 * An XML document type.
 * Localname: footnoteColumns
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.FootnoteColumnsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one footnoteColumns(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface FootnoteColumnsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.FootnoteColumnsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "footnotecolumnsc867doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "footnoteColumns" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getFootnoteColumns();

    /**
     * Sets the "footnoteColumns" element
     */
    void setFootnoteColumns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber footnoteColumns);

    /**
     * Appends and returns a new empty "footnoteColumns" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewFootnoteColumns();
}
