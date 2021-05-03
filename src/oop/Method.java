package oop;

//참조가 목적인 클래스 - 인스턴스(객체) 생성을 위한 클래스
public class Method {
	//클래스를 선언하면 클래스 내부에 매개변수가 없는 생성자(Constructor)가 
	//자동으로 선언된 것으로 처리(실제로는 보이지 않음)
	
	//메소드 선언
	void displayOne() {
		System.out.println("Method 클래스의 displayOne() 메소드 호출");
	}
	
	void displayTwo() {
		System.out.println("Method 클래스의 displayTwo() 메소드 호출");
	}
	
	void printOne() {
		int tot = 0;
		for(int i = 1; i <= 100; i++) {
			tot += i;
		}
		System.out.println("1~100 번위의 정수들의 합계 = " + tot);
	}
	
	//메소드 호출시 전달값이 매개변수에 저장되어 메소드에서 사용 가능
	void printTwo(int num) {
		int tot = 0;
		for(int i = 1; i <= num; i++) {
			tot += i;
		}
		System.out.println("1~" + num + "번위의 정수들의 합계 = " + tot);
	}
	
	
}
