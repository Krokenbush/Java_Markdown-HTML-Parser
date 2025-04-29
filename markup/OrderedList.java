package markup;

import java.util.*;

public class OrderedList extends abstractItem {

    public OrderedList (List <ListItem> list) {
        super(list);
    }

    @Override
    public void markdownPrefix(StringBuilder s) {}
    @Override
    public void markdownSuffix(StringBuilder s) {}
    
    
    @Override
    public void docBookPrefix(StringBuilder s) {
        s.append("<orderedlist>");
    }
    @Override
    public void docBookSuffix(StringBuilder s) {
        s.append("</orderedlist>");
    }
}