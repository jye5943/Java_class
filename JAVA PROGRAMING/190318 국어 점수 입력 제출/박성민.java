package javaproject;

import java.util.Scanner;

public class �ڼ��� {
	public static void main(String[] args) {
		System.out.println("�л�1�� ���� ������ �Է��ϼ���");
		int student1, student2, student3;
		Scanner s1 = new Scanner(System.in);
		student1 = s1.nextInt();

		System.out.println("�л�2�� ���� ������ �Է��ϼ���");
		Scanner s2 = new Scanner(System.in);
		student2 = s2.nextInt();
		System.out.println("�л�3�� ���� ������ �Է��ϼ���");
		Scanner s3 = new Scanner(System.in);
		student3 = s3.nextInt();

		if ("student1 > student2 && student2 > student3 && student1 >student3" != null) {
			System.out.println("�л�1 :1��  �л�2 : 2��  �л�3 : 3���Դϴ�");
		} else if ("student1 > student2 && student3 > student2 && student1 > student3" != null) {
			System.out.println("�л�1 :1��  �л�3 : 2��  �л�2 : 3���Դϴ�");
		}

		else if ("student2 > student1, && student1 > student3" != null) {
			System.out.println("�л�2 :1��  �л�1 : 2��  �л�3 : 3���Դϴ�");
		} else if ("student2 > student3, && student3 > student1" != null) {
			System.out.println("�л�2 :1��  �л�3 : 2��  �л�1 : 3���Դϴ�");
		}

		else if ("student3 > student1, && student1 > student2" != null) {
			System.out.println("�л�3 :1��  �л�1 : 2��  �л�2 : 3���Դϴ�");
		} else if ("student3 > student2, && student2 > student1" != null) {
			System.out.println("�л�3 :1��  �л�2 : 2��  �л�1 : 3���Դϴ�");

		}
	}
}
