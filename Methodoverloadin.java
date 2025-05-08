// 12. Method Overloading example
public class OverloadExample {
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.greet();
        obj.greet("Ada");
    }
}
