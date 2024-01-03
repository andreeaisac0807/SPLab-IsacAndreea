package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.designpatternslab2023.Element;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + getText());
    }

    @Override
    public void addElement(Element element) {

    }

    @Override
    public void removeElement(Element element) {

    }

    @Override
    public Element get(int number) {
        return null;
    }
}