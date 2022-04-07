/*
 * An XML document type.
 * Localname: color
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.ColorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one color(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class ColorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.ColorDocument {
    private static final long serialVersionUID = 1L;

    public ColorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "color"),
    };


    /**
     * Gets the "color" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor getColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "color" element
     */
    @Override
    public void setColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor color) {
        generatedSetterHelperImpl(color, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "color" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor addNewColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
