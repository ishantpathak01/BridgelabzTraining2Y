import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(number + " is Negative");
            } else {
                System.out.println(number + " is Zero");
            }
        }
        if (arr[0] == arr[arr.length-1]) {
            System.out.println("First and last elements are Equal");
        } else if (arr[0] > arr[arr.length-1]) {
            System.out.println("First element is Greater than  the last element");
        } else {
            System.out.println("First element is Less than the last element");
        }
        sc.close();
    }
}
