import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0; 
		int N= scan.nextInt();
		int	num = N/5;
		int num2 =N/3;
		for( int i=0; i<=num;i++){
			for(int j=0;j<=num2;j++) {
				if(N>5 & N==5*i+3*j) {
					sum =i+j;
				}else if(N==3 | N==5) {
					sum = 1;
				}else if(N<=5 & num2!=0) {
					sum = -1;
				}
				
			}
		}System.out.println(sum);
	}
}
