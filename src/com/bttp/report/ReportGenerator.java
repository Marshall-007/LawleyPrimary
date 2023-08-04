package com.bttp.report;

import com.bttp.pojo.Generator;
import com.bttp.pojo.Learner;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReportGenerator {

    String logoPath = "src/com/bttp/image/lawleyLogo.png", location = "./";

    public void printRegistration(Learner learner) throws FileNotFoundException, DocumentException, IOException {
        new File(location + learner.getLearnerno() + ".pdf").delete();
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("./" + learner.getLearnerno() + ".pdf"));
        document.open();
        
        Image image = Image.getInstance(logoPath);
        image.scaleAbsolute(new Rectangle(100f, 50f));
        document.add(image);
        Paragraph pLogo = new Paragraph("Lawley Primary School\nKnowledge is light", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL));
        pLogo.setAlignment(Paragraph.ALIGN_LEFT);
        document.add(pLogo);

        Paragraph pTitle = new Paragraph("TO WHOM IT MAY CONCERN", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.NORMAL));
        pTitle.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(pTitle);
        Generator generator = new Generator();
        Paragraph pContent = new Paragraph("\n\nIt is hereby confirmed that " + learner.getFirstname() + " " + learner.getLastname() + 
                ", Learner Number " + learner.getLearnerno() + ", Identity Number " + learner.getIdentityno() + ", "
                + "Is registered from " + generator.currentDate() + " at Lawley Primary School for the under mentioned course and subjects.\n");
        pContent.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        document.add(pContent);
//        document.add(new Paragraph("\nCampus - " + campusname + "\n\n"));
//        document.add(new Paragraph(coursecode + " - " + coursename + "\n\n"));
//        document.add(new Paragraph("Subject Description"));
//        String strSubject = "";
//        for (Subject subject : subjects) {
//            strSubject += subject.getSubjectcode() + " - " + subject.getSubjectname() + "\n";
//        }
//        document.add(new Paragraph(strSubject));
        document.add(new Paragraph("\n\n************************************* PROOF OF REGISTRATION *************************************\n\n"));
        Paragraph pLine = new Paragraph("Generated on the " + generator.currentDate() + " at " + generator.currentTime());
        document.add(pLine);
        document.close();
    }
}
