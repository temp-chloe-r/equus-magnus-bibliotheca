package Taxes;
import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) {
		
		//Gathering input
		Scanner scanInstance = new Scanner(System.in);
		System.out.println("Enter your salary:");
		int mySalary = scanInstance.nextInt();
		//System.out.println("Your salary is " + mySalary);
		
		if (mySalary <= 14999) {
			//0% tax rate
			System.out.println("Your tax rate is 0%, you will be taxed " + (mySalary*0) + "!");
		} else if (mySalary >= 15000 && mySalary <= 19999) {
			//10% tax rate
			System.out.println("Your tax rate is 10%, you will be taxed " + (mySalary*0.1) + "!");
		} else if (mySalary >=20000 && mySalary <= 29999) {
			//15% tax rate
			System.out.println("Your tax rate is 15%, you will be taxed " + (mySalary*0.15) + "!");
		} else if (mySalary >=30000 && mySalary <= 44999) {
			//20% tax rate
			System.out.println("Your tax rate is 20%, you will be taxed " + (mySalary*0.2) + "!");
		} else if (mySalary >= 45000) {
			//25% tax rate
			System.out.println("Your tax rate is 25%, you will be taxed " + (mySalary*0.25) + "!");
		}
	}
}
