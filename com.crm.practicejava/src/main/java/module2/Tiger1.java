package module2;

public class Tiger1 {
	
	private Tiger1() {
		System.out.println("Private Tiger is Running...");
	}
	
	public static Tiger1 getTiger1() {
		Tiger1 t1=new Tiger1();
		return t1;
	}
	public static void main(String[] args) {
//		Tiger1 t=new Tiger1();
		Tiger1 t1=Tiger1.getTiger1();
	}

}

class Animal1{
	public static void main(String[] args) {
//		Tiger t=new Tiger();
		Tiger1 t1= Tiger1.getTiger1();
		
	}
	
}
