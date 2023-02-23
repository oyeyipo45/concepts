/**
 * main
 */
class Main {
   // static int age = 12;

    public static void main(String[] args) {
        int age = 40;
        String name = "Damilola";
        Double price = 3.33;
        String formatedString = String.format("My name is %s. I am %d year old and my price is %f", name, age, price);

        System.out.println(formatedString);
    }
}
