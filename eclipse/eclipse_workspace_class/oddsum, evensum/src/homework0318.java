
public class homework0318 {
	public static void main(String[] args) {
//홀수의 합
		int holSum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				holSum = holSum + i;
			}
		}
		System.out.println("홀수의 합은 :" + (holSum));
//짝수의 합
		int zakSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				zakSum = zakSum + i;
	}
}
System.out.println("짝수의 합은 :" + (zakSum));

}

}

