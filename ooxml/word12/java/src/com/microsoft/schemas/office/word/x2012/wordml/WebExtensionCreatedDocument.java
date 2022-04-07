/*
 * An XML document type.
 * Localname: webExtensionCreated
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.WebExtensionCreatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one webExtensionCreated(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface WebExtensionCreatedDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.WebExtensionCreatedDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "webextensioncreatedfd27doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "webExtensionCreated" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getWebExtensionCreated();

    /**
     * Sets the "webExtensionCreated" element
     */
    void setWebExtensionCreated(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff webExtensionCreated);

    /**
     * Appends and returns a new empty "webExtensionCreated" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewWebExtensionCreated();
}
