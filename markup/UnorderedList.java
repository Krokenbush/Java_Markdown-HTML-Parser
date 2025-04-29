package markup;

import java.util.*;

public class UnorderedList extends abstractItem {

    public UnorderedList (List <ListItem> list) {
        super(list);
    }

    @Override
    public void markdownPrefix(StringBuilder s) {}
    @Override
    public void markdownSuffix(StringBuilder s) {}
    
    
    @Override
    public void docBookPrefix(StringBuilder s) {
        s.append("<itemizedlist>");
    }
    @Override
    public void docBookSuffix(StringBuilder s) {
        s.append("</itemizedlist>");
    }
}