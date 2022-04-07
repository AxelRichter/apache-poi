/*
 * An XML document type.
 * Localname: dataBinding
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.DataBindingDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one dataBinding(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface DataBindingDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.DataBindingDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "databindingee89doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dataBinding" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding getDataBinding();

    /**
     * Sets the "dataBinding" element
     */
    void setDataBinding(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding dataBinding);

    /**
     * Appends and returns a new empty "dataBinding" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding addNewDataBinding();
}
