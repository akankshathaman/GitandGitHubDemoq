/*
	Program to compute sum of digits (Example: 123=6) using loop.
*/
import java.util.Scanner;

class SumOfDigits{
	public static void main(String args[]){
		int num, sum=0, temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		temp= num;//4
		
		while(temp>=9){
			sum=sum+ temp%10;
			temp=temp/10;
		}
		if(temp<=9){
				sum=sum+temp;
			}
		System.out.println("Sum is "+ sum);
	}
}