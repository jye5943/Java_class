
public class makeSum {
	
	
	public void makeSum(int startValue, int endValue) {
		int start = startValue;
		int end = endValue;
		int sum = 0;
		
		for(int i =start; i <= end; i++) {
			sum =sum + i;
		}
		System.out.println("���۰�: " + start);
		System.out.println("���ᰪ: " + start);
		System.out.println("�� ��: " + start);
	}
	public static void main(String[] args) {
		SumMachine m = new SumMachine();
		m.makeSum(1,100);
		m.makeSum(20,200);
		m.makeSum(30,300);
		
	
	}
	
}
