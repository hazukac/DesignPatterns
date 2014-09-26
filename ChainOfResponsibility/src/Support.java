
public abstract class Support {
    private String name;
    private Support next;
    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support nextSupport) {
        this.next = nextSupport;
        return this.next;
    }
    public final void support(Trouble trouble) {
        if (this.resolve(trouble)) {
            done(trouble);
        } else if (this.next != null) {
            this.next.support(trouble);
        } else {
            this.fail(trouble);
        }
    }
    public String toString() {
        return "[" + this.name + "]";
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble.toString() + " is resolved by " + this.toString() + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble.toString() + "cannot be resolved by " + this.toString() + ".");
    }
}