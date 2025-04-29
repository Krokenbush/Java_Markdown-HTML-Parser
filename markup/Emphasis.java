package markup;

import java.util.*;

public class Emphasis extends abstractElement {

    public Emphasis (List <element> list) {
        super(list);
    }

    @Override
    public void markdownPrefix(StringBuilder s) {
        s.append("*");
    }
    @Override
    public void markdownSuffix(StringBuilder s) {
        s.append("*");
    }
    
    
    @Override
    public void docBookPrefix(StringBuilder s) {
        s.append("<emphasis>");
    }
    @Override
    public void docBookSuffix(StringBuilder s) {
        s.append("</emphasis>");
    }
}
