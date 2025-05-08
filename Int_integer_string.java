public class DataTypeDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 5;
        String c = "5";

        System.out.println(a + b);       // This adds numbers: 10 + 5 = 15
        System.out.println(a + b + c);   // This first adds 10 + 5 = 15, then appends "5" → "155"
        System.out.println(c + a + b);   // This does "5" + 10 + 5 → "5105"
    }
}
