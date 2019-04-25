
public class M1 {
	public static void main(String[] args) {
		PrimeNumber p1 = new PrimeNumber();
		for (int i = 0; i < 100; i++) { //0부터 99까지 반복
			p1.doCheck(i + 1); //1부터 100의 소수 여부를 검사함
		}
	}
}
