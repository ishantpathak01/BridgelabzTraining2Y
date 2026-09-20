import java.util.Scanner;
public class BMI2nd2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            personData[i][1] = input.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input, enter again");
                i--;
            }
        }
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " Height: " + personData[i][0] + " Weight: " + personData[i][1] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);
        }
    }
}
