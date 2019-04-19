import java.util.Random;
import java.util.Scanner;

public class Dice {

//방법 1) 
//	랜덤으로 주사위를 굴린다음 컴터랑 비교!
//멀쩡하게 동작을 하는지 테스트를 해본 수에 반복되는 걸 for문으로 만듦 -> for문에서 빠져나갈 때 break 를 만듦 ->중요한 포인드
	public static void main(String[] args) {
		int userDice = 0;
		int comDice = 0;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
	//컴퓨터용	
		while (true) {
			
			System.out.println("컴퓨터의 주사위를 굴릴까요? 엔터를 눌러주세요.");
			scan.nextLine();
			comDice = rand.nextInt(6)+1;
			System.out.println("컴퓨터의 주사위는" + comDice + "입니다.");
			System.out.println();
	//사용자용
			System.out.println("사용자의 주사위를 굴릴까요? 엔터를 눌러주세요.");
			scan.nextLine();
			userDice = rand.nextInt(6)+1;
			System.out.println("사용자의 주사위는" + userDice + "입니다.");
			System.out.println();
	//결과값 출력		
			if(comDice > userDice) {
				System.out.println("당신은 졌습니다.");
			}else if (comDice == userDice) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("당신은 이겼습니다.");
				System.out.println();
			}
			
		}
			
	}

}
