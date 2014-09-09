public interface Strategy {
    public abstract Hand next();
    public abstract void study(boolean win);
}
