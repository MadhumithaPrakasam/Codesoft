import java.util.Scanner;

public class MarksGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("    Student Marks & Grade Calculator");
        System.out.println("====================================");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];
        int totalMarks = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Enter again (0-100): ");
                marks[i] = sc.nextInt();
            }

            totalMarks += marks[i];
        }

        double average = (double) totalMarks / subjects;

        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n====================================");
        System.out.println("    Result Summary");
        System.out.println("====================================");
        System.out.println("Total Marks Obtained: " + totalMarks + "/" + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade Achieved: " + grade);
        System.out.println("====================================");

        sc.close();
    }
}
