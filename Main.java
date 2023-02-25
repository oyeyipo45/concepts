import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * main
 */

class Main {
    static int age = 12;

    public static void main(String[] args) {

        // ARRAY LIST
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        numbers.add(3);
        numbers.add(2);
        numbers.add(44);

        numbers.remove(Integer.valueOf(44));


        System.out.println(numbers.get(2));


        // LOOPS
        // int[] array = new int[10];
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(i);
        // }

        // int numbers[] = { 1, 2, 3, 4, 5 };
        // int sum = 0;
        // for (int number : numbers) {
        //     sum += number;
        //     System.out.println(sum);
        // }

 
        // COPY ARRAY
        // char arr[] = { 'e', 'o', 'a', 'i', 'u' };
        // int numbers[] = { 1, 2, 3, 4, 5 };
        
        // int copyNumbers[] = Arrays.copyOf(numbers, numbers.length);
        // System.out.println(Arrays.equals(numbers, copyNumbers));

 

        // SEARCHING FOR CHARACTER
        // char key = 'o';
        // int startIndex = 1;
        // int endIndex = 4;
        // Arrays.sort(arr);
        // // you can only search characters from sorted arr and returns char index
        // int index = Arrays.binarySearch(arr, key);
        // int searchindex = Arrays.binarySearch(arr, startIndex, endIndex, key);

        // System.out.println(Arrays.toString(arr));
        // System.out.println(index);
        // System.out.println(searchindex);


        // TAKING SYSTEM INP UTS
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("What is the first number: ");
        // Double number1 = scanner.nextDouble();

        // System.out.print("What is the second number: ");
        // Double number2 = scanner.nextDouble();
        // scanner.nextLine();

        // System.out.print("What operation to take: ");
        // String operation = scanner.nextLine();

        // switch (operation) {
        //     case "sum":
        //         System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        //         break;
        //     default:
        //         break;
        // }

        // scanner.close();
    }
}
