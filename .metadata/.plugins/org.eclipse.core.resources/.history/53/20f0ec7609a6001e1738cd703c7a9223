package AccessModifier;

public class DemoPrivate {
	
	private String name="Sanjeeb";
	int age=32;
	protected String address="Balasore";
	public float hight=5.67f;
	public static void main(String[] args) {
		DemoPrivate dp=new DemoPrivate();
		System.out.println("My Name is:: "+dp.name);
		System.out.println("My age is:: "+dp.age);
		System.out.println("My address is:: "+dp.address);
		System.out.println("My hight is:: "+dp.hight);
	}

}

class TestDemo extends DemoPrivate{
	public static void main(String[] args) {
		TestDemo td=new TestDemo();
		//System.out.println(td.name);//Since it declare as private we can't be access outside other class
		System.out.println("My age is:: "+td.age);
		System.out.println("My address is:: "+td.address);
		System.out.println("My hight is:: "+td.hight);
	}
}

class Bisu{
	public static void main(String[] args) {
		DemoPrivate dp=new DemoPrivate();
		System.out.println(dp.age);
		System.out.println(dp.address);
		
	}
}