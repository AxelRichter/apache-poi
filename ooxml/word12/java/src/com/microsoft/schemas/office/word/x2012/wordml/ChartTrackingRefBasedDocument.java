/*
 * An XML document type.
 * Localname: chartTrackingRefBased
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.ChartTrackingRefBasedDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one chartTrackingRefBased(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface ChartTrackingRefBasedDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.ChartTrackingRefBasedDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "charttrackingrefbasedb44fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "chartTrackingRefBased" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getChartTrackingRefBased();

    /**
     * Sets the "chartTrackingRefBased" element
     */
    void setChartTrackingRefBased(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff chartTrackingRefBased);

    /**
     * Appends and returns a new empty "chartTrackingRefBased" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewChartTrackingRefBased();
}
