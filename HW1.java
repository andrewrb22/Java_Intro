import java.util.Scanner;
public class HW1 {
public static void main(String[] args) {
   //Variables
    String fullname ;
    String empnumber ;
    double hours;
    double rate;
    double total;  
    double tax; 
    double net;

    Scanner myScan;
    myScan = new Scanner (System.in);

    //Scanning 

System.out.print("\nEnter the Employee's full name: ");
fullname = myScan.nextLine();

System.out.print("Enter the Employee's ID number: ");
empnumber = myScan.nextLine();

System.out.print("Enter pay rate per hour: ");
rate = (double) myScan.nextFloat();


;
System.out.print("Enter the reagular hours worked: ");
hours = (double) myScan.nextFloat();
;

//Calculating total, deduction tax and net pay

total = (double)rate * hours;
tax = (double)total * 0.06;
net = (double)total - (double)tax;

//Printing paycheck

System.out.print("\nThank you!\n");
System.out.print("---------------------------------------------\n");
System.out.print("\nHere is your paycheck!\n\n");
System.out.print("---------------------------------------------\n");
System.out.println("Employee's Name: " + fullname);
System.out.println("Employee's Number: " + empnumber);
System.out.println("Hourly rate of pay: " + rate);
System.out.println("Hours Worked: " + hours);
System.out.println("\nTotal Gross Pay: $" + total);
System.out.println("Deductions\nTax(%6): $" + tax);
System.out.println("Net Pay: $" + net + " Dollars");

System.out.print("-------------------------------------------");
myScan.close();
}
}