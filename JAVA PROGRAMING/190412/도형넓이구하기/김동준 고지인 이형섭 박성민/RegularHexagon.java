import java.util.Scanner;

public class RegularHexagon {
	Scanner scanner = new Scanner(System.in);
	private double valueSide;
	public double area;

	public void inputValue() {
		valueSide = tryCatchScanner("한 변의 길이를 입력하세요.");
	}
	
	public void cal() {
		this.area = (3 * Math.sqrt(3) * Math.pow(valueSide, 2)) / 2;
		System.out.println("정육각형의 넓이는 ? " + this.area + "입니다.");
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
