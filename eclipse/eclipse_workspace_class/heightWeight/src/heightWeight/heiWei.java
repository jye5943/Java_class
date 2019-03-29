package heightWeight;

import java.util.Scanner;

public class heiWei {
	public double weight; 
	public double height;
	//private Scanner r;
	
	public void inputData() {
		Scanner r = new Scanner(System.in);
		
	 //카우프 지수를 구하는 매소드 적기-괄호안에 int안적어도 됨 왜냐며 사용자에게 입력을 받을거니까
	//public void kaup(int weight, int height) {
		
		//체중 입력 받는 방법은 2가지 (nextint,nextdouble)
		//1)
		System.out.println("체중을 입력하세요(단위 kg) : ");
		this.weight = r.nextDouble();
		
		//2)
//		System.out.println("체중입력(단위 g)" );
//		int weight = scanner.nextInt();
//		double weightKg = (double)weightKg / 1000;
//		
		System.out.println("신장 입력 (단위m) : ");
		
		this.height = r.nextDouble();
	}
	
	public void result () {
		double calResult = (double)this.weight / (this.height * this.height); 
	
//		kaufEnd = weight/height**2;
//	print.out.println(kaufEnd);
		
	if (calResult >30 ) {
		System.out.println("비만");
	}else if (24 <= calResult ) {
		System.out.println("과체중");
	}else if (20 <= calResult ) {
		System.out.println("정상");
	}else if (20 > calResult) {
		System.out.println("저체중");
	}else if (calResult <= 15) {
		System.out.println("여윔");
	}else if (calResult <= 13) {
		System.out.println("영양실조증");
	}else {
		System.out.println("소모증");
		
	}
}
}
