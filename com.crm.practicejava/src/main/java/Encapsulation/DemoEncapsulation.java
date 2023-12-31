package Encapsulation;

public class DemoEncapsulation {
	private int x=10;//Global non-static
	private static int y=20;//Global-static
//	{
//		private int z=10;
//	}
	public static void main(String[] args) {
		//private int x=10;//Local variable can't be declare as private.
		DemoEncapsulation de=new DemoEncapsulation();
		System.out.println(de.x);
		System.out.println(DemoEncapsulation.y);
		System.out.println(de.y);
		System.out.println(y);
	}

}

class PersionDetails{
	private String name="Sanjeeb";
	private long accountNumber=20212165499L;
	
	//Here we provide only read access.
	public String getName() {
		return name;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	//Here we provide both read and write access.
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAccountNumber(long acc) {
		this.accountNumber=acc;
	}
   
}
class AccessPersion extends PersionDetails{
	public static void main(String[] args) {
		AccessPersion ap=new AccessPersion();
		String name=ap.getName();
		//Access name
		System.out.println(name);
		
		//Access accountNumber
		long accountNumber =ap.getAccountNumber();
		System.out.println(accountNumber);
		
		ap.setName("Bisu");
		System.out.println(ap.getName());
		System.out.println(ap.getAccountNumber());
		ap.setAccountNumber(20212165433L);
		System.out.println("Account number has changed....");
		System.out.println(ap.getName());
		System.out.println(ap.getAccountNumber());
	   
	}
}

