package creational.prototype.document;


import java.util.HashMap;
import java.util.Map;

public class TemplateRegistry {

    private Map<String,DocumentTemplate> templateRegister = new HashMap<>();

    public void registerTemplate(String name, DocumentTemplate documentTemplate){
        templateRegister.put(name, documentTemplate);
    }

    public DocumentTemplate getTemplate(String name) throws IllegalArgumentException {
        if(templateRegister.containsKey(name))
            return templateRegister.get(name);
        else
            throw new IllegalArgumentException("Template not found: " + name);
    }

}
