package mix;

public class PremitiveDataTypeByValur {

	public static void main(String[] args) {
		int n = 4;
		add(n);
		System.out.println(n); // the same reason here

		boolean single = true;
		System.out.println(changeStatus(single));
		System.out.println(single); // we did'nt change the variable itself
									// cause we sent just copy of the value of the variable

		String x = "ANas";
		String y = new String("sami");
		changeName(x);
		changeName(y);

		System.out.println(x);      // the same here by value
		System.out.println(y);      // the same

	}
	// when we pass all (primitive data type) to a method as a parameter (BY VALUE)
	// it means we send copy of the this value not the variable itself

	public static void add(int num) {
		System.out.println(num * 2);
	}

	public static boolean changeStatus(boolean b) {
		return !b;
	}
	public static void changeName(String name) {
		System.out.println(name.toUpperCase());
	}

}
