package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.designpatternslab2023.Element;

public class TabelOfContents implements Element {
    private String text;

    public TabelOfContents(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
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