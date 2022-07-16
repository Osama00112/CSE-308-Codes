import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject credit :");
        int credit = sc.nextInt();
        System.out.println("Enter total marks :");
        String marks = sc.next();

        GradeCalculation gradeObject = new GradeCalculation();
        System.out.println(gradeObject.calculateGradeCredit3(marks));
    }
}
