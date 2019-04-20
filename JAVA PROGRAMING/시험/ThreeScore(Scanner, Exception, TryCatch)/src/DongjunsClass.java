import java.util.Arrays;
import java.util.Scanner;

public class DongjunsClass  {
	public static void main(String[] args) {

		System.out.print("��ü �л� ���� �Է��ϼ���. ");
		Scanner s = new Scanner(System.in);
		int total_Student = 0;
		while (true) {
			try {
				total_Student = Integer.parseInt(s.nextLine());
				break;
			} catch (NumberFormatException e) {
				s = new Scanner(System.in);
				System.out.println("���ڸ� �Է����ּ���.");
			}
		}

		double sum_KoreanScore = 0;
		double sum_EnglishScore = 0;
		double sum_MathScore = 0;

		double[] student_PerSum = new double[total_Student];
		double[] student_PerAverage = new double[total_Student];

		double score_Scanner;
		double[] score_Korean = new double[total_Student];
		double[] score_English = new double[total_Student];
		double[] score_Math = new double[total_Student];

		String student_Name_Scanner = null;
		String[] student_Name = new String[total_Student];
		int[] rank_Student = new int[total_Student];

		for (int i = 0; i < total_Student; i++) {
			System.out.printf("%d�� �л��� �̸��� �Է��ϼ���. ����Ϸ��� \"quit\" �Է� ", (i + 1));
			student_Name_Scanner = s.nextLine();
			if (student_Name_Scanner.equalsIgnoreCase("quit")) {
				break;
			}
			student_Name[i] = student_Name_Scanner;

			System.out.printf(" %d�� �л��� ������� �Է��ϼ���. ", (i + 1));
			while (true) {
				try {
					score_Scanner = Double.parseDouble(s.nextLine());
					break;
				} catch (NumberFormatException e) {
					s = new Scanner(System.in);
					System.out.println(" ���ڸ� �Է����ּ���. ");
					System.out.printf(" %d�� �л��� ������� �Է��ϼ���. ", (i + 1));
				}
			}
			score_Korean[i] = score_Scanner;
			sum_KoreanScore += score_Korean[i];

			System.out.printf(" %d�� �л��� ������� �Է��ϼ���. ", (i + 1));
			while (true) {
				try {
					score_Scanner = Double.parseDouble(s.nextLine());
					break;
				} catch (NumberFormatException e) {
					s = new Scanner(System.in);
					System.out.println(" ���ڸ� �Է����ּ���. ");
					System.out.printf(" %d�� �л��� ������� �Է��ϼ���. ", (i + 1));
				}
			}
			score_English[i] = score_Scanner;
			sum_EnglishScore += score_English[i];

			System.out.printf(" %d�� �л��� ���м����� �Է��ϼ���. ", (i + 1));
			while (true) {
				try {
					score_Scanner = Double.parseDouble(s.nextLine());
					break;
				} catch (NumberFormatException e) {
					s = new Scanner(System.in);
					System.out.println(" ���ڸ� �Է����ּ���. ");
					System.out.printf(" %d�� �л��� ������ �Է��ϼ���. ", (i + 1));
				}
			}
			score_Math[i] = score_Scanner;
			sum_MathScore += score_Math[i];

			student_PerSum[i] = score_Korean[i] + score_English[i] + score_Math[i];
			student_PerAverage[i] = student_PerSum[i] / 3;

		}

		for (int i = 0; i < total_Student; i++) {
			rank_Student[i] = 1;
			for (int j = 0; j < total_Student; j++) {
				if (student_PerSum[i] < student_PerSum[j]) {
					rank_Student[i]++;
				}
			}
		}

		if (student_Name_Scanner.equalsIgnoreCase("quit")) {

		} else {
			System.out.println("\r\n��ü �л��� ���� ���� ���� : " + sum_KoreanScore);
			System.out.println("����� ��� : " + (sum_KoreanScore / total_Student));
			System.out.println("��ü �л��� ���� ���� ���� : " + sum_EnglishScore);
			System.out.println("����� ��� : " + (sum_EnglishScore / total_Student));
			System.out.println("��ü �л��� ���� ���� ���� : " + sum_MathScore);
			System.out.println("���м��� ��� : " + (sum_MathScore / total_Student));

			for (int i = 0; i < total_Student; i++) {
				System.out.printf("\r\n%d�� " + student_Name[i] + "\r\n", i + 1);
				System.out.print(" " + rank_Student[i] + "��\r\n");
				System.out.print(" ���� : " + score_Korean[i] + "��\r\n ���� : " + score_English[i] + "��\r\n ���� : " + score_Math[i]
						+ "��\r\n ��� : " + student_PerAverage[i] + "��\r\n");
			}
		}
	}

}
