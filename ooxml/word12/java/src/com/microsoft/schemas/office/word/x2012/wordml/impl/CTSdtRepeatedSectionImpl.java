/*
 * XML Type:  CT_SdtRepeatedSection
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_SdtRepeatedSection(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTSdtRepeatedSectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection {
    private static final long serialVersionUID = 1L;

    public CTSdtRepeatedSectionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "sectionTitle"),
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "doNotAllowInsertDeleteSection"),
    };


    /**
     * Gets the "sectionTitle" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getSectionTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sectionTitle" element
     */
    @Override
    public boolean isSetSectionTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "sectionTitle" element
     */
    @Override
    public void setSectionTitle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString sectionTitle) {
        generatedSetterHelperImpl(sectionTitle, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "sectionTitle" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewSectionTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "sectionTitle" element
     */
    @Override
    public void unsetSectionTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "doNotAllowInsertDeleteSection" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotAllowInsertDeleteSection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "doNotAllowInsertDeleteSection" element
     */
    @Override
    public boolean isSetDoNotAllowInsertDeleteSection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "doNotAllowInsertDeleteSection" element
     */
    @Override
    public void setDoNotAllowInsertDeleteSection(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotAllowInsertDeleteSection) {
        generatedSetterHelperImpl(doNotAllowInsertDeleteSection, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "doNotAllowInsertDeleteSection" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotAllowInsertDeleteSection() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "doNotAllowInsertDeleteSection" element
     */
    @Override
    public void unsetDoNotAllowInsertDeleteSection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
