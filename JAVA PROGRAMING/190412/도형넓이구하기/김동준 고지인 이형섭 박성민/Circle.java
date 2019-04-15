import java.util.Scanner;

public class Circle extends Figure {
	double pi = Math.PI;
	int r;
	public double area;
	public void inputValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		
		this.r = scan.nextInt();
	}
	public void cal() {
		this.area = this.r * this.r * this.pi;
		System.out.println("원의 넓이는^^? ==> " + this.area);
		
	}
}
