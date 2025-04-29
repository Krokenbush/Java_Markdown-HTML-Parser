package markup;

import java.util.*;

public class Paragraph implements docElement {
    List <element> list = new ArrayList<>();

    public Paragraph (List <element> list) {
        this.list = list;
    }

    public void toMarkdown (StringBuilder s){
        for (element e : list) {
            e.toMarkdown(s);
        }
    }

    public void toDocBook (StringBuilder s){
        s.append("<para>");
        for (element e : list) {
            e.toDocBook(s);
        }
        s.append("</para>");
    }
}
