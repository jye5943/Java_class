import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class for_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է����ּ���.\n");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();

		int[] scores = new int[] {score1, score2, score3};
		System.out.println("\n������� ���\n");
		Arrays.sort(scores);
		for (int a: scores) {
			System.out.println(a);
		}
		}
}

