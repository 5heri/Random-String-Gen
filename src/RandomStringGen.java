import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomStringGen {

	private static final int DIFFERENCE_NUM = 48;
	private static final int DIFFERENCE_CAPITAL = 55;
	private static final int DIFFERENCE_LOWER = 61;
	private static final String EMPTY_STRING = "";

	private int length;
	private Random random;
	private Map<Integer, Integer> allValues = new HashMap<Integer, Integer>();

	public RandomStringGen(int length) {
		this.length = length;
		random = new Random();
		for (int i = 0; i <= 9; i++) {
			allValues.put(i, i + DIFFERENCE_NUM);
		}
		for (int i = 10; i <= 35; i++) {
			allValues.put(i, i + DIFFERENCE_CAPITAL);
		}
		for (int i = 36; i <= 61; i++) {
			allValues.put(i, i + DIFFERENCE_LOWER);
		}
	}

	public String generate() {

		String result = EMPTY_STRING;

		for (int i = 0; i < length; i++) {
			int rand = random.nextInt(allValues.size());
			int requiredInt = allValues.get(rand);
			char randChar = (char) requiredInt;
			result = result + randChar;
		}
		return result;
	}
}
