import java.util.Scanner;

public class issue {
	public static void main(String[] args) {

		int ��������1;
		int ��������2;
		int ��������3;

		Scanner scan = new Scanner(System.in);
		��������1 = scan.nextInt();
		System.out.println(��������1);
		��������2 = scan.nextInt();
		System.out.println(��������2);
		��������3 = scan.nextInt();
		System.out.println(��������3);

		if (��������1 > ��������2 && ��������1>��������3 && ��������2 > ��������3) {
			System.out.println();
		}if (��������2 > ��������1 && ��������2 >��������3 && ��������3 > ��������1) {
			System.out.println();
		}if (��������3> ��������1 && ��������3 > ��������2 && ��������1 > ��������2) {
			System.out.println();
		}

	}

}
