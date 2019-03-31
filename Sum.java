/*
	2. Write a Java program to print the sum of two numbers.
*/
import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		int num1,num2,sum;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		num1=scan.nextInt();
		System.out.println("Please enter second number:");
		num2= scan.nextInt();
		
		sum=num1 + num2;
		System.out.println(num1+" + "+num2+" = "+sum);
	}
}