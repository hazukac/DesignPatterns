
public class BookShelf implements MyAggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return this.books[index];
    }
    public void appendBook(Book book) {
        this.books[this.last] = book;
        this.last++;
    }
    public int getLength() {
        return this.last;
    }
    public Iterator getIterator() {
        return new BookShelfIterator(this);
    }
}
