import java.util.Scanner;

public class quadrangle extends Figure {
	int width = 0;
	int height = 0;
	int printSum = 0;
	
	@Override
	public void inputValue () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���̸� �Է��ϼ���");
		this.width = scanner.nextInt();
		System.out.println("���� ���̸� �Է��ϼ���");
		this.height = scanner.nextInt();
	}

	public void printResult() {
		this.printSum = this.width*this.height;
		System.out.println("�簢���� ����: " + width*width);

 }
 
}
