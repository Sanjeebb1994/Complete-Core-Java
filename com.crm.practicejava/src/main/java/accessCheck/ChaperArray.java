package accessCheck;

import java.util.Scanner;

public class ChaperArray {
	/*
	 * Array: Array is type safe data structure in nature.
	 * Array is called index based data structure why because all operation are takes place on the
	 * basis of index. 
	 * Each and every memory cell will have separate index value.
	 * Array index is always start from 0 value.
	 * Array is fixed in size.
	 * Array is not auto growable in nature, 
	 * 
	 * Types of Array:
	 * 1. Based on data types:
	 *  a. Primitive Array
	 *  b. Non-Primitive Array.
	 * 2. Based on Dimension
	 *  a. Single Dimension
	 *  b. Multi Dimension
	 * 3. Based on declaration
	 *  a. Array with new keyword
	 *  b. Array without new keyword.
	 */
	public static void main(String[] args) {
		
	}

}
//Single Dimensional primitive array with new keyword.

class Test1{
	public static void main(String[] args) {
		/*
		 * We insert and fetch data from in two way.
		 */
		// DataType dimensional reference variable =new DataType[size];
		int[] age=new int[5];
		
		//insert data into Array.
		age[0]=23;
		age[1]=34;
		age[2]=45;
		age[3]=56;
		age[4]=67;
		//age[5]=78;
		System.out.println(age.length);//--> in Array length is variable.
		String str="Sanjeeb";
		System.out.println(str.length());//-->in String length is method.
		
		//Fetch data from Array.
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		//System.out.println(age[5]);
		
	}
}

class Test2{
	public static void main(String[] args) {
		//Insert data into array by using for loop;
		int[] num=new int[10];
		
		int x=100;
		for(int i=0;i<num.length;i++) {
			num[i]=x;
			x++;
		}
		
		//Fetch data by using for each loop;
		for(int y : num) {
			System.out.println(y);
		}
		System.out.println("----------------------------------");
		//Fetch data by using for loop.
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
		}
		
		
	}
}

//Single dimensional permeative Array without new keyword.
// DataType dimension reference variable ={};--> here no need mention size it will automatically catch the size.
class Test3{
	public static void main(String[] args) {
		String[] name= {"Sanjeeb","Rajib","Ankita","Smruti"};
		System.out.println("Size of the Array is:: "+name.length);
		
		//Fetch data
		for(String x:name) {
			System.out.println(x);
		}
	}
}

//Array with scanner class.
class Test4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number you want to add:: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Size of the Array is: "+num.length);
		System.out.println("Enter the numbers:: ");
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter "+(i+1)+" Number:: ");
			num[i]=sc.nextInt();
		}
		
		System.out.println("The Numbers are:: ");
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
		}
	}
}
/*
 * In Primitive Array we can store only one data type. 
 * To avoid this problem we needs to go for Object class.
 * In below few examples of Object class.
 */

//Single dimensional non-premetive array with new keyword.
class Rivers{
	String name;
	String originPlace;
	
	Rivers(String name, String originPlace){
		this.name=name;
		this.originPlace=originPlace;
	}
	
	@Override
	public String toString() {
		return "Name:: "+name+", OriginPlace:: "+originPlace;
	}
	
	public static void main(String[] args) {
		Rivers[] r=new Rivers[4];
		r[0]=new Rivers("Ganga","Gongotri");
		r[1]=new Rivers("Yamuna","Yamunetri");
		r[2]=new Rivers("Mahanadi","Amarkantak");
		r[3]=new Rivers("Kaveri","ChotnagpurPlatue");
		
		for(Rivers re:r) {
			System.out.println(re);
		}
		
	}
}

class Student{
	String name;
	int rollNum;
	char blodGroup;
	
	Student(String name,int rollNum,char blodGroup){
		this.name=name;
		this.rollNum=rollNum;
		this.blodGroup=blodGroup;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+", Rollnumber: "+rollNum+", bloodGroup: "+blodGroup;
	}
	
	public static void main(String[] args) {
		Student[] std=new Student[3];
		std[0]=new Student("Sanjeeb",123,'B');
		std[1]=new Student("Rajib",334,'O');
		std[2]=new Student("Ankita",554,'A');
		
		for(Student s:std) {
			System.out.println(s);
		}
	}
}
//How to convert one data type to another data type.
class Test6{
	public static void main(String[] args) {
		String name="Sanjeeb";
		
		char[] ch=name.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
	}
}

// Array related program.
//1. How to split the Array.
class Program1{
	public static void main(String[] args) {
		String message="Hello all good morning..";
		System.out.println(message);
		String[] str=message.split(" ");
		for(String s:str) {
			System.out.println(s);
		}
	}
}

//2. How to reverse an Array.
class Program2{
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5};
		int[] rev=new int[x.length];
		int size=rev.length;
		//Data feed to reverse array.
		for(int i : x) {
			rev[--size]=i;
		}
		
		System.out.println("Original Araay is:: ");
		for(int y : x) {
			System.out.println(y);
		}
		System.out.println("Reverse Array is:: ");
		for(int z : rev) {
			System.out.println(z);
		}
		
	}
}

//2-D Primitive array with new keyword.
class Demo1{
	public static void main(String[] args) {
		int[][] x=new int[2][3];
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		//x[0][3]=4;
		//----
		x[1][0]=10;
		x[1][1]=11;
		x[1][2]=12;
		//x[1][3]=13;
		//--
//		x[2][0]=100;
//		x[2][1]=101;
//		x[2][2]=102;
//		x[2][3]=103;
		//System.out.println(x[2][0]);
		System.out.println(x[1][0]);
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println("Value fetch by using for loop: ");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.println(x[i][j]);
			}
		}
		System.out.println("Value fetch by using for each loop: ");
		for(int[] i:x) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
//2-D array without new keyword
class Demo2{
	public static void main(String[] args) {
		int[][] x= {{1,2,3},{10,20,30,40},{90,100}};
		for(int[] i: x) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

//Few important array program
//1. Occurrence of every number in array:
class Sample1{
	public static void main(String[] args) {
		int[] num= {10,20,10,30,50,40,30,10};
		for(int i=0;i<num.length;i++) {
			int x=num[i];
			int count=0;
			for(int j=0;j<num.length;j++) {
				int y=num[j];
				if(x==y && i>j) {
					break;
				}
				if(x==y) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(x+"-->"+count);
			}
		}
	}
}

//2. How to remove duplicate from Array;
class Sample2{
	public static void main(String[] args) {
		int[] num= {12,34,56,78,12,56,56,12};
		for(int i=0;i<num.length;i++) {
			int x=num[i];
			int count=0;
			for(int j=0;j<num.length;j++) {
				int y=num[j];
				if(x==y && i>j) {
					break;
				}
				if(x==y) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(x+" ");
			}
		}
		
	}
}
//3. Shorting Array incremental way.
class Sample3{
	public static void main(String[] args) {
		int[] num= {12,10,56,34,45,78};
		System.out.println("Array before shorting:: ");
		for(int y:num) {
			System.out.print(y+" ");
		}
		System.out.println();
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[j]<num[i]) {
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
		}
		System.out.println("Array after shoting:: ");
		for(int x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Min Number is: "+num[0]);
	}
}
//4. Shorting Array decrement way.
class Sample4{
	public static void main(String[] args) {
		int[] num= {76,23,21,45,43,67,87};
		System.out.println("Array before shorting:: ");
		for(int x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array after shorting:: ");
		for(int y:num) {
			System.out.print(y+" ");
		}
		System.out.println();
		System.out.println("Max. Number is:: "+num[0]);
		
	}
}
//                 <-- Array Complete -->
