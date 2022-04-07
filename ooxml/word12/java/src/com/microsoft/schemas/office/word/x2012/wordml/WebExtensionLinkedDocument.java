/*
 * An XML document type.
 * Localname: webExtensionLinked
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.WebExtensionLinkedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one webExtensionLinked(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface WebExtensionLinkedDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.WebExtensionLinkedDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "webextensionlinked554edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "webExtensionLinked" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getWebExtensionLinked();

    /**
     * Sets the "webExtensionLinked" element
     */
    void setWebExtensionLinked(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff webExtensionLinked);

    /**
     * Appends and returns a new empty "webExtensionLinked" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewWebExtensionLinked();
}
