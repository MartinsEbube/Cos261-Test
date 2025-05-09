// 11. Student class with display method
class Student {
    String name;
    String matricNo;
    int score;

    Student(String name, String matricNo, int score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student s1 = new Student("James", "COS123", 90);
        s1.display();
    }
}
