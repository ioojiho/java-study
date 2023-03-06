package ch07;

public class DoubleTest {
	
	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14f; 
		//f 식별자를 추가하지 않으면 오류가 난다! (기본적으로 double 8byte짜리에 저장되기 때문)
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum2 = 1;
		for(int i = 0; i<10000; i++) {
			dnum2 = dnum2 + 0.1;
		}
		System.out.println(dnum2);
		//출력결과가 1001이 될거라 예상했으나 더미로 나타났다
	}

}
