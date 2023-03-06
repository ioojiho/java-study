package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte bnum = -128; // +128: 오류남 (-128~+127)
		System.out.println(bnum);
		
		//int num = 12345678900; : 오류
		long lNum = 12345678900L; // 대문자L 붙여야함
		System.out.println(lNum);
	
	}

}
