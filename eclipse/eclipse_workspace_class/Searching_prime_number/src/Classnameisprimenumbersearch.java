import java.util.Scanner;

public class Classnameisprimenumbersearch {
public void Searching() {
	Scanner r = new Scanner(System.in);
	
	System.out.println("Input_your_number ");	
	int inputNumber = r.nextInt();
	
	boolean isPrimeNumber = true; 
	for (int i =2; i < inputNumber // /2;가 왜 들어갈까?어차피 2로 나뉘지면 소수가 아니니까 ; i++) { 
		if (inputNumber % i == 0) {
			isPrimeNumber = false; 
			break;
		}
	}
	
		if (isPrimeNumber) {
			System.out.println("소수입니다. ");
		} else {
			System.out.println("소수가 아닙니다. ");
		}
	

}

}
