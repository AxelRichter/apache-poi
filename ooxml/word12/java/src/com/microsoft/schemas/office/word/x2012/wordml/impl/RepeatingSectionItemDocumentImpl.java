/*
 * An XML document type.
 * Localname: repeatingSectionItem
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one repeatingSectionItem(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class RepeatingSectionItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionItemDocument {
    private static final long serialVersionUID = 1L;

    public RepeatingSectionItemDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "repeatingSectionItem"),
    };


    /**
     * Gets the "repeatingSectionItem" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getRepeatingSectionItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "repeatingSectionItem" element
     */
    @Override
    public void setRepeatingSectionItem(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty repeatingSectionItem) {
        generatedSetterHelperImpl(repeatingSectionItem, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "repeatingSectionItem" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewRepeatingSectionItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
