// 11. Student class with method to display info
class Student {
    String name;
    String matricNo;
    int score;

    // Constructor
    Student(String name, String matricNo, int score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tobi", "COS123", 85);
        s1.displayInfo();
    }
}
