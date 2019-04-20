import java.util.Random;

public class IfSwitch {
public static void main(String[] args) {
	Random rand = new Random();
	//랜덤으로 1-100중 숫자 두개 받아서 평균이랑 총점 내기
	int randomNumber = rand.nextInt(101);
	int randomNumber2 = rand.nextInt(101);
	System.out.println("첫번째 숫자는 :"+randomNumber);
	System.out.println("두번째 숫자는:"+randomNumber2);
	int total = randomNumber + randomNumber2; 
	System.out.println("두 숫자의 합은 :"+total);
	double average = (double) total/2;
	System.out.println("두 숫자의 평균은 "+average);

	}
}
