package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.designpatternslab2023.Element;
import ro.uvt.info.designpatternslab2023.Visitee;
import ro.uvt.info.designpatternslab2023.Visitor;

public class ImageProxy implements Element, Visitee {
    private Image realImage;
    private String imageName;

    public ImageProxy(String name) {
        imageName = name;
    }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void addElement(Element element) {
        loadImage().addElement(element);
    }

    @Override
    public void removeElement(Element element) {
        loadImage().removeElement(element);
    }

    @Override
    public Element get(int number) {
        return loadImage().get(number);
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visitImageProxy(this);
    }

    public String getName() {

        return imageName;
    }
}