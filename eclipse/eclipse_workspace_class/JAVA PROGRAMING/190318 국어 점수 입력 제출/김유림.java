//������ ��� �����
import java.util.Random;

public class Test_score {
	public static void main(String[] args) {
		int yoorim;
		int nahyun;
		int hanbin;

		Random scoreYoorim = new Random();
		yoorim = scoreYoorim.nextInt(101);

		Random scoreNahyun = new Random();
		nahyun = scoreNahyun.nextInt(101);

		Random scoreHanbin = new Random();
		hanbin = scoreHanbin.nextInt(101);

		if (((hanbin > nahyun) && (hanbin > yoorim)) && ((nahyun > yoorim))) {
			System.out.println("�ϵ� : hanbin. ������ : " + hanbin);
			System.out.println("�̵� : nahyun. ������ : " + nahyun);
			System.out.println("��� : yoorim. ������ : " + yoorim);

		} else if (((hanbin > nahyun) && (hanbin > yoorim)) && ((yoorim > nahyun))) {
			System.out.println("�ϵ� : hanbin. ������ : " + hanbin);
			System.out.println("�̵� : yoorim. ������ : " + yoorim);
			System.out.println("��� : nahyun. ������ : " + nahyun);
			
		} else if (((nahyun > hanbin) && (nahyun > yoorim)) && ((hanbin > yoorim))) {
			System.out.println("�ϵ� : nahyun. ������ : " + nahyun);
			System.out.println("�̵� : hanbin. ������ : " + hanbin);
			System.out.println("��� : yoorim. ������ : " + yoorim);
		
		} else if (((nahyun > hanbin) && (nahyun > yoorim)) && ((yoorim > hanbin))) {
			System.out.println("�ϵ� : nahyun. ������ : " + nahyun);
			System.out.println("�̵� : yoorim. ������ : " + yoorim);
			System.out.println("��� : hanbin. ������ : " + hanbin);
			
		} else if (((yoorim > hanbin) && (yoorim > nahyun)) && ((nahyun > hanbin))) {
			System.out.println("�ϵ� : yoorim. ������ : " + yoorim);
			System.out.println("�̵� : nahyun. ������ : " + nahyun);
			System.out.println("��� : hanbin. ������ : " + hanbin);
			} else if (((yoorim > hanbin) && (yoorim > nahyun)) && ((hanbin > nahyun))) {
				System.out.println("�ϵ� : yoorim. ������ : " + yoorim);
				System.out.println("�̵� : hanbin. ������ : " + hanbin);
				System.out.println("��� : nahyun. ������ : " + nahyun);
		}
/*if ((yoorim == hanbin){
System.out.println("hanbin�� yoorim�� ���� �̵��Դϴ�.");
}
		|| (yoorim == nahyun) || (hanbin == nahyun)){
	System.out.println("�����Դϴ�.");*/
	
}
		
		
	}

