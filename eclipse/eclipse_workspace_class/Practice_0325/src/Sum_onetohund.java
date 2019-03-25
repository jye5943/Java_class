
public class Sum_onetohund {
public void Sum_start (int startNumber, int endNumber) { 
	int startNum = startNumber;
	int endNum = endNumber;
	int allSum = 0 ; 
	
	for (int i= startNum; i <= endNum ; i++) { 
		allSum = allSum + i;
	}
	System.out.println("시작값은 : " + startNum);
	System.out.println("종료값은 : " + endNum);
	System.out.println("총 합 : " + allSum);	
}


	
}



