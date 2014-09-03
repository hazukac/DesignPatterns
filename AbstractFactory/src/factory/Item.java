package factory;

public abstract class Item {
    // protected?
    // protectedは、継承した子クラスはアクセスできる
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}