package document;

public class DocumentCheker {
    public static void main(String[] args) {
    
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
        
    }
    
}
