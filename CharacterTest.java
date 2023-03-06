package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //숫자로출력
		System.out.println((int)ch1); //문자로출력
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2); 
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3); //67의 아스키값에 해당되는 'C' 출력
		
		char han = '한';
		System.out.println(han);
		//char ch = -66; 음수는 불가능!
		//char 1234567; 2byte에서 핸들링할 수 없는 숫자 오류
		
	}

}
