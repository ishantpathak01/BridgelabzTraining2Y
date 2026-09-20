import java.util.Scanner;
public class MultipleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10]; 
        double sum = 0;
        int i = 0;
        while (i < 10) {
            System.out.print("Enter a number ");
            double number = sc.nextDouble();
            if (number <= 0) {
                break; 
            }
            arr[i] = number;
            i++;
        }
        System.out.println(" \n Numbers entered : " ) ;
        for (int k = 0; k < i; k++) {
            System.out.println(arr[k]);
            sum += arr[k];
        }
        System.out.println(" Sum = " + sum);

        sc.close();
    }
}
