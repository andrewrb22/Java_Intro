import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
    String fullname ;
    String empnumber ;
    int hours;
    double rate;
    double total;  
    double tax; 
    double net;

    Scanner myScan;
    myScan = new Scanner (System.in);

System.out.print("Enter the Employee's full name: ");
fullname = myScan.nextLine();

System.out.print("Enter the Employee's ID number: ");
empnumber = myScan.nextLine();

System.out.print("Enter pay rate per hour: ");
rate = (int) myScan.nextFloat();


;
System.out.print("Enter the reagular hours worked: ");
hours = (int) myScan.nextFloat();
;

total = (double)rate * hours;
tax = (double)total * 0.06;
net = (double)total - (double)tax;

System.out.print("\nThank you!\n");
System.out.print("\nHere is your paycheck!\n\n");
System.out.print("---------------------------------------------\n");
System.out.println("Employee's Name: " + fullname);
System.out.println("\nEmployee's Number: " + empnumber);
System.out.println("\nHourly rate of pay: " + rate);
System.out.println("\nHours Worked: " + hours);
System.out.println("\nTotal Gross Pay: $" + total);
System.out.println("\nDeductions\nTax(%6): $" + tax);
System.out.println("\nNet Pay: $" + net + " Dollars");

System.out.print("-------------------------------------------");
myScan.close();
}
}