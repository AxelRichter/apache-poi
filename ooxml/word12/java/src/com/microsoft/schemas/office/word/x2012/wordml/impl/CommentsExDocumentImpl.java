/*
 * An XML document type.
 * Localname: commentsEx
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CommentsExDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one commentsEx(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class CommentsExDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CommentsExDocument {
    private static final long serialVersionUID = 1L;

    public CommentsExDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "commentsEx"),
    };


    /**
     * Gets the "commentsEx" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx getCommentsEx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "commentsEx" element
     */
    @Override
    public void setCommentsEx(com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx commentsEx) {
        generatedSetterHelperImpl(commentsEx, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "commentsEx" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx addNewCommentsEx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
