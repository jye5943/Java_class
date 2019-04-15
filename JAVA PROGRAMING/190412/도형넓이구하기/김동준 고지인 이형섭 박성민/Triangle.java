import java.util.Scanner;

public class Triangle extends Figure {
	int lowerBase;
	int height;
	double area;
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변의 길이를 입력해 주세요 : ");
		this.lowerBase = sc.nextInt();
		
		System.out.println("삼각형의 높이를 입력해 주세요 : ");
		this.height = sc.nextInt();
	}
	
	public void cal() {
		this.area = (double)(this.height*this.lowerBase)/2;
		System.out.println("삼각형의 넓이는^^? ==> " + this.area);
	}
}
