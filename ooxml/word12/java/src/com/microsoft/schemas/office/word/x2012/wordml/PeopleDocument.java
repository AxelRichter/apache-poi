/*
 * An XML document type.
 * Localname: people
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.PeopleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one people(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface PeopleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.PeopleDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "people9b63doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "people" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPeople getPeople();

    /**
     * Sets the "people" element
     */
    void setPeople(com.microsoft.schemas.office.word.x2012.wordml.CTPeople people);

    /**
     * Appends and returns a new empty "people" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPeople addNewPeople();
}
