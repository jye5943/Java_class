import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
		System.out.println("���������� �Է��� �ּ���.");
		int aNumber = s.nextInt();
		System.out.println("���������� �Է��� �ּ���.");
		int bNumber = s.nextInt();
		System.out.println("���������� �Է��� �ּ���.");
		int cNumber = s.nextInt();
	
	if (aNumber > bNumber && aNumber > cNumber) {
		System.out.println("1��");
	} else if (bNumber > aNumber && bNumber > cNumber) {
		System.out.println("1��"); 
	} else if (cNumber > aNumber && cNumber > bNumber) {
		System.out.println("1��"); 
	} else if (bNumber > cNumber && aNumber > bNumber ) {
		System.out.println("2��");
	} else if (bNumber > cNumber && aNumber > bNumber ) {
		System.out.println("2��");
	} else if (cNumber > aNumber && bNumber > cNumber ) {
		System.out.println("2��");
	} else if (aNumber < cNumber && aNumber < bNumber ) {
		System.out.println("3��");
	} else if (bNumber < cNumber && aNumber > bNumber ) {
		System.out.println("3��");
	} else if (aNumber > cNumber && cNumber < bNumber ) {
		System.out.println("3��");	
	}
	}
}

