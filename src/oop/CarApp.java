package oop;

//Car 클래스를 이용하여 작성된 프로그램
public class CarApp {
	public static void main(String[] args) {
		//클래스로 객체(인스턴스)를 생성하여 참조변수에 저장
		//형식) 클래스명 참조변수 = new 클래스명();
		//객체(인스턴스)를 생성하면 인스턴스 필드에는 기본값이 자동으로 저장되어 초기화
		
		Car carOne = new Car();
		Car carTwo = new Car();
		
		System.out.println(carOne);
		System.out.println(carTwo);
		System.out.println("=========================================================");
		
		//참조변수를 이용하여 참조변수에 저장된 객체(인스턴스)의 요소에 접근하여 사용
		// . 연산자를 이용하여 객체(인스턴스)의 요소에 접근
		//문제점)인스턴스로 필드에 직접적인 접근을 허용할 경우 비정상적인 값 저장에
		//대한 제한을 할 수 없어 실행 결과가 잘못되는 오류 발생
		//Getter, Setter 메소드를 호출하여 필드를 간접적으로 사용
		carOne.setAliasName("티코");
		carOne.setEngineStatus(false);
		carOne.setCurrentSpeed(0);
		
		System.out.println("첫번째 자동차의 별칭 = " + carOne.getAliasName());
		System.out.println("첫번째 자동차의 엔진상태 = " + carOne.isEngineStatus());
		System.out.println("첫번째 자동차의 현재속도 = " + carOne.getCurrentSpeed());
		System.out.println("=========================================================");
		
		carTwo.setAliasName("싼타페");
		System.out.println("두번째 자동차의 별칭 = " + carTwo.getAliasName());
		System.out.println("두번째 자동차의 엔진상태 = " + carTwo.isEngineStatus());
		System.out.println("두번째 자동차의 현재속도 = " + carTwo.getCurrentSpeed());
		System.out.println("=========================================================");
		
		
		//객체(인스턴스)를 이용하여 메소드 호출 - 기능 구현
		carOne.startEngine();
		carOne.speedUp(10);
		carOne.speedUp(20);
		carOne.speedUp(30);
		carOne.speedDown(30);
		carOne.SpeedZero();
		carOne.stopEngine();
		carOne.speedDown(20);
		System.out.println("=========================================================");
		
	}
}
