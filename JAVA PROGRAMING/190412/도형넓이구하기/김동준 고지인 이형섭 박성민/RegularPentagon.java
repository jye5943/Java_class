import java.util.Scanner;

public class RegularPentagon {
	Scanner scanner = new Scanner(System.in);
	private double valueSide;
	public double area;
	public void inputValue() {
		valueSide = tryCatchScanner("한 변의 길이를 입력하세요.");
	}
	
	public void cal() {
		this.area = (Math.sqrt(25 + (10 * Math.sqrt(5))) / 4) * Math.pow(this.valueSide, 2);
		System.out.println("정오각형의 넓이는 ? " + this.area + "입니다.");
	}

	private double tryCatchScanner(String outputMessage) {
		double inputValue;
		System.out.println(outputMessage);
		while (true) {
			try {
				inputValue = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
		return inputValue;
	}
}
