/**
 * 
 */
package com.samya.barcode;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.Barcode128;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;





/**
 * @author Samya Ghosh 
 *
 */


public class Barcodegeneraterapplication {
	
	
	public static void main(String[] args) throws FileNotFoundException, DocumentException {

    Document document = new Document(new Rectangle(PageSize.A4));    
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Barcodegeneraterapplication_demo.pdf"));    

    document.open();
	    document.add(new Paragraph("Make In Germany "));

		    Barcode128 code128 = new Barcode128();
		    code128.setGenerateChecksum(true);

                    code128.setCode("4 345621801");  
                    document.add(new Paragraph ("New Product created by SamyaIT GmbH"));

	    document.add(code128.createImageWithBarcode(writer.getDirectContent(), null, null));
    document.close();

    System.out.println("Document Generated with success...!!!!!!");
  }

  
}
