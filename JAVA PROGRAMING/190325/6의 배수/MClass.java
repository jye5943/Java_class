//1부터 100까지 6의 배수 구하기
public class MClass {
	public static void main(String[] args) {
		Check1 c1 = new Check1();
		System.out.println("6의 배수는");
		
		for (int i = 0; i < 100; i++) {
			int checkNumber = i + 1; //1부터 100까지 숫자를 반복할 때
			
			boolean result = c1.doCheck(checkNumber);
			if (result) {
				System.out.print("  " + (checkNumber));
			}
		}
	}
}
