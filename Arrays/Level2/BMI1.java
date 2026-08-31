import java.util.Scanner;
public class BMI1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            weight[i] = input.nextDouble();
            if (height[i] <= 0 || weight[i] <= 0) {
                System.out.println("Invalid input, enter again");
                i--;
            }
        }
        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " Height: " + height[i] + " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}
