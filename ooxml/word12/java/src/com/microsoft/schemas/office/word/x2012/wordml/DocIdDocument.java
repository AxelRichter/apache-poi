/*
 * An XML document type.
 * Localname: docId
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.DocIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one docId(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface DocIdDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.DocIdDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "docid4b51doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "docId" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTGuid getDocId();

    /**
     * Sets the "docId" element
     */
    void setDocId(com.microsoft.schemas.office.word.x2012.wordml.CTGuid docId);

    /**
     * Appends and returns a new empty "docId" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTGuid addNewDocId();
}
