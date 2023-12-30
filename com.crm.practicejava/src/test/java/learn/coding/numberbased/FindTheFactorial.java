package learn.coding.numberbased;

import java.util.Scanner;

public class FindTheFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int temp=num;
		int fact=1;
		
			if(temp==0||temp==1) {
				System.out.println("Factorial of the number is: 1");
			}else {
				while(temp>0) {
					fact=fact*temp;
					temp--;
				}
				System.out.println("Factorial of "+num+" number is: "+fact);
			}
	}

}
