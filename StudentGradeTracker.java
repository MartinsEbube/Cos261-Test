// 21. Student Grade Tracker (corrected input issue)
import java.util.*;

public class GradeTracker {
    static Map<String, Integer> grades = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Record\n2. Update Record\n3. View All\n4. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine()); // Read full line and parse

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameAdd = sc.nextLine();
                    System.out.print("Enter score: ");
                    int scoreAdd = Integer.parseInt(sc.nextLine()); // Fix: Read full line and convert
                    grades.put(nameAdd, scoreAdd);
                    System.out.println("Record added!");
                    break;

                case 2:
                    System.out.print("Enter name to update: ");
                    String nameUpdate = sc.nextLine();
                    if (grades.containsKey(nameUpdate)) {
                        System.out.print("Enter new score: ");
                        int newScore = Integer.parseInt(sc.nextLine()); // Fix again
                        grades.put(nameUpdate, newScore);
                        System.out.println("Record updated!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No records yet.");
                    } else {
                        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
