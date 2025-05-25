package creational.prototype;

import creational.prototype.document.Document;
import creational.prototype.document.TemplateRegistry;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class DocumentTest {

    private TemplateRegistry templateRegistry;

    @Test
    void testCloningDocument() {
        Document invoiceTemplate = new Document(
                "Invoice Template",
                "This is a standard invoice.",
                List.of("bold", "right-aligned")
        );

        Document invoiceClone = (Document) invoiceTemplate.clone();
        assertEquals("Document{title='Invoice Template', content='This is a standard invoice.', formatting=[bold, right-aligned]}",
                invoiceClone.toString());

    }

    @Test
    void testGettingCloneFromRegistry() {
        Document invoiceTemplate = new Document(
                "Invoice Template",
                "This is a standard invoice.",
                List.of("bold", "right-aligned")
        );

        templateRegistry = new TemplateRegistry();
        templateRegistry.registerTemplate("invoice", invoiceTemplate);

        Document newInvoice = (Document) templateRegistry.getTemplate("invoice");
        newInvoice.setTitle("Invoice #1");
        assertEquals("Document{title='Invoice #1', content='This is a standard invoice.', formatting=[bold, right-aligned]}",
                newInvoice.toString());

    }

    @Test
    void testNoTemplateRegistered() {
        templateRegistry = new TemplateRegistry();
        assertThrowsExactly(IllegalArgumentException.class,  ()->
                templateRegistry.getTemplate("email"), "Template not found: email");
    }
}
