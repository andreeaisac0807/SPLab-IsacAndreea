import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String name;
    private List<Object> content;

    public SubChapter(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void createNewParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        content.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        content.add(new Table(tableTitle));
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        for (Object obj : content) {
            if (obj instanceof Paragraph) {
                System.out.println("Paragraph: " + ((Paragraph) obj).getText());
            } else if (obj instanceof Image) {
                System.out.println("Image: " + ((Image) obj).getImageName());
            } else if (obj instanceof Table) {
                System.out.println("Table: " + ((Table) obj).getTableTitle());
            }
        }
    }
}


class Content {
    // You can create specific classes for Paragraph, Image, and Table if needed.
    // For simplicity, we'll use a generic content type.
    private String text;

    public Content(String text) {
        this.text = text;
    }

    // Getters and setters
}