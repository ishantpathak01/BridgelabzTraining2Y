import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
       int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error: Enter a number greater than 0.");
            return;
        }
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nEven numbers:");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
