package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.designpatternslab2023.Element;
import ro.uvt.info.designpatternslab2023.Visitee;
import ro.uvt.info.designpatternslab2023.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section implements Element, Visitee {
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        if (index >= 0 && index < chapters.size()) {
            return chapters.get(index);
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("Book: " + getTitle());
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println(author.getName());
        }
        for (Element content : super.getElements()) {
            content.print();
        }
    }


    public List<Element> getElements() {
        return super.getElements();
    }

    public void addContent(Element element) {
        getElements().add(element);
    }

    @Override
    public void accept(Visitor visitor) {

        //visitor.visitBook(this);
        super.accept(visitor);
    }
}