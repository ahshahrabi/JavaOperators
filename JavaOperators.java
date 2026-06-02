
public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic operators demo");
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*20);
		System.out.println(10/20);
		System.out.println(20/10);
		System.out.println(10.0/20);
		System.out.println(20%9);
		
		String result = ((40>=20)||(30 > 50)) ? "alpha" : "beta";
		System.out.println(result);
		
		// Unary operators
		int var = 5;
		var = --var;
		System.out.println(var);
		var = +var;
		System.out.println(var);
		
	}

}
