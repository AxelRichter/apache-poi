/*
 * An XML document type.
 * Localname: people
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.PeopleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one people(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class PeopleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.PeopleDocument {
    private static final long serialVersionUID = 1L;

    public PeopleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "people"),
    };


    /**
     * Gets the "people" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPeople getPeople() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPeople target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPeople)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "people" element
     */
    @Override
    public void setPeople(com.microsoft.schemas.office.word.x2012.wordml.CTPeople people) {
        generatedSetterHelperImpl(people, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "people" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPeople addNewPeople() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPeople target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPeople)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
