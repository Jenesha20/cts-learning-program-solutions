import documents.Document;
import factories.DocumentFactory;
import factories.ExcelDocumentFactory;
import factories.PdfDocumentFactory;
import factories.WordDocumentFactory;

public class FactoryTest {
    public static void main(String[] args) {
        // Create factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Create documents using factories
        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();

        // Test the documents
        System.out.println("Testing Word Document:");
        wordDoc.open();
        wordDoc.save();

        System.out.println("\nTesting PDF Document:");
        pdfDoc.open();
        pdfDoc.save();

        System.out.println("\nTesting Excel Document:");
        excelDoc.open();
        excelDoc.save();

        // Test the factory processing
        System.out.println("\nTesting Factory Processing:");
        wordFactory.processDocument();
        pdfFactory.processDocument();
        excelFactory.processDocument();
    }
}