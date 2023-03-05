package src;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        int range = 10000;
        int higherBonus = 2000;
        int lowerBonus = 1000;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your salary : ");
        int salary = input.nextInt();

        if (salary > range) {
            int total = salary + higherBonus;
            System.out.println("Your salary and bonus is: " + total);
        } else {
            int total = salary + lowerBonus;
            System.out.println("Your salary and bonus is: " + salary);
        }
    }
}
