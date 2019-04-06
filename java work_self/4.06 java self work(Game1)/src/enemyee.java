import java.util.Random;

public class enemyee {
	String name;
	int hp = 0; 
	
//이름과 hp지정
	enemyee(String name, int hp){
		name = this.name;
		hp = this.hp ;

	}
//현재 남은 피 
	public boolean status() {
		if(this.hp > 0) {
			return true; 
		}return false;
	}
	
//공격을 받을 때
	public void attacked(){
		Random random = new Random();
		int hit = random.nextInt(5);
		
		if (hit == 2) {
			System.out.println(name + "10의 공격을 받았습니다.");
			this.hp = this.hp - 10 ;		
		}else {
			System.out.println(name + "(이)가 회피했습니다.");
		}
	}
	
	
	
	
	
	
	
	
}
