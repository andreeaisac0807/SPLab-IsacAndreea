package ro.uvt.info.designpatternslab2023;

import lombok.Getter;
import ro.uvt.info.designpatternslab2023.Element;
import ro.uvt.info.designpatternslab2023.Visitee;
import ro.uvt.info.designpatternslab2023.Visitor;

@Getter
public class Table implements Element, Visitee {
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

    @Override
    public void accept(Visitor visitor) {

        visitor.visitTabel(this);
    }

    public String getName() {

        return tableTitle;
    }
}