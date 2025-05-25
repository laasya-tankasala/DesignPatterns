package creational.prototype.document;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        TemplateRegistry registry = new TemplateRegistry();

        // Base templates
        Document invoiceTemplate = new Document(
                "Invoice Template",
                "This is a standard invoice.",
                List.of("bold", "right-aligned")
        );

        Document resumeTemplate = new Document(
                "Resume Template",
                "Enter your experience and education here.",
                List.of("center-aligned", "italic")
        );

        // Register them
        registry.registerTemplate("invoice", invoiceTemplate);
        registry.registerTemplate("resume", resumeTemplate);

        // Clone and customize
        Document myInvoice = (Document) registry.getTemplate("invoice");
        myInvoice.setTitle("Invoice #12345");

        Document myResume = (Document) registry.getTemplate("resume");
        myResume.setTitle("John Doe - Resume");

        // Output
        System.out.println(myInvoice);
        System.out.println(myResume);
    }
}

