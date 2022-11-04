package visitor.elements;

import visitor.Visitor;

public class XmlElement extends Element {

    public XmlElement(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
