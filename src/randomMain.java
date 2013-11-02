import java.util.Scanner;


public class randomMain {

	private static final int FOR_TEST = 6;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the random generated string below:");
		
		RandomStringGen random = new RandomStringGen(in.nextInt());
		String randomString = random.generate();
		System.out.println(randomString);

	}

}
