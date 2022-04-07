/*
 * XML Type:  CT_People
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTPeople
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_People(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTPeopleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTPeople {
    private static final long serialVersionUID = 1L;

    public CTPeopleImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "person"),
    };


    /**
     * Gets a List of "person" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2012.wordml.CTPerson> getPersonList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPersonArray,
                this::setPersonArray,
                this::insertNewPerson,
                this::removePerson,
                this::sizeOfPersonArray
            );
        }
    }

    /**
     * Gets array of all "person" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPerson[] getPersonArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.word.x2012.wordml.CTPerson[0]);
    }

    /**
     * Gets ith "person" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPerson getPersonArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPerson target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPerson)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "person" element
     */
    @Override
    public int sizeOfPersonArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "person" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPersonArray(com.microsoft.schemas.office.word.x2012.wordml.CTPerson[] personArray) {
        check_orphaned();
        arraySetterHelper(personArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "person" element
     */
    @Override
    public void setPersonArray(int i, com.microsoft.schemas.office.word.x2012.wordml.CTPerson person) {
        generatedSetterHelperImpl(person, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPerson insertNewPerson(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPerson target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPerson)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPerson addNewPerson() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPerson target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPerson)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "person" element
     */
    @Override
    public void removePerson(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
