package learn.coding.numberbased;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int temp=num;
		int r=0,temp2=0;
		while(temp!=1 && temp!=4) {
			temp2=temp;
			int sum=0;
				while(temp2>0) {
					r=temp2%10;
					sum=sum+(r*r);
					temp2/=10;

				temp=sum;
//				System.out.println(temp);
		}
		if(temp==1) {
			System.out.println(num+" is a Happy Number...");
		}else {
			System.out.println(num+" is not a Happy Number!!!");
			}
		}
	}
}
