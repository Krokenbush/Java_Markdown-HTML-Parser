package markup;

import java.util.*;

// :NOTE: Naming
public abstract class abstractElement implements element {
    List<element> list = new ArrayList<>();

    public abstractElement() {
    }

    public abstractElement(List<element> list) {
        this.list = list;
    }

    @Override
    public void toMarkdown(StringBuilder s) {
        markdownPrefix(s);
        for (element e : list) {
            e.toMarkdown(s);
        }
        markdownSuffix(s);
    }

    @Override
    public void toDocBook(StringBuilder s) {
        docBookPrefix(s);
        for (element e : list) {
            e.toDocBook(s);
        }
        docBookSuffix(s);
    }

    public abstract void markdownPrefix(StringBuilder s);

    public abstract void markdownSuffix(StringBuilder s);

    public abstract void docBookPrefix(StringBuilder s);

    public abstract void docBookSuffix(StringBuilder s);
}