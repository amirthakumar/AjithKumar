package in.vamsoft.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreate {

	
	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		
		Document document=new Document();
		PdfPTable table=new PdfPTable(5);
		PdfWriter.getInstance(document, new FileOutputStream("/home/vamsoft/Desktop/Ajith.pdf"));
		document.open();
		
		
		/*PdfPCell cell=new PdfPCell();
		table.addCell(cell);
		table.addCell("Siva");
		String name="Ajith";
		LocalDate localDate=LocalDate.now();
		PdfWriter.getInstance(document, new FileOutputStream("/home/vamsoft/Desktop/"+name+localDate+".pdf"));
		document.addAuthor("Ajith");
		document.open();
		Paragraph paragraph=new Paragraph("Hi Ajith"+"\n");
		paragraph.add("Kumar");
		document.add(paragraph);
		System.out.println("Paragraph Added To The Pdf ");
		*/
		//PdfPTable table = new PdfPTable(3);
		// the cell object
		PdfPCell cell;
		// we add a cell with colspan 3
		cell = new PdfPCell(new Phrase("Cell with colspan 3"));
		cell.setColspan(3);
		table.addCell(cell);
		// now we add a cell with rowspan 2
		cell = new PdfPCell(new Phrase("Cell with rowspan 2"));
		cell.setRowspan(2);
		table.addCell(cell);
		// we add the four remaining cells with addCell()
		table.addCell("row 1; cell Ajith");
		table.addCell("row 1; cell 2");
		table.addCell("row 2; cell 1");
		table.addCell("row 2; cell 2");
		document.add(table);
		document.close();
		
		
	}
}
