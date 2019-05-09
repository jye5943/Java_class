import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		
		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		Random2 rand1 = new Random2();
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "踰� �븰�깮";
//			student[i].kor = rand.nextInt(101);
//			student[i].eng = rand.nextInt(101);
//			student[i].math = rand.nextInt(101);
			student[i] = rand1.randomStudent(student[i]); //�븵�뿉 student[i]=�� �븞�뜥以섎룄 �맖
			}
		
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i].total < student[j].total) {
					Student tmp = student[i]; 	//소트 정렬
					student[i] = student[j];
					student[j] = tmp;
					
				}
			}
		}
		Arrays.sort(student);
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
		
		
	}
}
