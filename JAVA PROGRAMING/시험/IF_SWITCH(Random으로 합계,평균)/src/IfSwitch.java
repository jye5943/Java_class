import java.util.Random;

public class IfSwitch {
public static void main(String[] args) {
	Random rand = new Random();
	//�������� 1-100�� ���� �ΰ� �޾Ƽ� ����̶� ���� ����
	int randomNumber = rand.nextInt(101);
	int randomNumber2 = rand.nextInt(101);
	System.out.println("ù��° ���ڴ� :"+randomNumber);
	System.out.println("�ι�° ���ڴ�:"+randomNumber2);
	int total = randomNumber + randomNumber2; 
	System.out.println("�� ������ ���� :"+total);
	double average = (double) total/2;
	System.out.println("�� ������ ����� "+average);

	}
}
