import java.io.*;

import org.apache.poi.openxml4j.opc.*;
import org.apache.xmlbeans.*;

import org.apache.poi.xwpf.usermodel.*;

import org.apache.poi.ooxml.*;
import static org.apache.poi.ooxml.POIXMLTypeLoader.DEFAULT_XML_OPTIONS;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import com.microsoft.schemas.office.word.x2012.wordml.*;

import javax.xml.namespace.QName;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Locale;


public class CreateWordWithCommentsAndCommentsEx {

//a method for creating the CommentsDocument /word/comments.xml in the *.docx ZIP archive  
 private static MyXWPFCommentsDocument createCommentsDocument(XWPFDocument document) throws Exception {
  OPCPackage oPCPackage = document.getPackage();
  PackagePartName partName = PackagingURIHelper.createPartName("/word/comments.xml");
  PackagePart part = oPCPackage.createPart(partName, "application/vnd.openxmlformats-officedocument.wordprocessingml.comments+xml");
  MyXWPFCommentsDocument myXWPFCommentsDocument = new MyXWPFCommentsDocument(part);
 
  String rId = document.addRelation(null, XWPFRelation.COMMENT, myXWPFCommentsDocument).getRelationship().getId();

  return myXWPFCommentsDocument;
 }
 
//a method for creating the CommentsExtendedDocument /word/commentsExtended.xml in the *.docx ZIP archive  
 private static MyXWPFCommentsExtendedDocument createCommentsExtendedDocument(XWPFDocument document) throws Exception {
  OPCPackage oPCPackage = document.getPackage();
  PackagePartName partName = PackagingURIHelper.createPartName("/word/commentsExtended.xml");
  PackagePart part = oPCPackage.createPart(partName, "application/vnd.openxmlformats-officedocument.wordprocessingml.commentsExtended+xml");
  MyXWPFCommentsExtendedDocument myXWPFCommentsExtendedDocument = new MyXWPFCommentsExtendedDocument(part);
 
  String rId = document.addRelation(null, new XWPFCommentsExRelation(), myXWPFCommentsExtendedDocument).getRelationship().getId();

  return myXWPFCommentsExtendedDocument;
 }

 public static void main(String[] args) throws Exception {

  XWPFDocument document = new XWPFDocument();
 
  MyXWPFCommentsDocument myXWPFCommentsDocument = createCommentsDocument(document);
  MyXWPFCommentsExtendedDocument myXWPFCommentsExtendedDocument = createCommentsExtendedDocument(document);
 
  CTComments comments = myXWPFCommentsDocument.getComments();
  CTCommentsEx commentsEx = myXWPFCommentsExtendedDocument.getCommentsEx();
  
  CTComment ctComment;
  CTCommentEx ctCommentEx;
  CTP ctP;
  XWPFParagraph paragraph;
  XWPFRun run;
  BigInteger cId;
  XmlCursor cursor;

//first comment
  cId = BigInteger.ZERO;
  ctComment = comments.addNewComment();
  ctComment.setAuthor("Axel Richter");
  ctComment.setInitials("AR");
  ctComment.setDate(new GregorianCalendar(Locale.US));
  ctP = ctComment.addNewP();
  cursor = ctP.newCursor();
  cursor.toNextToken();
  cursor.insertAttributeWithValue​(new QName("http://schemas.microsoft.com/office/word/2010/wordml", "paraId"), "01020304");
  cursor.dispose();
  ctP.addNewR().addNewT().setStringValue("The first comment.");
  ctComment.setId(cId);
  
  ctCommentEx = commentsEx.addNewCommentEx();
  ctCommentEx.setParaId(new byte[]{1,2,3,4});
  
  paragraph = document.createParagraph();
  paragraph.getCTP().addNewCommentRangeStart().setId(cId);

  run = paragraph.createRun();
  run.setText("Paragraph with the first comment.");

  paragraph.getCTP().addNewCommentRangeEnd().setId(cId);

  paragraph.getCTP().addNewR().addNewCommentReference().setId(cId);

//sub comment to first comment
  cId = cId.add(BigInteger.ONE);
  ctComment = comments.addNewComment();
  ctComment.setAuthor("Axel Richter");
  ctComment.setInitials("AR");
  ctComment.setDate(new GregorianCalendar(Locale.US));
  ctP = ctComment.addNewP();
  cursor = ctP.newCursor();
  cursor.toNextToken();
  cursor.insertAttributeWithValue​(new QName("http://schemas.microsoft.com/office/word/2010/wordml", "paraId"), "01020305");
  cursor.dispose();
  ctP.addNewR().addNewT().setStringValue("Sub comment to the first comment.");
  ctComment.setId(cId);
  
  ctCommentEx = commentsEx.addNewCommentEx();
  ctCommentEx.setParaId(new byte[]{1,2,3,5});
  ctCommentEx.setParaIdParent(new byte[]{1,2,3,4});
  
  paragraph.getCTP().addNewCommentRangeStart().setId(cId);
  paragraph.getCTP().addNewCommentRangeEnd().setId(cId);
  paragraph.getCTP().addNewR().addNewCommentReference().setId(cId);

//paragraph without comment
  paragraph = document.createParagraph();
  run = paragraph.createRun();
  run.setText("Paragraph without comment.");

//second comment
  cId = cId.add(BigInteger.ONE);

  ctComment = comments.addNewComment();
  ctComment.setAuthor("Axel Richter");
  ctComment.setInitials("AR");
  ctComment.setDate(new GregorianCalendar(Locale.US));
  ctComment.addNewP().addNewR().addNewT().setStringValue("The second comment.");
  ctComment.setId(cId);
  
 // ctCommentEx = commentsEx.addNewCommentEx();

  paragraph = document.createParagraph();
  paragraph.getCTP().addNewCommentRangeStart().setId(cId);

  run = paragraph.createRun();
  run.setText("Paragraph with the second comment.");

  paragraph.getCTP().addNewCommentRangeEnd().setId(cId);

  paragraph.getCTP().addNewR().addNewCommentReference().setId(cId);

//write document
  FileOutputStream out = new FileOutputStream("CreateWordWithComments.docx");
  document.write(out);
  out.close();
  document.close();

 }

//a wrapper class for the CommentsDocument /word/comments.xml in the *.docx ZIP archive
 private static class MyXWPFCommentsDocument extends POIXMLDocumentPart {

  private CTComments comments;

  private MyXWPFCommentsDocument(PackagePart part) throws Exception {
   super(part);
   comments = CommentsDocument.Factory.newInstance().addNewComments();
  }

  private CTComments getComments() {
   return comments;
  }

  @Override
  protected void commit() throws IOException {
   XmlOptions xmlOptions = new XmlOptions(DEFAULT_XML_OPTIONS);
   xmlOptions.setSaveSyntheticDocumentElement(new QName(CTComments.type.getName().getNamespaceURI(), "comments"));
   PackagePart part = getPackagePart();
   OutputStream out = part.getOutputStream();
   comments.save(out, xmlOptions);
   out.close();
  }

 }
 
//a wrapper class for the CommentsExDocument /word/commentsExtended.xml in the *.docx ZIP archive
 private static class MyXWPFCommentsExtendedDocument extends POIXMLDocumentPart {

  private CTCommentsEx commentsEx;

  private MyXWPFCommentsExtendedDocument(PackagePart part) throws Exception {
   super(part);
   commentsEx = CommentsExDocument.Factory.newInstance().addNewCommentsEx();
  }

  private CTCommentsEx getCommentsEx() {
   return commentsEx;
  }

  @Override
  protected void commit() throws IOException {
   XmlOptions xmlOptions = new XmlOptions(DEFAULT_XML_OPTIONS);
   xmlOptions.setSaveSyntheticDocumentElement(new QName(CTCommentsEx.type.getName().getNamespaceURI(), "commentsExtended"));
   PackagePart part = getPackagePart();
   OutputStream out = part.getOutputStream();
   commentsEx.save(out, xmlOptions);
   out.close();
  }

 }
 
 //the XWPFRelation for /word/commentsExtended.xml
 private final static class XWPFCommentsExRelation extends POIXMLRelation {
  private XWPFCommentsExRelation() {
   super(
    "application/vnd.openxmlformats-officedocument.wordprocessingml.commentsExtended+xml", 
    "http://schemas.microsoft.com/office/2011/relationships/commentsExtended", 
    "/word/commentsExtended.xml");
  }
 }

}