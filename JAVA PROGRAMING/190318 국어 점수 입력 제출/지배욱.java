// 3���� ���������� �Է¹޾Ƽ�  ������� ���

import java.util.Scanner;

public class Edu04 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int stuScore01 = 0;
		int stuScore02 = 0;
		int stuScore03 = 0;
		
		System.out.println("ù��° �л��� ���� ������ �Է��� �ּ���.");
		stuScore01 = s.nextInt();
		
		System.out.println("�ι�° �л��� ���� ������ �Է��� �ּ���.");
		stuScore02 = s.nextInt();
		
		System.out.println("����° �л��� ���� ������ �Է��� �ּ���.");
		stuScore03 = s.nextInt();
		
		if (stuScore01 > stuScore02 && stuScore01 > stuScore03) {
			if ( stuScore02 > stuScore03) {
				System.out.printf("1���� ù��°�л� %d�� 2���� �ι�°�л� %d�� 3���� ����°�л� %d�� \n",stuScore01, stuScore02, stuScore03);
			} else if (stuScore03 > stuScore02) {
				System.out.printf("1���� ù��°�л� %d�� 2���� ����°�л� %d�� 3���� �ι�°�л� %d�� \n", stuScore01, stuScore03, stuScore02);
			} else {
				System.out.println("������ �迭 ���� ���� �Ф�");
			}
		} else if (stuScore02 > stuScore01 && stuScore02 > stuScore03) {
			if ( stuScore01 > stuScore03) {
				System.out.printf("1���� �ι�°�л� %d�� 2���� ù��°�л� %d�� 3���� ����°�л� %d�� \n", stuScore02, stuScore01, stuScore03);
			} else if (stuScore03 > stuScore01) {
				System.out.printf("1���� �ι�°�л� %d�� 2���� ����°�л� %d�� 3���� ù��°�л� %d��  \n", stuScore02, stuScore03, stuScore01);
			} else {
				System.out.println("������ �迭 ���� ���� �Ф�");
			}
		} else if (stuScore03 > stuScore01 && stuScore03 > stuScore02) {
			if ( stuScore01 > stuScore02) {
				System.out.printf("1���� ����°�л� %d�� 2���� ù��°�л� %d�� 3���� �ι�°�л� %d��  \n", stuScore03, stuScore01, stuScore02);
			} else if (stuScore02 > stuScore01) {
				System.out.printf("1���� ����°�л� %d�� 2���� �ι�°�л� %d�� 3���� ù��°�л�%d��  \n", stuScore03, stuScore02, stuScore01);
			}
		} else {
			System.out.println("������ �迭 ���� ���� �Ф�");
		}
	}
}
