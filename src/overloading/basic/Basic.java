package overloading.basic;

public class Basic {

	
	
	/*
	 * 오버로딩 - 같은 이름의 메서드 , 생성자를 여러개 만드는 것
	 * 
	 * 규칙
	 * 1. 이름이 똑같음
	 * 2. 반환유형은 상관이 없음
	 * 3. 매개변수의 타입, 종류, 개수 등이 다르면 됩니다.(완전히 동일하지 않으면 됩니다.)
	 */

	
	void input(int a) {
		System.out.println("정수 1개 받음");
	}
	
//	int input(int b) {  반환유형은 다르지만 매개변수 타입 개수 가 같다?
//		
//	}
	
	void input(String a) {   				//오버로딩 됨
		System.out.println("문자열 1개 받음");
	}
	
	void input(double a , int b) {			//
		System.out.println("정수와 실수 1개 받음");
	}
	
	void input(int a,double b) {
		System.out.println("실수와 정수 1개 받음");
	}
	
	void input(String a, String b) {
		System.out.println("문자열 2개 받음");
	}
	
	void input(char a, String b, double c) {
		System.out.println("문자,문자열, 실수1개 받음");
	}
	
	
}
