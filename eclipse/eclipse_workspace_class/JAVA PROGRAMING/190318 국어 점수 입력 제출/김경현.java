import java.util.Scanner;

public class forPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л�1�� ���� ������ �Է��ϼ���");
		int score1 = s.nextInt();
		System.out.println("�л�2�� ���� ������ �Է��ϼ���");
		int score2 = s.nextInt();
		System.out.println("�л�3�� ���� ������ �Է��ϼ���");
		int score3 = s.nextInt();
		System.out.println("�Է� ���� ����\n�л�1 : " + score1 + ", �л�2 : " + score2 + ", �л�3 : " + score3);
		if ((score1 > score2) && (score2 > score3)) {
			System.out.println("1�� : �л�1(" + score1 + "��), 2�� : �л�2(" + score2 + "��), 3�� : �л�3(" + score3 + "��)");
		} else if ((score1 > score2) && (score1 > score3) && (score3 > score2)) {
			System.out.println("1�� : �л�1(" + score1 + "��), 2�� : �л�3(" + score3 + "��), 3�� : �л�2(" + score2 + "��)");
		} else if ((score2 > score1) && (score1 > score3)) {
			System.out.println("1�� : �л�2(" + score2 + "��), 2�� : �л�1(" + score1 + "��), 3�� : �л�3(" + score3 + "��)");
		} else if ((score2 > score1) && (score2 > score3) && (score3 > score1)) {
			System.out.println("1�� : �л�2(" + score2 + "��), 2�� : �л�3(" + score3 + "��), 3�� : �л�1(" + score1 + "��)");
		} else if ((score3 > score1) && (score1 > score2)) {
			System.out.println("1�� : �л�3(" + score3 + "��), 2�� : �л�1(" + score1 + "��), 3�� : �л�2(" + score2 + "��)");
		} else if ((score3 > score1) && (score3 > score2) && (score2 > score1)) {
			System.out.println("1�� : �л�3(" + score3 + "��), 2�� : �л�2(" + score2 + "��), 3�� : �л�1(" + score1 + "��)");
		} else if ((score1 == score2) && (score2 == score3)) {
			System.out.println("1�� : �л�1(" + score1 + "��), �л�2(" + score2 + "��), �л�3(" + score3 + "��)");
		} else if ((score1 == score2) && (score2 > score3)) {
			System.out.println("1�� : �л�1(" + score1 + "��), �л�2(" + score2 + "��), 2�� : �л�3(" + score3 + "��)");
		} else if ((score1 == score2) && (score3 > score1)) {
			System.out.println("1�� : �л�3(" + score3 + "��), 2�� : �л�1(" + score1 + "��), �л�2(" + score2 + "��)");
		} else if ((score2 == score3) && (score3 > score1)) {
			System.out.println("1�� : �л�2(" + score2 + "��), �л�3(" + score3 + "��), 2�� : �л�1(" + score1 + "��)");
		} else if ((score2 == score3) && (score1 > score2)) {
			System.out.println("1�� : �л�1(" + score1 + "��), 2�� : �л�2(" + score2 + "��), �л�3(" + score3 + "��)");
		} else if ((score1 == score3) && (score3 > score2)) {
			System.out.println("1�� : �л�1(" + score1 + "��), �л�3(" + score3 + "��), 2�� : �л�2(" + score2 + "��)");
		} else if ((score1 == score3) && (score2 > score3)) {
			System.out.println("1�� : �л�2(" + score2 + "��), 2�� : �л�1(" + score1 + "��), �л�3(" + score3 + "��)");
		}
	}
}
