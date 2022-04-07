/*
 * An XML document type.
 * Localname: repeatingSection
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one repeatingSection(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class RepeatingSectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionDocument {
    private static final long serialVersionUID = 1L;

    public RepeatingSectionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "repeatingSection"),
    };


    /**
     * Gets the "repeatingSection" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection getRepeatingSection() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "repeatingSection" element
     */
    @Override
    public void setRepeatingSection(com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection repeatingSection) {
        generatedSetterHelperImpl(repeatingSection, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "repeatingSection" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection addNewRepeatingSection() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
