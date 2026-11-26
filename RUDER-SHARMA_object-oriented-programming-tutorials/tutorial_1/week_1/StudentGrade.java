import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = input.nextInt();

        String grade;
        if (marks < 0 || marks > 100) {
            grade = "Invalid";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + grade);

        input.close();
    }
}
