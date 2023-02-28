public class Book {
    private String title;
    private String author;
    private int pages;


    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
    
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }
}
