package creational.prototype.document;

import java.util.ArrayList;
import java.util.List;

public class Document implements DocumentTemplate {
    private String title;
    private String content;
    private List<String> formatting;

    public Document(String title, String content, List<String> formatting) {
        this.title = title;
        this.content = content;
        this.formatting = new ArrayList<>(formatting); // defensive copy
    }

    public Document(Document original) {
        this.title = original.title;
        this.content = original.content;
        this.formatting = new ArrayList<>(original.formatting); // deep copy
    }

    @Override
    public DocumentTemplate clone() {
        return new Document(this);
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", formatting=" + formatting +
                '}';
    }

    // Setters (to customize after cloning)
    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
}
