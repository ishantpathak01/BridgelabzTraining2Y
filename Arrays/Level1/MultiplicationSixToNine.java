import java.util.Scanner;
public class MultiplicationSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("\nMultiplication table from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        sc.close();
    }
}
