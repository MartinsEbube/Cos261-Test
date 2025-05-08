// 13. Inheritance example
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void displayTeacherInfo() {
        displayName();
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. John", "Mathematics");
        t1.displayTeacherInfo();
    }
}
