package learn.coding.numberbased;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the step No: ");
		int num=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+" ");
		while(num>0) {
			c=a+b;
			System.out.print(c+" ");
			b=a;
			a=c;
			num--;
		}
	}
	
}
