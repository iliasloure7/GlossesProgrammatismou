public class Book {
    private String title;
    private String author;
    private int firstEdition;

    Book(String newTitle , String newAuthor , int newEdition) {
        title = newTitle;
        author = newAuthor;
        firstEdition = newEdition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getFirstEdition() {
        return firstEdition;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setFirstEdition(int newEdition) {
        firstEdition = newEdition;
    }

} 