package com.bttp.report;

import com.bttp.pojo.Generator;
import com.bttp.pojo.Learner;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PrintLearners {

    String documentPath = "./";
    String logoPath = "src/com/bttp/image/lawleyLogo.png";

    public PrintLearners() {
    }

    public File delete() {
        return new File(documentPath + "learners.pdf");
    }

    public void printLearners(ArrayList<Learner> learners) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        File f = new File("./");
        if (!f.exists()) {
            f.mkdir();
        }

        new File("./learners.pdf").delete();
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("./learners.pdf"));
        document.open();
        
        Image image = Image.getInstance(logoPath);
        image.scaleAbsolute(new Rectangle(100f, 50f));
        document.add(image);
        Paragraph pLogo = new Paragraph("Lawley Primary School\nKnowledge is light", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL));
        pLogo.setAlignment(Paragraph.ALIGN_LEFT);
        document.add(pLogo);

        Paragraph pTitle = new Paragraph("School Learners", new Font(Font.FontFamily.TIMES_ROMAN, 28, Font.BOLD));
        pTitle.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(pTitle);
        document.add(new Paragraph("\n\n"));

        PdfPTable table = new PdfPTable(9);
        table.setWidthPercentage(700 / 6.23f);
        table.setWidths(new int[]{3, 4, 4, 4, 2, 4, 6, 3, 4});

        PdfPCell c1 = new PdfPCell(new Phrase("Learner Number", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c2 = new PdfPCell(new Phrase("First Name", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c3 = new PdfPCell(new Phrase("Last Name", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c4 = new PdfPCell(new Phrase("Identity Number", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c5 = new PdfPCell(new Phrase("Grade", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c6 = new PdfPCell(new Phrase("Registered Date", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c7 = new PdfPCell(new Phrase("Parent", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c8 = new PdfPCell(new Phrase("Contact Number", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
        PdfPCell c9 = new PdfPCell(new Phrase("Residential Address", new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD)));

        table.addCell(c1);
        table.addCell(c2);
        table.addCell(c3);
        table.addCell(c4);
        table.addCell(c5);
        table.addCell(c6);
        table.addCell(c7);
        table.addCell(c8);
        table.addCell(c9);

        for (Learner learner : learners) {
            PdfPCell cell1 = new PdfPCell(new Phrase(learner.getLearnerno(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell2 = new PdfPCell(new Phrase(learner.getFirstname(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell3 = new PdfPCell(new Phrase(learner.getLastname(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell4 = new PdfPCell(new Phrase(learner.getIdentityno(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell5 = new PdfPCell(new Phrase(learner.getGrade(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell6 = new PdfPCell(new Phrase(learner.getDateofregistration(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell7 = new PdfPCell(new Phrase(learner.getPfirstname() + " " + learner.getPlastname(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell8 = new PdfPCell(new Phrase(learner.getContactno(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));
            PdfPCell cell9 = new PdfPCell(new Phrase(learner.getResidentialaddress(), new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL)));

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            table.addCell(cell6);
            table.addCell(cell7);
            table.addCell(cell8);
            table.addCell(cell9);
        }

        document.add(table);
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        Paragraph pLine = new Paragraph("******************************************* END OF REPORT *******************************************");
        pLine.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(pLine);
        Generator calender = new Generator();
        Paragraph p = new Paragraph("Generated on the " + calender.currentDate() + " at " + calender.currentTime());
        p.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p);
        document.close();
    }
}
