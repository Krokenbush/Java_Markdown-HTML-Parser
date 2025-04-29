package markup;

import java.util.*;

public class Strong extends abstractElement {

    public Strong (List <element> list) {
        super(list);
    }

    @Override
    public void markdownPrefix(StringBuilder s) {
        s.append("__");
    }
    @Override
    public void markdownSuffix(StringBuilder s) {
        s.append("__");
    }
    
    
    @Override
    public void docBookPrefix(StringBuilder s) {
        s.append("<emphasis role='bold'>");
    }
    @Override
    public void docBookSuffix(StringBuilder s) {
        s.append("</emphasis>");
    }
}
