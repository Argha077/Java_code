import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        int[] marks = new int[3];
        int total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        double average = total / 3.0;

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
        System.out.println("Average Marks: " + average);
    }
}
