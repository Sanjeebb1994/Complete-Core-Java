package module2;

public class Chapter6 {
	//Access Modifier
	
	/*
	 * In java there are some specific keyword to specify the access of class member.
	 * Those are:
	 *  1. public 
	 *  2. Protected
	 *  3. Default
	 *  4. Private
	 *  If you go from 1 to 4 then the security of class member will increase but scope of the class member will decrease.
	 *  Public: If we declare any member as public then we can access it in entire project.
	 *  protected: access it inside the class out side the class out side the package.
	 *  Default: if we declare the variable as default then we can access it out side class and but not out side the package.
	 *  Private: If we declare any variable as private then we can access it inside the class.
	 *  
	 */
	public int x=23;
	protected int y=24;
	int z=25;
	private int l=26;
	public static void main(String[] args) {
		Chapter6 s=new Chapter6();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.z);
		System.out.println(s.l);
	}
	/*
	 * If we want to access any protected member then after inheritance we have create an object
	 * of sub class otherwise we can't access it.
	 * 
	 * We can't be access any private member outside the other class.
	 * Any default property can't be inherit in any class present in other package.
	 * Only public property can be access anywhere in entire package.
	 * Default property can be inherit in same package.
	 */

}





























