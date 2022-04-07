/*
 * An XML attribute type.
 * Localname: restartNumberingAfterBreak
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.RestartNumberingAfterBreakAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one restartNumberingAfterBreak(@http://schemas.microsoft.com/office/word/2012/wordml) attribute.
 *
 * This is a complex type.
 */
public interface RestartNumberingAfterBreakAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.RestartNumberingAfterBreakAttribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "restartnumberingafterbreak8873attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "restartNumberingAfterBreak" attribute
     */
    java.lang.Object getRestartNumberingAfterBreak();

    /**
     * Gets (as xml) the "restartNumberingAfterBreak" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff xgetRestartNumberingAfterBreak();

    /**
     * True if has "restartNumberingAfterBreak" attribute
     */
    boolean isSetRestartNumberingAfterBreak();

    /**
     * Sets the "restartNumberingAfterBreak" attribute
     */
    void setRestartNumberingAfterBreak(java.lang.Object restartNumberingAfterBreak);

    /**
     * Sets (as xml) the "restartNumberingAfterBreak" attribute
     */
    void xsetRestartNumberingAfterBreak(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff restartNumberingAfterBreak);

    /**
     * Unsets the "restartNumberingAfterBreak" attribute
     */
    void unsetRestartNumberingAfterBreak();
}
