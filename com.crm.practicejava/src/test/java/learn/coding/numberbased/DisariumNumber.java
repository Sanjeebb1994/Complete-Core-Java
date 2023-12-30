package learn.coding.numberbased;
import java.util.Scanner;

public class DisariumNumber {
	/*
	 * The Number which sum of square of individual digit is equal to that number is called Disarium Number
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int r=0,sum=0,count=0,rev=0;
		int temp=num;
		while(temp>0) {
			r=temp%10;
			rev=(rev*10)+r;
			temp/=10;
		}
		while(rev>0) {
			r=rev%10;
			count++;
			int temp2=r;
			for(int i=1;i<count;i++) {
				temp2=temp2*r;
			}
			sum=sum+temp2;
			rev/=10;
			System.out.println(sum);
		}
		if(num==sum) {
			System.out.println(num+" is DisariumNumber..");
		}else {
			System.out.println(num+" is not a DisariumNumber!!");
		}
	}

}
