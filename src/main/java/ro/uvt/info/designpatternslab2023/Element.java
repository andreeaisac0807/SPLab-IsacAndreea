package ro.uvt.info.designpatternslab2023;

public interface Element {

    public void print();
    public void addElement(Element element);
    public void removeElement(Element element);
    public Element get(int number);

}