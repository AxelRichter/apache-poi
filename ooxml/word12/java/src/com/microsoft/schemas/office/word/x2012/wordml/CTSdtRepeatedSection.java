/*
 * XML Type:  CT_SdtRepeatedSection
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SdtRepeatedSection(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTSdtRepeatedSection extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctsdtrepeatedsection999etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "sectionTitle" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getSectionTitle();

    /**
     * True if has "sectionTitle" element
     */
    boolean isSetSectionTitle();

    /**
     * Sets the "sectionTitle" element
     */
    void setSectionTitle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString sectionTitle);

    /**
     * Appends and returns a new empty "sectionTitle" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewSectionTitle();

    /**
     * Unsets the "sectionTitle" element
     */
    void unsetSectionTitle();

    /**
     * Gets the "doNotAllowInsertDeleteSection" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotAllowInsertDeleteSection();

    /**
     * True if has "doNotAllowInsertDeleteSection" element
     */
    boolean isSetDoNotAllowInsertDeleteSection();

    /**
     * Sets the "doNotAllowInsertDeleteSection" element
     */
    void setDoNotAllowInsertDeleteSection(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotAllowInsertDeleteSection);

    /**
     * Appends and returns a new empty "doNotAllowInsertDeleteSection" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotAllowInsertDeleteSection();

    /**
     * Unsets the "doNotAllowInsertDeleteSection" element
     */
    void unsetDoNotAllowInsertDeleteSection();
}
