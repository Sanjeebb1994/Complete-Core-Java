package ExceptionHandling;

public class DemoException {
	public static void main(String[] args) {
		
		//1. Arithmetic Exception
		try {
			int i=55;
			int data=i/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest code...");
		
		//2. NullPointer Exception
		try {
			String str=null;
			System.out.println(str.length());
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Rest Code...");
		
		//3. NumberFormat Exception
		try {
			String str="Apple";
			int i=Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Rest Code....");
		
		//4. StringOutOfBound Exception
		try {
			String name="Sanjeeb";
			System.out.println(name.charAt(12));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest Code...");
		
		//5. ArrayOutOfBound Exception
		try {
			int[] num=new int[5];
			num[7]=50;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest Code...");
		
	}
}
