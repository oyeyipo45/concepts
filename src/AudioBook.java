package src;

public class AudioBook extends Book {
    private final int runTime;

    AudioBook(String title, String author, int pages, int runTime) {
        super(title, author, pages);
        this.runTime = runTime;
    }

    public int getRunTime() {
        return this.runTime;
    }

    
}
