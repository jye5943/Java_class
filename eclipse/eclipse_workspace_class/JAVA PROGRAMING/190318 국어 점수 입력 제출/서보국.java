import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("A�� ������ �Է��ϼ���");
		Scanner p1 = new Scanner(System.in);
		int scoreA = p1.nextInt();		
		System.out.println("B�� ������ �Է��ϼ���");
		int scoreB = p1.nextInt();	
		System.out.println("C�� ������ �Է��ϼ���");
		int scoreC = p1.nextInt();	
		System.out.println("������ ǥ���մϴ�");
		
		
		if (scoreA >= scoreB && scoreB >= scoreC) {
		System.out.print("A:" + scoreA + " ");
		System.out.print("B:" + scoreB + " ");
		System.out.print("C:" + scoreC + " ");
		
		} else if (scoreA >= scoreC && scoreC >= scoreB) {
		System.out.print("A:" + scoreA + " ");
		System.out.print("C:" + scoreC + " ");
		System.out.print("B:" + scoreB + " ");
		
		} else if (scoreB >= scoreA && scoreA >= scoreC) {
		System.out.print("B:" + scoreB + " ");
		System.out.print("A:" + scoreA + " ");
		System.out.print("C:" + scoreC + " ");
		
		} else if (scoreB >= scoreC && scoreC >= scoreA) {
		System.out.print("B:" + scoreB + " ");
		System.out.print("C:" + scoreC + " ");
		System.out.print("A:" + scoreA + " ");
		
		} else if (scoreC >= scoreA && scoreA >= scoreB) {
		System.out.print("C:" + scoreC + " ");
		System.out.print("A:" + scoreA + " ");
		System.out.print("B:" + scoreB + " ");
		
		} else if (scoreC >= scoreB && scoreB >= scoreA) {
		System.out.print("C:" + scoreC + " ");
		System.out.print("B:" + scoreB + " ");
		System.out.print("A:" + scoreA + " ");
		}
	}
}