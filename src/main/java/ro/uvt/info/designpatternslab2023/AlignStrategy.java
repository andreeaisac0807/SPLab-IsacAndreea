package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.designpatternslab2023.Paragraph;
import ro.uvt.info.designpatternslab2023.Content;

import javax.naming.Context;

public interface AlignStrategy {

    public void render(Paragraph p, Content c);
}