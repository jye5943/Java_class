import java.util.Scanner;

public class ts318 {
		
	public static void main(String[] args) {
			int score1 = 98;
			int score2 = 86;
			int score3 = 78;
			// �л�1�� ���������� score1
			// �л�2�� ���������� score2
			// �л�3�� ���������� score3
			
			Scanner s = new Scanner(System.in);
			
			score1 = s.nextInt();
			score2 = s.nextInt();
			score3 = s.nextInt();
			
			if (score1 >= 95 && score1 <= 100) {
				System.out.println("�л�1�� 1���Դϴ�.");
			} else if (score2 >= 85 && score2 <= 90) {
				System.out.println("�л�2�� 2���Դϴ�.");
			} else if (score3 >= 75 && score3 <= 80) {	
				System.out.println("�л�3�� 3���Դϴ�.");
			}
	}
}