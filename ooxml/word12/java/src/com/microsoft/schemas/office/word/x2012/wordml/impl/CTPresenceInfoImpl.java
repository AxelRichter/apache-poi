/*
 * XML Type:  CT_PresenceInfo
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_PresenceInfo(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTPresenceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTPresenceInfo {
    private static final long serialVersionUID = 1L;

    public CTPresenceInfoImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "providerId"),
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "userId"),
    };


    /**
     * Gets the "providerId" attribute
     */
    @Override
    public java.lang.String getProviderId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "providerId" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetProviderId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "providerId" attribute
     */
    @Override
    public void setProviderId(java.lang.String providerId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(providerId);
        }
    }

    /**
     * Sets (as xml) the "providerId" attribute
     */
    @Override
    public void xsetProviderId(org.apache.xmlbeans.XmlString providerId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(providerId);
        }
    }

    /**
     * Gets the "userId" attribute
     */
    @Override
    public java.lang.String getUserId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "userId" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetUserId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "userId" attribute
     */
    @Override
    public void setUserId(java.lang.String userId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(userId);
        }
    }

    /**
     * Sets (as xml) the "userId" attribute
     */
    @Override
    public void xsetUserId(org.apache.xmlbeans.XmlString userId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(userId);
        }
    }
}
