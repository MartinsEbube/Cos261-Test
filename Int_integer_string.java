// 5. int vs Integer vs String demo
public class TypeDemo {
    public static void main(String[] args) {
        int a = 5;                // primitive
        Integer b = 10;           // wrapper class
        String c = "15";          // string

        System.out.println(a + b);      // 15
        System.out.println(c + a);      // 155 (concatenation)
    }
}
