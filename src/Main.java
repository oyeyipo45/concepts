package src;

/**
 * main
 */

public class Main {
    public static void main(String[] args) {
        User user = new User("Damilola Oyeyipo", "1993-04-05");

        Book book = new Book("Things fall apart", "Chinua Achebe", 47);

        AudioBook audioBook = new AudioBook("The first book", "Chinua Achebe", 400, 40);

        user.borrow(book);
        System.out.printf(" The audio book %s, by %s with  %s pages has a run  time of %s minutes \n", audioBook.getTitle(), audioBook.getAuthor(), audioBook.getPages(), audioBook.getRunTime());

        System.out.printf("%s, Damilola's \n", user.getBooks());

        System.out.printf("%s, is the name of the book and the author is %s \n", book.getTitle(), book.getAuthor());

        System.out.printf("My name is %s and I was born on %s which makes me %s years old \n", user.getName(), user.getBirthday(), user.age());
    }
}
