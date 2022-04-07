/*
 * XML Type:  ST_SdtAppearance
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_SdtAppearance(@http://schemas.microsoft.com/office/word/2012/wordml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance.
 */
public interface STSdtAppearance extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s18397D3AC03E69A07D1A126257F17750.TypeSystemHolder.typeSystem, "stsdtappearance49f9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum BOUNDING_BOX = Enum.forString("boundingBox");
    Enum TAGS = Enum.forString("tags");
    Enum HIDDEN = Enum.forString("hidden");

    int INT_BOUNDING_BOX = Enum.INT_BOUNDING_BOX;
    int INT_TAGS = Enum.INT_TAGS;
    int INT_HIDDEN = Enum.INT_HIDDEN;

    /**
     * Enumeration value class for com.microsoft.schemas.office.word.x2012.wordml.STSdtAppearance.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BOUNDING_BOX
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        static final int INT_BOUNDING_BOX = 1;
        static final int INT_TAGS = 2;
        static final int INT_HIDDEN = 3;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("boundingBox", INT_BOUNDING_BOX),
            new Enum("tags", INT_TAGS),
            new Enum("hidden", INT_HIDDEN),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
