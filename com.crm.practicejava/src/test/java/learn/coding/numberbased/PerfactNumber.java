package learn.coding.numberbased;

import java.util.Scanner;

public class PerfactNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int fact=0,d=0,temp2=0;
		while(temp>1) {
			if(num%temp==0) {
				temp2=num;
				d=temp2/temp;
				fact=fact+d;
			}
			temp--;
		}
		if(fact==num) {
			System.out.println(num+" is a Perfect number..");
		}else {
			System.out.println(num+" is not a Perfect numbr!!!");
		}
	}

}
