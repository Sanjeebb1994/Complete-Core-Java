package learn.coding.numberbased;
import java.util.Scanner;

public class CheckPalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int sum=0,r=0;
		int temp=num;
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp/=10;
		}
		if(num==sum) {
			System.out.println(num+" is a Palindromic Number...");
		}else {
			System.out.println(num+" is not a Palindromic Number!!!");
		}
	}

}
