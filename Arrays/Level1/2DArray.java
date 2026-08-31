import java.util.Scanner;
public class 2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[rows][cols]; 
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[rows * col];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[k] = matrix[i][j];
                k++;
            }
        }
        System.out.println("Elements in 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
