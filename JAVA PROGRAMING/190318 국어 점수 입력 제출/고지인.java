package java6;

import java.util.Scanner;

//#3���� ���������� �Է¹޾Ƽ� ������ ǥ���غ���

public class ������ {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 a�� ���������� �Է����ּ���.");
		Scanner a = new Scanner(System.in);
		int number_a = a.nextInt();
		
		System.out.println("ȭ�鿡 b�� ���������� �Է����ּ���.");
		Scanner b = new Scanner(System.in);
		int number_b = b.nextInt();
		
		System.out.println("ȭ�鿡 c�� ���������� �Է����ּ���.");
		Scanner c = new Scanner(System.in);
		int number_c = c.nextInt();
		
		if(number_a > number_b && number_b > number_c) ;
			System.out.println("1�� : a /n/ 2�� : b /n/ 3�� : c");
		
			
		}
		
	}
