package visitor;

import visitor.elements.Element;
import visitor.elements.JsonElement;
import visitor.elements.XmlElement;

import java.util.List;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println(
                "processing an XML element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println(
                "processing a JSON element with uuid: " + je.uuid);
    }

    @Override
    public void visit(List<Element> elements) {
        for (Element element : elements) {
            element.accept(this);
        }
    }
}
