package oop;

public class OverloadApp {
	public static void main(String[] args) {
		Overload overload = new Overload();
		
		overload.displayInt(100);
		overload.displayBoolean(false);
		overload.displayString("홍길동");
		System.out.println("=========================================================");
		
		//메소드 오버로드에 의한 다형성
		//다형성(Polymorphism) : 같은 이름의 메소드를 호출해도 상태에 따라 메소드를
		//선택하여 호출하는 기능 - 메소드 오버로드, 메소드 오버라이드
		overload.display(100);
		overload.display(false);
		overload.display("홍길동");
		System.out.println("=========================================================");
	}
}
