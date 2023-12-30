import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int i, sum = 0;
        float avg;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of subjects:");
            int subject = sc.nextInt();
            for (i = 1; i <= subject; i++) {
                System.out.println("Enter the marks scored in subject " + i + " out of 100");
                sum = sum + sc.nextInt();
            }
            System.out.println("The total marks obtained in all subjects is:" + sum);
            avg = sum / subject;
            System.out.println("Average marks of all subjects is:" + avg);
        }
        String grade = calculategrade(avg);
        System.out.println(grade);
    }

    private static String calculategrade(float avg) {
        if (avg >= 90) {
            return "Grade:A+";
        } else if (avg >= 80) {
            return "Grade:A";
        } else if (avg >= 70) {
            return "Grade:B";
        } else if (avg >= 60) {
            return "Grade:C";
        } else if (avg >= 50) {
            return "Grade:D";
        } else {
            return "Grade:F";
        }
    }
}