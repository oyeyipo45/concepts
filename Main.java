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
        User user = new User();

        user.name = "Damilola Oyeyipo";
        user.birthDay = LocalDate.parse("1993-04-05");

        System.out.printf("%s, was born in %s and is not %d years old", user.name, user.birthDay.toString(),
                user.age());

        Book book = new Book();
        book.title = "Things fall apart";
        book.author = "Chinua Achebe";

    }
}
