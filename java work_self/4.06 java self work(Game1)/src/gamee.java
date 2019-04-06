import java.util.Scanner;

public class gamee {
public static void main(String[] args) {
	
	playo p = new playo ("playo 1",100);
	enemyee[] e = new enemyee[2];
	e[0] = new enemyee("자바", 100);
	e[1] = new enemyee("자동차", 10);
	
	Scanner s = new Scanner(System.in);
	System.out.println("턴 진행은 엔터를 클릭하세요.");
	for(int i = 0; i < 100000; i++) {
		s.nextLine();
	
	for(int j = 0; j < e.length; j ++) {
//if 조건문의 결과는 true/ false 이면 된다. -> ememyee[j].status()만 들어가는 이유		
		if(e[j].status()) {
			e[j].attacked(); 
		}
	}
		boolean almostWin = false;
		
		for(int j = 0; j < e.length; j++) {
			if(e[j].status()) {
				almostWin =true;
			}
		}
//!가 들어가면 조건이 false일때 실행
		if(!almostWin) {
			System.out.println("적이 전멸했습니다. 플레이어의 승리입니다.");
			break;
		}
		
		p.attacked();
		if (p.status()) {
		} else {
			System.out.println("당신은 졌습니다.");
		}
	}
	
	
}
}
