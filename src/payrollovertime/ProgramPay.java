package payrollovertime;


import java.util.Scanner;

public class ProgramPay {

    public static void main(String[] args) {

        boolean nonQuit = true;
        Scanner input = new Scanner(System.in);
        Housekeeping housekeeping = new Housekeeping();

        System.out.print("\n\n\nThis program computes payroll based on");
        System.out.println(" overtime rate of " + housekeeping.getOvertime() +
                " after " + housekeeping.getWork_week() + " hours.");



		while(nonQuit) {
        System.out.print("Please type the Employee name or type QUIT: ");
        String name = input.nextLine(); // prompt
        housekeeping.setName(name);

        if (name.equalsIgnoreCase("quit")) {
            System.out.print("\nYou typed quit, Try again.\n");
        }
        else {
            nonQuit = false;

            System.out.print("Enter hours worked: ");
            int hours = input.nextInt(); // prompt
            housekeeping.setHours(hours);
            System.out.println("Pay for " + housekeeping.getName() + " is $" + housekeeping.calculatePay());

        }

    }

		System.out.print("\nOvertime pay calculations complete!\n\n\n");

} // main
}

