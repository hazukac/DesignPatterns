
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {
        // TODO: 1
        if (this.index < this.bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
        // TODO: 2
    }
    public Object next() {
        Book book = bookShelf.getBookAt(this.index);
        this.index++;
        return book;
    }
}