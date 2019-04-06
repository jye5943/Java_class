import java.util.Random;

public class playo {
	String name ;
	int hp = 0;

//이름과 hp 지정
	playo(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
//현재 남은 피
	public boolean status() {
		if (hp > 0) { 
			return true;
		}return false;
	}
//공격을 받았을 때 
	public void attacked () {
		Random random = new Random();
		int hit = random.nextInt(10);
		if (hit == 2 ) {
			this.hp = this.hp - 10; 
			System.out.println(this.name +" 가 10의 데미지를 얻었습니다.");
		}else {
			System.out.println(this.name +" 가 회피했습니다!");
		}
		
		
		
	}
	
	
	
	
	
}
