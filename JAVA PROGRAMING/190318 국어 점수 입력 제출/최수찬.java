import java.util.Arrays;
import java.util.Scanner;

public class forTest {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		System.out.println("3���� ������ �Է����ּ���");
		int inputScore1 = score.nextInt();
		int inputScore2 = score.nextInt();
		int inputScore3 = score.nextInt();
		
		int[] scoreArrays = new int[] {inputScore1, inputScore2, inputScore3};
		Arrays.sort(scoreArrays);

		System.out.println("3�� : " + scoreArrays[0]);
		System.out.println("2�� : " + scoreArrays[1]);
		System.out.println("1�� : " + scoreArrays[2]);
		
		
	}
}
