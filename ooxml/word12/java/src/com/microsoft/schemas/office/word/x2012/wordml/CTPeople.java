/*
 * XML Type:  CT_People
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTPeople
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_People(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTPeople extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTPeople> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctpeople0d37type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "person" elements
     */
    java.util.List<com.microsoft.schemas.office.word.x2012.wordml.CTPerson> getPersonList();

    /**
     * Gets array of all "person" elements
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPerson[] getPersonArray();

    /**
     * Gets ith "person" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPerson getPersonArray(int i);

    /**
     * Returns number of "person" element
     */
    int sizeOfPersonArray();

    /**
     * Sets array of all "person" element
     */
    void setPersonArray(com.microsoft.schemas.office.word.x2012.wordml.CTPerson[] personArray);

    /**
     * Sets ith "person" element
     */
    void setPersonArray(int i, com.microsoft.schemas.office.word.x2012.wordml.CTPerson person);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPerson insertNewPerson(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTPerson addNewPerson();

    /**
     * Removes the ith "person" element
     */
    void removePerson(int i);
}
