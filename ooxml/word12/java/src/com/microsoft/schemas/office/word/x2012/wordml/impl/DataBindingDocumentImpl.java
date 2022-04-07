/*
 * An XML document type.
 * Localname: dataBinding
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.DataBindingDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one dataBinding(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class DataBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.DataBindingDocument {
    private static final long serialVersionUID = 1L;

    public DataBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "dataBinding"),
    };


    /**
     * Gets the "dataBinding" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding getDataBinding() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "dataBinding" element
     */
    @Override
    public void setDataBinding(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding dataBinding) {
        generatedSetterHelperImpl(dataBinding, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dataBinding" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding addNewDataBinding() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
