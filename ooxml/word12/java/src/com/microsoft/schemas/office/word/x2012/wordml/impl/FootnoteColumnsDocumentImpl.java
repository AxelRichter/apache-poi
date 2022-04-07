/*
 * An XML document type.
 * Localname: footnoteColumns
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.FootnoteColumnsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one footnoteColumns(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class FootnoteColumnsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.FootnoteColumnsDocument {
    private static final long serialVersionUID = 1L;

    public FootnoteColumnsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "footnoteColumns"),
    };


    /**
     * Gets the "footnoteColumns" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getFootnoteColumns() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "footnoteColumns" element
     */
    @Override
    public void setFootnoteColumns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber footnoteColumns) {
        generatedSetterHelperImpl(footnoteColumns, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "footnoteColumns" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewFootnoteColumns() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
