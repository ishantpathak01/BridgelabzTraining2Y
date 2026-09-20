import java.util.Scanner;
public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nEmployee " + i);
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input, enter again.");
                i--; // repeat this employee
                continue;
            }
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }
            double newSalary = salary + bonus;
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        
        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
