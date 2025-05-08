public class OverloadingExample {

    // Method that adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method that adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method that adds two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        // Calling the method with two integers
        System.out.println("Sum of 2 integers: " + obj.add(10, 20));

        // Calling the method with three integers
        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));

        // Calling the method with two double numbers
        System.out.println("Sum of 2 doubles: " + obj.add(10.5, 20.5));
    }
}
