import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어떤 도형의 넓이를  구할래?\n(괄호안의 숫자를 입력해주세요)\n<0>사각형  <1>삼각형  <2>사다리꼴  <3>원  <4>오각형  <5>육각형");
		int selectNum;
		try {
			selectNum = sc.nextInt(6);
			if(selectNum == 0) {
				Square f0 = new Square();
				f0.inputValue();
				f0.cal();
				
			}else if(selectNum == 1) {
				Triangle f1 = new Triangle();
				f1.inputValue();
				f1.cal();
				
			}else if(selectNum == 2) {
				Trapezoid f2 = new Trapezoid();
				f2.inputValue();
				f2.cal();
				
			}else if(selectNum == 3) {
				Circle f3 = new Circle();
				f3.inputValue();
				f3.cal();
				
			}else if(selectNum == 4) {
				RegularPentagon f4 = new RegularPentagon();
				f4.inputValue();
				f4.cal(); 
				
			}else if(selectNum == 5) {
				RegularHexagon f5 = new RegularHexagon();
				f5.inputValue();
				f5.cal();
			}
		} catch (Exception e) {
			System.out.println("ㅗ^^ㅗ");
		}
	}
}
