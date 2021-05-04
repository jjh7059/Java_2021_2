package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("정수값 = " + param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("논리값 = " + param);
	}
	
	public void displayString(String param) {
		System.out.println("문자열 = " + param);
	}
	
	
	//메소드 오버로드(Method Overload) 선언 : 동일한 기능을 제공하는 메소드가 매개변수에
	//의해 여러 개 선언해야 될 경우 메소드명을 같게 선언하는 방법
	//클래스에서 메소드 파라미터 갯수, 자료형등을 다르게 선언
	public void display(int param) {
		System.out.println("정수값 = " + param);
	}
	
	public void display(boolean param) {
		System.out.println("논리값 = " + param);
	}
	
	public void display(String param) {
		System.out.println("문자열 = " + param);
	}
}
