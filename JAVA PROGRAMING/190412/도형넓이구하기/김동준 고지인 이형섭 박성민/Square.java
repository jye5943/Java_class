import java.util.Scanner;

public class Square extends Figure {
	int low = 0;
	int hight = 0;
	@Override
	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사각형의 밑변값을 입력해주세요 : ");
		this.low = scanner.nextInt();
		
		System.out.println("사각형의 높이값을 입력해주세요 : ");
		this.hight = scanner.nextInt();
	}
	public void cal() {
		double SquareWide = 0;
		SquareWide = (double) this.low * this.hight;
		System.out.println("사각형의 넓이는 " + SquareWide + " 입니다.");
	}

}
