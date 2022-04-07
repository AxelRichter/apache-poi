/*
 * An XML document type.
 * Localname: appearance
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.AppearanceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one appearance(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class AppearanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.AppearanceDocument {
    private static final long serialVersionUID = 1L;

    public AppearanceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "appearance"),
    };


    /**
     * Gets the "appearance" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance getAppearance() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "appearance" element
     */
    @Override
    public void setAppearance(com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance appearance) {
        generatedSetterHelperImpl(appearance, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "appearance" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance addNewAppearance() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTSdtAppearance)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
