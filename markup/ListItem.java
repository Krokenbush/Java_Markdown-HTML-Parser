package markup;

import java.util.*;

public class ListItem {
    List <docElement> list = new ArrayList<>();

    public ListItem (List <docElement> list) {
        this.list = list;
    }

    public void toDocBook (StringBuilder s){
        s.append("<listitem>");
        for (docElement e : list) {
            e.toDocBook(s);
        }
        s.append("</listitem>");
    }
}