// 2. Compare two strings using == and equals()
public class CompareStrings {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);       // false - compares reference
        System.out.println(a.equals(b));  // true - compares value
    }
}
