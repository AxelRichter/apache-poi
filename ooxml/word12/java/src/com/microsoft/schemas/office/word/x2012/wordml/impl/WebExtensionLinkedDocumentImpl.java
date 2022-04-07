/*
 * An XML document type.
 * Localname: webExtensionLinked
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.WebExtensionLinkedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one webExtensionLinked(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class WebExtensionLinkedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.WebExtensionLinkedDocument {
    private static final long serialVersionUID = 1L;

    public WebExtensionLinkedDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "webExtensionLinked"),
    };


    /**
     * Gets the "webExtensionLinked" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getWebExtensionLinked() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "webExtensionLinked" element
     */
    @Override
    public void setWebExtensionLinked(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff webExtensionLinked) {
        generatedSetterHelperImpl(webExtensionLinked, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "webExtensionLinked" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewWebExtensionLinked() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
