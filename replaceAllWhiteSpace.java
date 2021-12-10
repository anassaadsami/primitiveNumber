package mix;

public class replaceAllWhiteSpace {
	// this method to replace all serial whitespace to just one 

	public static void main(String[] args) {
		String x = "    anas     saad         sami     ";
		System.out.println(x.trim().replaceAll("\\s+", " "));

	}

}
