/*
 * An XML document type.
 * Localname: collapsed
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CollapsedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one collapsed(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class CollapsedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CollapsedDocument {
    private static final long serialVersionUID = 1L;

    public CollapsedDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "collapsed"),
    };


    /**
     * Gets the "collapsed" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getCollapsed() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "collapsed" element
     */
    @Override
    public void setCollapsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff collapsed) {
        generatedSetterHelperImpl(collapsed, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "collapsed" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewCollapsed() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
