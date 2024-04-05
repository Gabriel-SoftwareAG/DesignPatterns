package ai.verisoft.behavioral.structural.composite.xml;

public class LeafElement implements XmlElement {
    private final String tagName;

    public LeafElement(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "<" + tagName + "/>");
    }
}
