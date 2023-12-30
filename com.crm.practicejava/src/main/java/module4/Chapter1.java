package module4;

public class Chapter1 {
	//        <-- String -->
	/*
	 * What is a String?
	 * ANS: String is an object which contains n no.of characters.
	 * each element present inside the String is a character.
	 * if an user makes an array of characters then that array is nothing but a String.
	 * We can declare string object in two ways.
	 * 1. By creating a String object with new keyword
	 * 2. By creating a String object without new keyword using "double quotation"
	 * If any string create by using new keyword then that object will store inside the heap area
	 * If any string create by using " " quotation the that object will store inside SCP Area.
	 * SCP Area is present inside the method Area from JDK 8 onwards due to increase the performance
	 * heap Area does't allow any duplicate value.
	 * SCP area can allow the duplicate value.
	 * If String got muted with another String that String object will store inside the heap area.
	 * 
	 */
	public static void main(String[] args) {
//		String s =new String("");
	}

}
class Test{
	public static void main(String[] args) {
		String s=new String("Hello");
		// Here one Hello will store in heap area with s object and another Hello store inside SCP area.
		String s1="Hi";
		// Since there is no new keyword so Hi will store in SCP area with memory name as s1.
		String s2=new String("Bye");
		String s3=new String("Bye");
		System.out.println(s2==s3);//false / not allow any duplicate
		String s4="Bye";
		System.out.println(s2==s4);//false
		String s5="Bye";
		System.out.println(s4==s5);//true //Since SCP area allow duplicate value both s4 & s5 are pointing Bye.
		String s6="bye";
		System.out.println(s5==s6);//false
		String s7="Hi";
		String s8=s6+s7;//sice it is a String immutability it will store inside the Heap Area.
		System.out.println(s8);//byeHi
		String s9="byeHi";
		System.out.println(s8==s9);//false
		String s10=new String("byeHi");
		System.out.println(s8==s10);//false
		
	}
}
//Various inbuilt method present for String let us take a look.
class Demo{
	public static void main(String[] args) {
		String str="Mahabharat";
		//1. length();
		System.out.println(str.length());
		//2. charAt();
		System.out.println(str.charAt(0)+" "+str.charAt(9));
		//3. indexOf();
		System.out.println(str.indexOf('b'));
		//4. toUpper();
		System.out.println(str.toLowerCase());
		//5. toLower();
		System.out.println(str.toUpperCase());
		//6. lastIndex();
		System.out.println(str.lastIndexOf('t')+" "+str.lastIndexOf('a'));
		//7. subString();
		System.out.println(str.substring(4));
		System.out.println(str.substring(5, 8));
		//8. subSequence();
		System.out.println(str.subSequence(3, 7));
		str=" Maha Bharat ";
		//9. trim();
		System.out.println(str.trim());
		//10. replace();char
		System.out.println(str.replace('a', 'h'));
		//11. replace(); String
		System.out.println(str.replaceAll("Bharat", "India"));
		//12. Comparison Method.
		str="Baharat";
		System.out.println(str.equals("Baharat"));
		System.out.println(str.equalsIgnoreCase("baharat"));
		System.out.println(str.contains("Baha"));
		System.out.println(str.startsWith("Baha"));
		System.out.println(str.endsWith("rat"));
		//13. concat();
		System.out.println(str.concat("Ajao"));
		
	}
}

// WAP to reverse a String
/*
 * i/p: Mahabharat
 * o/p: tarahbahaM
 */
class ReverseString{
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		System.out.println("String before reverse: "+str);
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println("String after reverse: "+rev);
		
	}
}

class RemoveSpace{
	public static void main(String[] args) {
		String str="Maha Bharat";
		String str1="";
		System.out.println("Before removing space: "+str);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				//i++;
				continue;
			}else {
			 str1=str1+ch;
			}
		}
		System.out.println("After remove space: "+str1);
	}
}

class StringOccurance{
	public static void main(String[] args) {
		String str="Mahabharat";
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2 && i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+" --> "+count);
			}
		}
	}
}

class RemoveDuplicate{
	public static void main(String[] args) {
		String str="Mahabharat";
		String str1="";
		System.out.println("String before remove duplicate: "+str);
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2 && i>j ) {
					break;
				}
				
				if(ch1==ch2) {
					count++;
				}
				
			  }
			if(count==1) {
			str1=str1+ch1;
			}
		}
		System.out.println("String after remove duplicate: "+str1);
	}
}

class FindVowel{
	public static void main(String[] args) {
		String str="Apple";
		System.out.println("Original String is:: "+str);
		String str1=str.toLowerCase();
		System.out.println("Vowel present: ");
		String vowel="aeiou";
		for(int i=0;i<str.length();i++) {
			char ch1=str1.charAt(i);
			for(int j=0;j<vowel.length();j++) {
				char ch2=vowel.charAt(j);
				if(ch1==ch2) {
					System.out.println(ch2+" present");
				}
			}
		}
	}
}

/*
 i/p: Name;
 o/p: naammmeeee
*/

class Program1{
	public static void main(String[] args) {
		String name="Name";
		name=name.toLowerCase();
		String out="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			for(int j=0;j<=i;j++) {
				out=out+ch;
			}
		}
		System.out.println(out);
	}
}

/*
i/p: abc 123;
o/p: cba 321;
*/
class Program2{
	public static void main(String[] args) {
		String str="abc 123";
		String out="";
		int n=str.length();
		if(n%2==0) {
			n=n/2;
		}else {
			n=(n/2)+1;
		}
		System.out.println(n);//4
		for(int i=0;i<str.length();i++) {
			if(i<n) {
				for(int j=n-1;j>=0;j--) {
					out=out+str.charAt(j);
					i++;
				}
			}else {
				for(int k=str.length()-1;k>=n;k--) {
					out=out+str.charAt(k);
					i++;
				}
			}
		}
		System.out.println(out);
	}
}

/*
 * Mutable version of string..
 * 1. String Buffer
 * 2. String Builder
 * 
 * String Buffer: It's a class present in java.lang package.
 * String buffer is a final class so we can inherit or override it.But we can crate object for it.
 * 
 * String Builder: String builder functionality is exactly same as String buffer.
 * Difference between String buffer and String Builder.
 * String buffer:
 * 1. It is Thread safe in nature.
 * 2. It is Synchronized in nature.
 * 3. Performance is slower in nature.
 * 4. It comes since JDK-1
 * String Builder:
 * 1. It is not Thread sage in nature.
 * 2. It is not Synchronized in nature.
 * 3. It's performance is faster.
 * 4. It came since JDK 5;
 */
class TestSample{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.append("Good");//It will concatenate at the last of the string.
		System.out.println(sb);
		sb.insert(5, "Bad");//Middle string.
		System.out.println(sb);
		sb.delete(5, 8);//It will delete.
		System.out.println(sb);
		sb.reverse().toString();//It will reverse--> dooGolleH
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("Mahabharat");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
	}
}

//Programe1:
//i/p: abcabcddcadd
//o/p: a3b2c3d4

class Program01{
	public static void main(String[] args) {
		String str="abcabcddcadd";
		String out="";
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2 && i>j) {
					break;
				}
				
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>=1) {
				out=out+ch1+count;
			}
		}
		System.out.println(out);
	}
}

//Program2
//i/P: I Am Not String
//o/p: g ni rtS toNmAi
class Program02{
	public static void main(String[] args) {
		String str="I Am Not String";//14/15
		String out="";
		int c=str.length();
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch1==' ') {
				out=out+ch1;
			}
			int d=i;
			char ch2=str.charAt(c-(d+1));
			out=out+ch2;
			//System.out.println(out);
		}
		System.out.println(out);
	}
}