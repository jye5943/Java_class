import java.util.Random;

public class ������ {
public static void main(String[] args) {
	Random randomNumber = new Random();
	int a1 = randomNumber.nextInt(100);
	int b1 = randomNumber.nextInt(100);
	int c1 = randomNumber.nextInt(100);
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(c1);
	System.out.println("������");
	
	if ((a1>=b1) && (b1>=c1)) {
		System.out.println("1��a1 2��b1 3��c1");
	}else if ((a1>=c1) && (c1>=b1)) {
			System.out.println("1��a1 2��c1 3��b1");
	}else if ((b1>=a1) && (a1>=c1)) {
		System.out.println("1�� b1 2��a1 3��c1");
	}else if ((b1>=c1) && (c1>=a1)) {
		System.out.println("1��b1 2��c1 3��a1");
	}else if ((c1>=a1) && (a1>=b1)) {
		System.out.println("1��c1 2��a1 3��b1");
	}else if ((c1>=b1) && (b1>=a1)) {
		System.out.println("1��c1 2��b1 3��a1");
	}
}
}
