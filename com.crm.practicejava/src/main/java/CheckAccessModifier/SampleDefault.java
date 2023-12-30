package CheckAccessModifier;

import AccessModifier.DemoPrivate;

public class SampleDefault  extends DemoPrivate{
     public static void main(String[] args) {
		SampleDefault sd=new SampleDefault();
		//sd.name
		//sd.age
		System.out.println("My Address is:: "+sd.address);//To access protected member we should have inheritance.
		System.out.println("My Hight is:: "+sd.hight);
	}
}

class CheckProtected {
	public static void main(String[] args) {
		DemoPrivate dp=new DemoPrivate();
		//System.out.println(dp.address);//To access protected member we should have inheritance.
		//Without inheritance we can't be access it.
		System.out.println("My Hight is:: "+dp.hight);
		
	}
}