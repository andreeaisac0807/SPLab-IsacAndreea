package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.designpatternslab2023.AlignStrategy;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the right: " + p.getText());
    }

}
