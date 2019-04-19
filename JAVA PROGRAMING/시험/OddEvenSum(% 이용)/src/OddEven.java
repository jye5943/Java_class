
public class OddEven {
public static void main(String[] args) {
	
	int even =0; 
	int odd =0;
	int sum =0;
	//1부터 100까지 홀수의 합 구하기 , 짝수의 합 구하기, 총 합 구하기
	
	//1부터 100까지의 합
	for(int i=0; i<=100; i++) {
		sum = sum +i;
		}System.out.println(sum);
	
	//홀수의 합
	for(int i=1; i<=100; i=i+2) {
		odd = odd + i;
	}System.out.println(odd);
	
	//짝수의 합
	for(int i=0; i<=100; i=i+2) {
		even = even +i;
	}System.out.println(even);
	
	
	int even2 =0;
	int odd2 =0;
	
	//if문 이용하기
	
	//홀수의 합
	for(int i =0; i<100; i++) {
		if(i%2 ==1) {
			odd2 = odd2+i;
		}
	}System.out.println(odd2);
	
	//짝수의 합
	for(int i=0; i<=100; i++) {
		if(i%2 ==0){
			even2 =even2 +i;
			}
		
		}System.out.println(even2);
	
	}
}