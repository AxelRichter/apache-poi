/*
 * XML Type:  CT_CommentsEx
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_CommentsEx(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is a complex type.
 */
public interface CTCommentsEx extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.CTCommentsEx> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "ctcommentsexc37ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "commentEx" elements
     */
    java.util.List<com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx> getCommentExList();

    /**
     * Gets array of all "commentEx" elements
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx[] getCommentExArray();

    /**
     * Gets ith "commentEx" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx getCommentExArray(int i);

    /**
     * Returns number of "commentEx" element
     */
    int sizeOfCommentExArray();

    /**
     * Sets array of all "commentEx" element
     */
    void setCommentExArray(com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx[] commentExArray);

    /**
     * Sets ith "commentEx" element
     */
    void setCommentExArray(int i, com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx commentEx);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentEx" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx insertNewCommentEx(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "commentEx" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTCommentEx addNewCommentEx();

    /**
     * Removes the ith "commentEx" element
     */
    void removeCommentEx(int i);
}
