package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		//논리형, 자료형을 쓰지 않아도 변수 사용가능! 자료형을 추정해서 출력한다.
	}

}
