import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		System.out.println("A�� ��������");
		Scanner sa = new Scanner(System.in);
		int score_A = sa.nextInt();
		System.out.println("B�� ��������");
		Scanner sb = new Scanner(System.in);
		int score_B = sb.nextInt();
		System.out.println("C�� ��������");
		Scanner sc = new Scanner(System.in);
		int score_C = sc.nextInt();
		System.out.println("�������� ������");
		int grade_A = 0;
		int grade_B = 0;
		int grade_C = 0;

		if (score_A >= score_B) {
			if (score_A >= score_C) {
				grade_A = 1;
			} else {
				grade_A = 2;
			}
		} else if (score_A < score_B) {
			if (score_A >= score_C) {
				grade_A = 2;
			} else {
				grade_A = 3;
			}
		}
		if (score_B >= score_A) {
			if (score_B >= score_C) {
				grade_B = 1;
			} else {
				grade_B = 2;
			}
		} else if (score_B < score_A) {
			if (score_B >= score_C) {
				grade_B = 2;
			} else {
				grade_B = 3;
			}
		}
		if (score_C >= score_A) {
			if (score_C >= score_B) {
				grade_C = 1;
			} else {
				grade_C = 2;
			}
		} else if (score_C < score_A) {
			if (score_C >= score_B) {
				grade_C = 2;
			} else {
				grade_C = 3;
			}
		}
		System.out.printf("A:%d��, B:%d��, C:%d��", grade_A, grade_B, grade_C);
	}
}
