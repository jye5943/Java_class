import java.util.Scanner;

public class JavaFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentScore1 = sc.nextInt();
		int studentScore2 = sc.nextInt();
		int studentScore3 = sc.nextInt();
		
		//��δ� ������ ���
		if(studentScore1 == studentScore2 && studentScore2 == studentScore3){
			System.out.println("���� �ϵ�");
		}
		
		//������ ��Ȯ�ϰ� �Ű����� ���
		else if(studentScore1 > studentScore2 && studentScore2 > studentScore3){
			System.out.println("ù��°�л� 1��, �ι�°�л� 2��, ����°�л� 3��");
		}
		else if(studentScore2 < studentScore3 && studentScore3 < studentScore1){
			System.out.println("ù��°�л� 1��, �ι�°�л� 3��, ����°�л� 2��");
		}
		else if(studentScore2 < studentScore1 && studentScore1 < studentScore3){
			System.out.println("ù��°�л� 2��, �ι�°�л� 3��, ����°�л� 1��");
		}
		else if(studentScore3 < studentScore1 && studentScore3 < studentScore2){
			System.out.println("ù��°�л� 2��, �ι�°�л� 1��, ����°�л� 3��");
		}
		else if(studentScore1 < studentScore2 && studentScore2 < studentScore3){
			System.out.println("ù��°�л� 3��, �ι�°�л� 2��, ����°�л� 1��");
		}
		else if (studentScore1 < studentScore3 && studentScore3 < studentScore2){
			System.out.println("ù��°�л� 3��, �ι�°�л� 1��, ����°�л� 2��");
		}
		
		//���� 2���ΰ��
		else if (studentScore1 == studentScore2 && studentScore1 < studentScore3){
			System.out.println("ù��° �ι�° �л� ����2�� , ����°�л� 1��");
		}
		else if (studentScore1 == studentScore2 && studentScore1 > studentScore3){
			System.out.println("ù��° �ι��� �л� ���� 1�� , ����°�л� 3��");
		}
		else if (studentScore1 == studentScore3 && studentScore1 < studentScore2){
			System.out.println("ù��° ����° �л� ����2�� , �ι�°�л� 1��");
		}
		else if (studentScore1 == studentScore3 && studentScore1 > studentScore2){
			System.out.println("ù��° ������ �л� ���� 1�� , �ι�°�л� 3��");
		}
		else if (studentScore2 == studentScore3 && studentScore2 < studentScore1){
			System.out.println("�ι�° ����° �л� ����2�� , ù��°�л� 1��");
		}
		else if (studentScore2 == studentScore3 && studentScore3 > studentScore1){
			System.out.println("�ι�° ������ �л� ���� 1�� , ù��°�л� 3��");
		}
	}
}
