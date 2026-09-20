import java.util.Scanner;
public class GradeCal2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            marks[i][0] = sc.nextInt(); 
          marks[i][1] = sc.nextInt(); 
            marks[i][2] = sc.nextInt(); 
        }

        for (int i = 0; i < n; i++) {
            double per = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            String grade;
            if (per >= 80) grade = "A";
            else if (per >= 70) grade = "B";
            else if (per >= 60) grade = "C";
            else if (per >= 50) grade = "D";
            else if (per >= 40) grade = "E";
            else grade = "R";
            System.out.println("Student " + (i + 1) + ": % = " + per + ", Grade = " + grade);
        }
    }
}
