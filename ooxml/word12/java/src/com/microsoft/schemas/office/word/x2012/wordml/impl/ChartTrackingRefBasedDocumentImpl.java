/*
 * An XML document type.
 * Localname: chartTrackingRefBased
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.ChartTrackingRefBasedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one chartTrackingRefBased(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public class ChartTrackingRefBasedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2012.wordml.ChartTrackingRefBasedDocument {
    private static final long serialVersionUID = 1L;

    public ChartTrackingRefBasedDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2012/wordml", "chartTrackingRefBased"),
    };


    /**
     * Gets the "chartTrackingRefBased" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getChartTrackingRefBased() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "chartTrackingRefBased" element
     */
    @Override
    public void setChartTrackingRefBased(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff chartTrackingRefBased) {
        generatedSetterHelperImpl(chartTrackingRefBased, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "chartTrackingRefBased" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewChartTrackingRefBased() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
