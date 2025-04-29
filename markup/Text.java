package markup;

public class Text extends abstractElement {
    String text; // :NOTE: Visibility

    public Text (String text) {
        this.text = text;
    }

    @Override
    public void markdownPrefix(StringBuilder s) {
        s.append(text);
    }
    @Override
    public void markdownSuffix(StringBuilder s) {}
    
    
    @Override
    public void docBookPrefix(StringBuilder s) {
        s.append(text);
    }
    @Override
    public void docBookSuffix(StringBuilder s) {}
}
