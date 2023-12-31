package Collection;

public class DemoClone implements Cloneable{
	String name;
	int age;
	DemoClone(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		DemoClone dc1=new DemoClone("Sanjeeb", 29);
		DemoClone dc2=(DemoClone)dc1;
		DemoClone dc3=(DemoClone)dc2;
		
		System.out.println("Name: "+dc1.name+" and Age: "+dc1.age);
		System.out.println("Name: "+dc2.name+" and Age: "+dc2.age);
		System.out.println("Name: "+dc3.name+" and Age: "+dc3.age);
	}
	
	
}
