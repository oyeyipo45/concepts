import java.util.Scanner;

/**
 * main
 */
//import java.util.Scanner;

class Main {
   static int age = 12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number: ");
        Double number1 = scanner.nextDouble();

        System.out.print("What is the second number: ");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation to take: ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":  
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
;
                break;
        
            default:
                break;
        }
  


        scanner.close();
    }
}
