
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("田井中律"));
        bookShelf.appendBook(new Book("秋山澪"));
        bookShelf.appendBook(new Book("琴吹紬"));
        bookShelf.appendBook(new Book("平沢唯"));

        Iterator itr = bookShelf.getIterator();

        while (itr.hasNext()) {
            Book book = (Book)itr.next();
            System.out.println(book.getAuthorName());
        }
    }
}
// 特定のフィルタをするいてレータとか？
// 逆順のいてレータとか？
// アプリケーションで意識しなくてよい　
