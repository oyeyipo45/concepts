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

        System.out.println(user.getName());

        Book book = new Book();
        book.title = "Things fall apart";
        book.author = "Chinua Achebe";

        user.borrow(book);

        System.out.printf("%s, Damilola's \n", user.books.toString());
    }
}
