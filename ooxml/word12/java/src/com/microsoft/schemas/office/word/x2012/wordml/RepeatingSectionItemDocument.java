/*
 * An XML document type.
 * Localname: repeatingSectionItem
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one repeatingSectionItem(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface RepeatingSectionItemDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionItemDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "repeatingsectionitem9a41doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "repeatingSectionItem" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getRepeatingSectionItem();

    /**
     * Sets the "repeatingSectionItem" element
     */
    void setRepeatingSectionItem(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty repeatingSectionItem);

    /**
     * Appends and returns a new empty "repeatingSectionItem" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewRepeatingSectionItem();
}
