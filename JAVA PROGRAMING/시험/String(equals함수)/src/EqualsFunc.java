import java.util.Scanner;

public class EqualsFunc {

	public static void main(String[] args) {
		//.equals 함수는 string이 같은지 다른지 비교해주는 것
		
		//스캔 받은 문자와 a,b의 문자열을 비교해주는 프로그램
		Scanner scanner = new Scanner(System.in);
		String a ="안녕";
		String b ="안녕";
		String c= scanner.nextLine();
		System.out.println(a.equals(b)); //a와 b문자열 비교
		//System.out.println(a==b);와 같은 의미
		System.out.println(a.equals(c));
	
		
	}
}
