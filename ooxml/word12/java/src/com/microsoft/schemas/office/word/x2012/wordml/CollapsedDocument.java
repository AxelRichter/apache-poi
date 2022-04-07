/*
 * An XML document type.
 * Localname: collapsed
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CollapsedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one collapsed(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface CollapsedDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CollapsedDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "collapsed3b6ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "collapsed" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getCollapsed();

    /**
     * Sets the "collapsed" element
     */
    void setCollapsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff collapsed);

    /**
     * Appends and returns a new empty "collapsed" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewCollapsed();
}
