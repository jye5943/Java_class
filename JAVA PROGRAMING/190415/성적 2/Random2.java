import java.util.Random;

public class Random2 extends Random {
	public Student randomStudent(Student target) { //public + ___ 부분은 return값의 자료형이랑 같아야함
		target.kor = super.nextInt(101); //super로 해야되는데 재정의를 안했으니까 this로 해도 인식을 함
		target.eng = this.nextInt(101);
		target.math= this.nextInt(101);
		return target;
	}
}
