package learn.coding.numberbased;
import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		int r=0,store=0;
		int temp=num;
		System.out.println("Before Reverse the Number: "+num);
		while(temp>0) {
			r=temp%10;
			store=(store*10)+r;
			temp/=10;
		}
		System.out.println("After reverse the Number: "+num+" : "+store);
	}
}
