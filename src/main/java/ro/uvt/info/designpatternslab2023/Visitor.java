package ro.uvt.info.designpatternslab2023;
import ro.uvt.info.designpatternslab2023.*;

public interface Visitor<T> {

    T  visitBook(Book book);
    T visitSection(Section section);
    T visitTableOfContents(TableOfContents tabelOfContents);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageProxy);
    T visitImage(Image image);
    T visitTabel(Table table);
}
