
public class Student implements Comparable<Student>{
	String name; //부모타입의 이 여러 개의 파라미터 받으려면
	// 배열을 만들어서 선언하면 다 넣을 수 있다. 성적표 넣는 것처럼
	int kor;
	int eng;
	int math;
	int total;

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	
//	@Override  //array의 메소드 실행
//	public String toString() { //생성자는 default값 . 그리고 
//		String tmp = String.format("%03d", this.total); //여기서 tmp는 변수
//		return tmp; // 프린트 할때 실행되는 메소드 오버라이드
//	
//	} => 잘 안됨
	
	//implements Comparable의 형식에 맞추기 위한 메소드 
	public int compareTo(Student o) {
		if (this.total > o.total) {
			return -1;
		}else if (this.total < o.total) {
			return 1; 
		}
		return 0;
	}
}