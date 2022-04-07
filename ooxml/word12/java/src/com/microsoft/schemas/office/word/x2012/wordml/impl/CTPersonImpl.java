/*
 * XML Type:  CT_Person
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTPerson
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_Person(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTPersonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTPerson {
    private static final long serialVersionUID = 1L;

    public CTPersonImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "presenceInfo"),
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "author"),
    };


    /**
     * Gets the "presenceInfo" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo getPresenceInfo() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "presenceInfo" element
     */
    @Override
    public boolean isSetPresenceInfo() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "presenceInfo" element
     */
    @Override
    public void setPresenceInfo(com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo presenceInfo) {
        generatedSetterHelperImpl(presenceInfo, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "presenceInfo" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo addNewPresenceInfo() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "presenceInfo" element
     */
    @Override
    public void unsetPresenceInfo() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "author" attribute
     */
    @Override
    public java.lang.String getAuthor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "author" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString xgetAuthor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "author" attribute
     */
    @Override
    public void setAuthor(java.lang.String author) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(author);
        }
    }

    /**
     * Sets (as xml) the "author" attribute
     */
    @Override
    public void xsetAuthor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString author) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(author);
        }
    }
}
