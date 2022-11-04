package visitor;

import visitor.elements.Element;
import visitor.elements.JsonElement;
import visitor.elements.XmlElement;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {

    public static void main(String[] args) {

        List<Element> elements = new ArrayList<>();
        elements.add(new JsonElement(generateUuid()));
        elements.add(new JsonElement(generateUuid()));
        elements.add(new XmlElement(generateUuid()));

        Visitor visitor = new ElementVisitor();
        visitor.visit(elements);
    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }
}
