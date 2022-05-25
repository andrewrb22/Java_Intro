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

// import java.util.*;  
// public class ScannerNextFloatExample1 {    
//     public static void main(String args[]){       
//         int amount;  
//         double balance;  
//         //Insert amount and balance from console  
//         Scanner input = new Scanner (System.in);  
//         System.out.print("Enter the amount: ");  
//         amount = input.nextInt();  
//         System.out.print("Enter the Total Balance: ");  
//         balance = input.nextFloat();  
//         //Reduce amount+fee from balance  
//         balance = balance-(amount + 0.50);  
//         //Print new balance  
//         System.out.print("New Balance is: "+balance);  
//       input.close();  
//     }    





System.out.print("Enter the Employee's full name: ");
fullname = myScan.nextLine();

System.out.print("Enter the Employee's ID number: ");
empnumber = myScan.nextLine();

System.out.print("Enter pay rate per hour: ");
rate = (int) myScan.nextFloat();


;
System.out.print("Enter the reagular hours worked: ");
hours = myScan.nextInt();
;

total = (double)rate * hours;
tax = (double)total * 0.06;
net = (double)total - (double)tax;

System.out.print("Thank you\n!");
System.out.print("\nHere is your paycheck!\n\n\n\n");
System.out.print("---------------------------------------------\n\n\n");
System.out.println("Employee's Name: " + fullname);
System.out.println("\nEmployee's Number: " + empnumber);
System.out.println("\nHourly rate of pay: " + rate);
System.out.println("\nHours Worked: " + hours);
System.out.println("\n\nTotal Gross Pay: $" + total);
System.out.println("\n\nDeductions\nTax(%6): $" + tax);
System.out.println("\n\nNet Pay: $" + net + " Dollars");

System.out.print("-------------------------------------------");
myScan.close();
}
}