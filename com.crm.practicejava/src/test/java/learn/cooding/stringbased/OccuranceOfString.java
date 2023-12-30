package learn.cooding.stringbased;

public class OccuranceOfString {

	public static void main(String[] args) {
		String str="Hello 1 World";
		int count=0;
		//Find the occurrence of the String.
		for(int i=0;i<str.length()-1;i++) {
			char ch1=str.charAt(i);
			count=0;
			for(int j=0;j<str.length()-1;j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2&&i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {		
				System.out.println(ch1+"=="+count);
			}
		}

	}

}
