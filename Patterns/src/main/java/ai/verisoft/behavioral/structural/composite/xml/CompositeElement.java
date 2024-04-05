package ai.verisoft.behavioral.structural.composite.xml;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements XmlElement {
    private final String tagName;
    private final List<XmlElement> children = new ArrayList<>();

    public CompositeElement(String tagName) {
        this.tagName = tagName;
    }

    public void addElement(XmlElement element) {
        children.add(element);
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "<" + tagName + ">");
        for (XmlElement element : children) {
            element.printStructure(indent + "    ");
        }
        System.out.println(indent + "</" + tagName + ">");
    }
}
