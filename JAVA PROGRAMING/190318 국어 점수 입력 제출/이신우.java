import java.util.Scanner;

public class �̽ſ� {
	
	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		int ��������A;
		int ��������B;
		int ��������C;
		
//		��������A = A.nextInt();
//		��������B = A.nextInt();
//		��������C = A.nextInt();
		
		System.out.println("ù ��° ������ �Է��ϼ���.");
		��������A = A.nextInt();
		System.out.println("ù��° ������ "+ ��������A+" �Դϴ�.");
		System.out.println("�� ��° ������ �Է��ϼ���.");
		��������B = A.nextInt();
		System.out.println("ù��° ������ "+ ��������B+" �Դϴ�.");
		System.out.println("�� ��° ������ �Է��ϼ���.");
		��������C = A.nextInt();
		System.out.println("ù��° ������ "+ ��������C+" �Դϴ�.");
		
		if(��������A > ��������B && ��������A > ��������C && ��������B > ��������C) {    // A > B > C
			
			System.out.println("1���� : A \n2���� : B \n3���� : C");
			
		}else if(��������A > ��������B && ��������A > ��������C && ��������B < ��������C){   // A > C > B
			
			System.out.println("1���� : A \n2���� : C \n3���� : B");
			
		}else if(��������B > ��������A && ��������B > ��������C && ��������A < ��������C) {  // B > C > A
			
			System.out.println("1���� : B \n2���� : C \n3���� : A");
			
		}else if(��������B > ��������A && ��������B > ��������C && ��������A > ��������C) {  // B > A > C
			
			System.out.println("1���� : B \n2���� : A \n3���� : C");
			
		}else if(��������C > ��������A && ��������C > ��������B && ��������A > ��������B) {  // C > A > B
			
			System.out.println("1���� : C \n2���� : A \n3���� : B");
			
		}else if(��������C > ��������A && ��������C > ��������B && ��������A < ��������B) {  // C > B > A
			
			System.out.println("1���� : C \n2���� : B \n3���� : A");
			
		}else if(��������A == ��������B && ��������A < ��������C && ��������B < ��������C) {    // A == B < C
			
			System.out.println("1���� : C \n 2����: A�� B ( �����Դϴ� ) ");
			
		}else if(��������A == ��������B && ��������A > ��������C && ��������B > ��������C) {    // A == B > C
			
			System.out.println("1���� : A�� B ( �����Դϴ� ) \n 2����: C  ");
			
		}else if(��������B == ��������C && ��������A > ��������C && ��������A > ��������B) {    // B == C < A
			
			System.out.println("1���� : A \n 2����: B�� C ( �����Դϴ� )");
			
		}else if(��������B == ��������C && ��������A < ��������C && ��������A < ��������B) {    // B == C > A
			
			System.out.println("1���� : B�� C ( �����Դϴ� ) \n2���� : A ");
			
		}else if(��������A == ��������C && ��������A < ��������B && ��������C < ��������B) {    // A == C < B
			
			System.out.println("1���� : B \n 2���� : A�� C ( �����Դϴ� )");
			
		}else if(��������A == ��������C && ��������A > ��������B && ��������C > ��������B) {    // A == C > B
			
			System.out.println("1���� : A�� C ( �����Դϴ� ) \n 2���� : B");
			
		}
		
		else{
			
			System.out.println("A B C ��� ������ �����ϴ�.");    // A == B == C
			
		}
		
	}

}
