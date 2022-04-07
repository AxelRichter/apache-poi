/*
 * XML Type:  CT_SdtAppearance
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_SdtAppearance(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTSdtAppearanceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance {
    private static final long serialVersionUID = 1L;

    public CTSdtAppearanceImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance.Enum getVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance)get_store().find_attribute_user(PROPERTY_QNAME[0]);
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
    public void setVal(com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance.Enum val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance val) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance)get_store().add_attribute_user(PROPERTY_QNAME[0]);
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
