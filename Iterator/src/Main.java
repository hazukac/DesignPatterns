
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("田井中律のすべて"));
        bookShelf.appendBook(new Book("秋山澪解体新書"));
        bookShelf.appendBook(new Book("琴吹紬 名言集"));
        bookShelf.appendBook(new Book("平沢唯 禁断の姉妹愛"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
    }
}