import java.util.Arrays;

class Student {
    private int rollNo;
    private String name;
    private int[] subjectMarks;

    // Constructor
    public Student(int rollNo, String name, int[] subjectMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subjectMarks = subjectMarks;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int[] getSubjectMarks() {
        return subjectMarks;
    }

    // Method to compute total marks
    public int computeTotalMarks() {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    // Method to compute percentage
    public double computePercentage() {
        int totalMarks = computeTotalMarks();
        return (double) totalMarks / subjectMarks.length;
    }

    // Method to compute grade
    public char computeGrade() {
        double percentage = computePercentage();
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to print student report card
    public void printReportCard() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Subject Marks: " + Arrays.toString(subjectMarks));
        System.out.println("Total Marks: " + computeTotalMarks());
        System.out.println("Percentage: " + computePercentage());
        System.out.println("Grade: " + computeGrade());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a student object
        int[] marks = {85, 90, 78}; // Sample marks for three subjects
        Student student = new Student(88, "sudhanshu", marks);

        // Printing student report card
        student.printReportCard();
    }
}

