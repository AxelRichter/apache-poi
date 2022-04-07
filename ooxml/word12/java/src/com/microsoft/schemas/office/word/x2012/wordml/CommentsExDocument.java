/*
 * An XML document type.
 * Localname: commentsEx
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CommentsExDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one commentsEx(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface CommentsExDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CommentsExDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "commentsex5babdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "commentsEx" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx getCommentsEx();

    /**
     * Sets the "commentsEx" element
     */
    void setCommentsEx(com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx commentsEx);

    /**
     * Appends and returns a new empty "commentsEx" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx addNewCommentsEx();
}
