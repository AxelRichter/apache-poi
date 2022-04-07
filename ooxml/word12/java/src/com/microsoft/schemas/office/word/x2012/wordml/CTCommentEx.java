/*
 * XML Type:  CT_CommentEx
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_CommentEx(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTCommentEx extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctcommentexfadetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "paraId" attribute
     */
    byte[] getParaId();

    /**
     * Gets (as xml) the "paraId" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetParaId();

    /**
     * Sets the "paraId" attribute
     */
    void setParaId(byte[] paraId);

    /**
     * Sets (as xml) the "paraId" attribute
     */
    void xsetParaId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber paraId);

    /**
     * Gets the "paraIdParent" attribute
     */
    byte[] getParaIdParent();

    /**
     * Gets (as xml) the "paraIdParent" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetParaIdParent();

    /**
     * True if has "paraIdParent" attribute
     */
    boolean isSetParaIdParent();

    /**
     * Sets the "paraIdParent" attribute
     */
    void setParaIdParent(byte[] paraIdParent);

    /**
     * Sets (as xml) the "paraIdParent" attribute
     */
    void xsetParaIdParent(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber paraIdParent);

    /**
     * Unsets the "paraIdParent" attribute
     */
    void unsetParaIdParent();

    /**
     * Gets the "done" attribute
     */
    java.lang.Object getDone();

    /**
     * Gets (as xml) the "done" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff xgetDone();

    /**
     * True if has "done" attribute
     */
    boolean isSetDone();

    /**
     * Sets the "done" attribute
     */
    void setDone(java.lang.Object done);

    /**
     * Sets (as xml) the "done" attribute
     */
    void xsetDone(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff done);

    /**
     * Unsets the "done" attribute
     */
    void unsetDone();
}
