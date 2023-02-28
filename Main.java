import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * main
 */

class Main {
    public static void main(String[] args) {
        User user = new User("Damilola Oyeyipo", "1993-04-05");


        Book book = new Book("Things fall apart", "Chinua Achebe");

        user.borrow(book);

        System.out.printf("%s, Damilola's \n", user.getBooks());

        System.out.printf("%s, is the name of the book and the author is %s \n", book.getTitle(), book.getAuthor());
    }
}
