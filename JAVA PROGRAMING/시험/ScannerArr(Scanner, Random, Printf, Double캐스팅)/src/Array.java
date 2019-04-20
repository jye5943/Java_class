import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		// 10명의 점수를 랜덤으로 입력받아 배열로 넣어주세요.
	Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int student[] = new int[10];
		

//	student []= {정예은, 정예은 , 정예은 , 정예은, 정예은};? // 이름 정해주고 싶으면?
//		
//		for (int i = 0; i < student.length; i++) {
//			System.out.println(i+1+"번째 학생의 이릅을 입력하세요.");
//			int inputNumber = rand.nextInt(101);
//			student[i] = inputNumber;
//			String name = scan.nextLine();
//			System.out.println(name+ "학생의 점수는" + student[i] + "점 입니다.");
//		}
		
	//10명의 학생의 점수를 입력받아 배열로 넣고, 마지막에 배열로 쭉 정리해준 다음 ,총점과 평균을 구하시오.
		
		int arr [] = new int [10];
		int i;
		int sum=0;
		
		for(i=0; i<10; i++) {
			System.out.println(i+1+"번 째 학생의 점수를 입력하세요. :");
			int studentScore = scan.nextInt();
			arr[i]= studentScore;
			sum = sum + arr[i];
		}System.out.println(Arrays.toString(arr));
		
		//총점
		System.out.println("총점은 :" + sum);
		//평균
		double avg= (double)sum/arr.length;
		System.out.println(avg);
		System.out.printf("평균은 : %2.2f",avg);
		
	}
}
