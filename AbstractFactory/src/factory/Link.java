package factory;

public abstract class Link extends Item {
    public String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}