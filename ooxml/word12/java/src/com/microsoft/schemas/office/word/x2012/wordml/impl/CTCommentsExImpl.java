/*
 * XML Type:  CT_CommentsEx
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_CommentsEx(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public class CTCommentsExImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx {
    private static final long serialVersionUID = 1L;

    public CTCommentsExImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "commentEx"),
    };


    /**
     * Gets a List of "commentEx" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx> getCommentExList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCommentExArray,
                this::setCommentExArray,
                this::insertNewCommentEx,
                this::removeCommentEx,
                this::sizeOfCommentExArray
            );
        }
    }

    /**
     * Gets array of all "commentEx" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx[] getCommentExArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx[0]);
    }

    /**
     * Gets ith "commentEx" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx getCommentExArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "commentEx" element
     */
    @Override
    public int sizeOfCommentExArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "commentEx" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCommentExArray(com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx[] commentExArray) {
        check_orphaned();
        arraySetterHelper(commentExArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "commentEx" element
     */
    @Override
    public void setCommentExArray(int i, com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx commentEx) {
        generatedSetterHelperImpl(commentEx, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentEx" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx insertNewCommentEx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "commentEx" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx addNewCommentEx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx target = null;
            target = (com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "commentEx" element
     */
    @Override
    public void removeCommentEx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
