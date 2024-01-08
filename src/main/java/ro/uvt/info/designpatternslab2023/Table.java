package ro.uvt.info.designpatternslab2023;

import lombok.Getter;
import ro.uvt.info.designpatternslab2023.Element;

@Getter
class Table implements Element {
    private String tableTitle;

    public Table(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    @Override
    public void print() {
        System.out.println(tableTitle);
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