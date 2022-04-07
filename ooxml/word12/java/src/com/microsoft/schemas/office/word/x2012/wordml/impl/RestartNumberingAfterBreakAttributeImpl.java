/*
 * An XML attribute type.
 * Localname: restartNumberingAfterBreak
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.RestartNumberingAfterBreakAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one restartNumberingAfterBreak(@http://schemas.microsoft.com/office/word/2012/wordml) attribute.
 *
 * This is a complex type.
 */
public class RestartNumberingAfterBreakAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.RestartNumberingAfterBreakAttribute {
    private static final long serialVersionUID = 1L;

    public RestartNumberingAfterBreakAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "restartNumberingAfterBreak"),
    };


    /**
     * Gets the "restartNumberingAfterBreak" attribute
     */
    @Override
    public java.lang.Object getRestartNumberingAfterBreak() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "restartNumberingAfterBreak" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff xgetRestartNumberingAfterBreak() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "restartNumberingAfterBreak" attribute
     */
    @Override
    public boolean isSetRestartNumberingAfterBreak() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "restartNumberingAfterBreak" attribute
     */
    @Override
    public void setRestartNumberingAfterBreak(java.lang.Object restartNumberingAfterBreak) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setObjectValue(restartNumberingAfterBreak);
        }
    }

    /**
     * Sets (as xml) the "restartNumberingAfterBreak" attribute
     */
    @Override
    public void xsetRestartNumberingAfterBreak(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff restartNumberingAfterBreak) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(restartNumberingAfterBreak);
        }
    }

    /**
     * Unsets the "restartNumberingAfterBreak" attribute
     */
    @Override
    public void unsetRestartNumberingAfterBreak() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
