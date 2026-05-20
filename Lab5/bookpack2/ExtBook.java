package bookpack2;
import bookpack.Book;

public class ExtBook extends Book {
    public ExtBook(String t, String a, int d) {
        super(t, a, d);
    }

    public String getTitle() {
        return title;  // protected → 子类直接访问
    }
}