/*
 * XML Type:  CT_CommentEx
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_CommentEx(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTCommentExImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx {
    private static final long serialVersionUID = 1L;

    public CTCommentExImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "paraId"),
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "paraIdParent"),
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "done"),
    };


    /**
     * Gets the "paraId" attribute
     */
    @Override
    public byte[] getParaId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "paraId" attribute
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetParaId() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "paraId" attribute
     */
    @Override
    public void setParaId(byte[] paraId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setByteArrayValue(paraId);
        }
    }

    /**
     * Sets (as xml) the "paraId" attribute
     */
    @Override
    public void xsetParaId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber paraId) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(paraId);
        }
    }

    /**
     * Gets the "paraIdParent" attribute
     */
    @Override
    public byte[] getParaIdParent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "paraIdParent" attribute
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetParaIdParent() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "paraIdParent" attribute
     */
    @Override
    public boolean isSetParaIdParent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "paraIdParent" attribute
     */
    @Override
    public void setParaIdParent(byte[] paraIdParent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setByteArrayValue(paraIdParent);
        }
    }

    /**
     * Sets (as xml) the "paraIdParent" attribute
     */
    @Override
    public void xsetParaIdParent(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber paraIdParent) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(paraIdParent);
        }
    }

    /**
     * Unsets the "paraIdParent" attribute
     */
    @Override
    public void unsetParaIdParent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "done" attribute
     */
    @Override
    public java.lang.Object getDone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "done" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff xgetDone() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "done" attribute
     */
    @Override
    public boolean isSetDone() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "done" attribute
     */
    @Override
    public void setDone(java.lang.Object done) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setObjectValue(done);
        }
    }

    /**
     * Sets (as xml) the "done" attribute
     */
    @Override
    public void xsetDone(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff done) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(done);
        }
    }

    /**
     * Unsets the "done" attribute
     */
    @Override
    public void unsetDone() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
