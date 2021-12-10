package mix;

public class replaceAllWhiteSpace {

	public static void main(String[] args) {
		String x = "    anas     saad         sami     ";
		System.out.println(x.trim().replaceAll("\\s+", " "));

	}

}
