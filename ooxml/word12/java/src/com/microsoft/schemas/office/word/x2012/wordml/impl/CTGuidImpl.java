/*
 * XML Type:  CT_Guid
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTGuid
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_Guid(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTGuidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTGuid {
    private static final long serialVersionUID = 1L;

    public CTGuidImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public java.lang.String getVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.STGuid xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.STGuid target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "val" attribute
     */
    @Override
    public boolean isSetVal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(java.lang.String val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(com.microsoft.schemas.office.word.x2012.wordml.STGuid val) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.STGuid target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2012.wordml.STGuid)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(val);
        }
    }

    /**
     * Unsets the "val" attribute
     */
    @Override
    public void unsetVal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
