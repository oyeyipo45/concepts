package src;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your phone number");

        int phone = input.nextInt();

        System.out.println("This is your phone number " + phone);
    }
}
