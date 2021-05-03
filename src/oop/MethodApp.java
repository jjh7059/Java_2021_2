package oop;

//실행이 목적인 클래스 - 프로그램 : 어플리케이션(Application)
//데스크탑 어플리케이션은 반드시 main() 메소드 선언
public class MethodApp {
	//JVM에 의해 자동 호출되는 메소드
	public static void main(String[] args) {  //반환형 : void, 파라미터 : 문자열 배열
		
		//객체(인스턴스-Instance)를 생성하여 참조변수에 저장
		//클래스명 참조변수 = new 클래스명();
		//동일 패키지의 클래스는 패키지 표현없이 클래스 사용이 가능 (oop.Method method = new Method())
		//new 클래스명() : new 연산자로 클래스의 생성자(Constructor)를 호출하여 객체 생성
		//클래스명 참조변수 : 클래스로 생성된 객체의 정보를 저장하기 위한 참조변수 생성
		//참조변수를 이용하여 저장된 객체의 필드 또는 메소드에 접근하여 사용
		Method method = new Method();
		System.out.println("method = " + method);  // 참조 정보 출력
		System.out.println("=========================================================");
		
		//메소드 호출 (Method Invoke)
		//메소드 호출 형식) 참조변수.메소드명(값, 값, ...);
		//참조변수에 저장된 객체(인스턴스)의 메소드 호출
		//메소드 호출은 메소드명과 매개변수에 전달된 값에 의해 호출
		//메소드 명 또는 매개변수에 전달되는 값이 잘못 전달된 경우 메소드 호출 불가능
		//메소드를 호출하면 스레드가(프로그램의 흐름)가 메소드로 이동하여 메소드의 명령 실행 후 귀환
		method.displayOne();
		method.displayTwo();
		method.displayOne();
		System.out.println("=========================================================");
		
		method.printOne();
		method.printOne();
		System.out.println("=========================================================");
		
		//메소드의 매개변수에 값을 정상적인 값이 전달되어야만 메소드 호출 가능
		method.printTwo(50);
		method.printTwo(80);
		System.out.println("=========================================================");
	}
}
