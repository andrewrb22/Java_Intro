import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
// System.out.println("Hello World!");
//float x = 2.5f  , d;
//System.out.print("Enter your number: ");
Scanner myScan;
myScan = new Scanner (System.in);
//x = myScan.nextDouble();
/*long  x = 5;
int d;
d = 2 * (int)x;
System.out.println(x + " * 2 = " + d);
*/
//System.out.printf("[%-10.2f]\n", 7.0/2);
//System.out.println(  7/(double)2  );
    // int x , y , z;
// x = y = z = 7;
//System.out.println(2%7%5);
//System.out.println(2 +  "" + 3 + "Something" );
String fullname ;
String empnumber ;
float hours = 2.5f;
float rate = 2.5f;

System.out.print("Enter the Employee's full name: ");
fullname = myScan.nextLine();

System.out.print("Enter the Employee's ID number: ");
empnumber = myScan.nextLine();

System.out.print("Enter pay rate per hour: ");
rate = myScan.nextInt();
myScan = new Scanner(System.in)
;
System.out.print("Enter the reagular hours worked: ");
hours = myScan.nextInt();
myScan = new Scanner(System.in)
;

System.out.print("Thank you\n!");
System.out.print("\nHere is your paycheck!\n\n\n\n");
System.out.print("---------------------------------------------\n\n\n");
System.out.println("Employee's Name: " + fullname);


System.out.println("Nice to meet you " + fullname + "\nYou are " + age + " year old");
System.out.print("Goodbye!");
}
}