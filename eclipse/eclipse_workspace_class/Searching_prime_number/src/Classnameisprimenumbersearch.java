import java.util.Scanner;

public class Classnameisprimenumbersearch {
public void Searching() {
	Scanner r = new Scanner(System.in);
	
	System.out.println("Input_your_number ");	
	int inputNumber = r.nextInt();
	
	boolean isPrimeNumber = true; 
	for (int i =2; i < inputNumber // /2;�� �� ����?������ 2�� �������� �Ҽ��� �ƴϴϱ� ; i++) { 
		if (inputNumber % i == 0) {
			isPrimeNumber = false; 
			break;
		}
	}
	
		if (isPrimeNumber) {
			System.out.println("�Ҽ��Դϴ�. ");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�. ");
		}
	

}

}
