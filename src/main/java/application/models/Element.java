package application.models;

public class Element {

    private String elementName;
    private byte[] icon_img;

    public Element() {

    }

    public Element(String elementName) {
        this.elementName = elementName;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public byte[] getIcon_img() {
        return icon_img;
    }

    public void setIcon_img(byte[] icon_img) {
        this.icon_img = icon_img;
    }
}
