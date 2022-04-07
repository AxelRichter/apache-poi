/*
 * An XML document type.
 * Localname: docId
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.DocIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one docId(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class DocIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.DocIdDocument {
    private static final long serialVersionUID = 1L;

    public DocIdDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "docId"),
    };


    /**
     * Gets the "docId" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTGuid getDocId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTGuid target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTGuid)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "docId" element
     */
    @Override
    public void setDocId(com.microsoft.schemas.office.word.x2012.wordml.CTGuid docId) {
        generatedSetterHelperImpl(docId, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "docId" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTGuid addNewDocId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTGuid target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTGuid)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
