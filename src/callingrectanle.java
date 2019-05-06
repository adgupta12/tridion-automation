
public class callingrectanle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle1 obj2 = new Rectangle1(40.0,50.0);
		System.out.println(obj2.length);
		System.out.println(obj2.breadth);
		
		Rectangle1 obj3;
		
		obj3= Rectangle1.fn_returnobj();
		
		System.out.println(obj3.length);
		System.out.println(obj3.breadth);
		

	}

}
