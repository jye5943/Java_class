import java.util.Scanner;

public class �ǽ�2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
System.out.println("1�� �л� ���� �Է����ּ���.");
		int grade1 = s.nextInt();
System.out.println("2�� �л� ���� �Է����ּ���.");
		int grade2 = s.nextInt();
System.out.println("3�� �л� ���� �Է����ּ���.");
		int grade3 = s.nextInt();
	
		while (true) 
			if ( grade1 <= 100 || grade2 <= 100 || grade3 <= 100)
				break;
		else  
				System.out.println("������ 100���Դϴ�. �ٽ� �Է����ּ���");
				System.out.println("������ 100���Դϴ�. �ٽ� �Է����ּ��� \n 1�� �л� ���� �Է����ּ���.");
				 grade1 = s.nextInt();
				System.out.println("2�� �л� ���� �Է����ּ���.");
				 grade2 = s.nextInt();
				System.out.println("3�� �л� ���� �Է����ּ���.");
				 grade3 = s.nextInt();
		
		
		
		
		if (grade1 > grade2 && grade1 > grade3 && grade2 > grade3)
			System.out.println("1���л� 1�� \n 2���л� 2�� \n 3�� �л� 3��");
		else if (grade1 > grade2 && grade2 < grade3 && grade1 > grade3)
			System.out.println("1���л� 1�� \n 2���л� 3�� \n 3�� �л� 2��");
		// 1����
		else if (grade2 > grade1 && grade2 > grade3 && grade1 > grade3)
			System.out.println("1���л� 2�� \n 2���л� 1�� \n 3�� �л� 3��");
		else if (grade2 > grade1 && grade2 > grade3 && grade1 < grade3)
			System.out.println("1���л� 3�� \n 2���л� 1�� \n 3�� �л� 2��");
		//2����
		else if (grade3 > grade1 && grade3 > grade2 && grade2 > grade1)
			System.out.println("1���л� 3�� \n 2���л� 2�� \n 3�� �л� 1��");
		else if (grade3 > grade1 && grade3 > grade2 && grade1 > grade2)
			System.out.println("1���л� 2�� \n 2���л� 3�� \n 3�� �л� 1��");
		//3����
	}
	
}