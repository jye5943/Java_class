import java.util.Scanner;

public class ���ظ� {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.print("��������1�� �Է����ּ���:");
    int kor1 = s.nextInt();
    System.out.print("��������2�� �Է����ּ���:");
    int kor2 = s.nextInt();
    System.out.print("��������3�� �Է����ּ���:");
    int kor3 = s.nextInt();
    
    
    if (kor1>=kor2 && kor1>=kor3 && kor2>=kor3) {
    System.out.println(kor1);
    System.out.println(kor2);
    System.out.println(kor3);
} else if (kor1>=kor2 && kor1>=kor3 && kor3>=kor2) {
    System.out.println(kor1);
    System.out.println(kor3);
    System.out.println(kor2);	
 }else if (kor2>=kor1 && kor2>=kor3 && kor1>=kor3) {
    System.out.println(kor2);
    System.out.println(kor1);
    System.out.println(kor3);	
}else if (kor2>=kor1 && kor2>=kor3 && kor3>=kor1) {
    System.out.println(kor2);
    System.out.println(kor3);
    System.out.println(kor1);	
}else if (kor3>=kor1 && kor3>=kor2 && kor1>=kor2) {
    System.out.println(kor3);
    System.out.println(kor1);
    System.out.println(kor2);	
}else if (kor3>=kor1 && kor3>=kor2 && kor2>=kor1) {
    System.out.println(kor3);
    System.out.println(kor2);
    System.out.println(kor1);
}
}
}