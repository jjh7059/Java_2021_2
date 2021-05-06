package oop;

public class MainArgsApp {
	//main 메소드의 매개변수에는 프로그램 실행시 입력된 문자열들을 전달받아 배열로저장
	//window cmd로 "java 문자열"형태로 실행하면 문자열 갯수가 출력됨
	//eclipse에서는 Run메뉴 > Run Configurations > Program Argument 입력 > Run (사용하고 지워야함)
	public static void main(String[] args) {
		System.out.println("전달된 문자열의 갯수 = " + args.length);
		
		for(int i =0; i < args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}
