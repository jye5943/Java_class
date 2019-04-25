//1부터 100까지의 합을 구하는 공식 (class기반)
public class Summation {
	public void Sum(int input) {
		int sum=0 ;
		for(int i =0; i<input; i++) {
			sum = sum+ i+1;
		}System.out.println("1부터 100까지의 합은 : " + sum);
	}
}
