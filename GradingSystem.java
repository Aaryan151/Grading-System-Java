import java.util.Scanner;

public class GradingSystem {

    // Method to calculate grade
    static char calculateGrade(int marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 40)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        char[] grades = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            grades[i] = calculateGrade(marks[i]);
        }

        // Display results
        System.out.println("\n--- STUDENT GRADING REPORT ---");
        System.out.println("Student\tMarks\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + marks[i] + "\t" + grades[i]);
        }

        sc.close();
    }
}
