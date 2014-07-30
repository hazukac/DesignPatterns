public class Book {
    private String authorName = "";
    public Book(String name) {
        authorName = name;
    }
    public String getAuthorName() {
        return /* this. */authorName;
    }
}
