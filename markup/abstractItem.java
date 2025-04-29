package markup;

import java.util.*;

public abstract class abstractItem implements docElement{
    private final List <ListItem> list;

    public abstractItem (List <ListItem> list) {
        this.list = list;
    }

    @Override
    public void toDocBook (StringBuilder s){
        docBookPrefix(s);
        for (ListItem e : list) {
            e.toDocBook(s);
        }
        docBookSuffix(s);
    }

    public abstract void markdownPrefix (StringBuilder s);
    public abstract void markdownSuffix (StringBuilder s);
    public abstract void docBookPrefix (StringBuilder s);
    public abstract void docBookSuffix (StringBuilder s);
}