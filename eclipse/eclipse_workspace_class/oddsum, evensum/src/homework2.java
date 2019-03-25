
public class homework2 {
public static void main(String[] args) {


//// 교수님 답변
//// 총합
//	int total = 0;
//	
//	for (int i = 0; i < 100; i++) {
//		int number = i + 1;
//		total = total + number ;
//		
//} 
//      System.out.println("총합은 " + total);
//      
//}
//}
	
// 홀수합  & 짝수합
int total = 0;
int evenTotal = 0;
int oddTotal = 0;
//변수를 만들 때 초기화 시켜줘야 함!

for (int i = 0; i < 100; i++) {
	int number = i + 1;
	total = total + number ;
	
	if ( number %2 == 0) {
		evenTotal = evenTotal + number;
	} else {
		oddTotal = oddTotal + number; 
	
} 
	  System.out.println("총합은 " + total);
	  System.out.println("홀수 총합은 " + evenTotal);
	  System.out.println("짝수 총합은 " + oddTotal);
}}}