public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        return this;
        // throw new FileTreatmentException();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);
    // overload (1) 同じクラスに同名のメソッドを定義する
    // override (2) 継承によってメソッドの定義を拡張する
    // overwrite (3) (2)といっしょ
    public String toString() {
        return this.getName() + " (" + this.getSize() + ")";
    }
}
