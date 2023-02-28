public class AudioBook extends Book{
    private int runTime;

    AudioBook(String title, String author, int pages, int runTime) {
        super(title, author, pages);
        this.runTime = runTime;
    }
    
    public int getRunTime() {
        return this.runTime;
    }

    
}
