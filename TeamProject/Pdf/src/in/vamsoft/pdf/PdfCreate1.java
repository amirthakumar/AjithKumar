package in.vamsoft.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreate1 {

	public static void GeneratePdf(String[] s)
	{
		Document document=new Document();
		try {
			LocalDateTime date=LocalDateTime.now();
			String dateStr=date.toString();
			String newStr=dateStr.replaceAll("T", "_").replaceAll("-", "").replaceAll(":", "").substring(0, 14);
			PdfWriter.getInstance(document, new FileOutputStream("/home/vamsoft/Desktop/"+s[0]+"_"+newStr+".pdf"));
			document.open();
			Paragraph para=new Paragraph("Employee Information");
			para.setAlignment(Element.ALIGN_CENTER);
			Paragraph para1=new Paragraph("  ");
			document.add(para);
			document.add(para1);
			PdfPTable table=new PdfPTable(2);
			table.addCell("Name");
			table.addCell(s[0]);
			table.addCell("Age");
			table.addCell(s[1]);
			table.addCell("DOB");
			table.addCell(s[2]);
			table.addCell("Aadhar");
			table.addCell(s[3]);
			table.addCell("PAN");
			table.addCell(s[4]);
			document.add(table);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		document.close();
		
		
	}
	public static void main(String[] args) {
		String[] str= {"kumar","21","12/10/1996","65656566","5245454"};
		GeneratePdf(str);
		System.out.println("created...");
		
		LocalDateTime date=LocalDateTime.now();
		String dateStr=date.toString();
		String newStr=dateStr.replaceAll("T", "_").replaceAll("-", "").replaceAll(":", "").substring(0, 14);

		System.out.println(newStr);
		
	}

}
