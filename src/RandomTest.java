import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int maximum = 5000, minimum = 0;
		int randomNum;
		randomNum = minimum + rand.nextInt((maximum - minimum) + 1);
		System.out.println(randomNum);
	}
}