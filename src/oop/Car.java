package oop;

//자동차를 표현하기 위한 클래스
public class Car {
	//필드(Field) : 표현에 대상에 대한 속성 구현 - 속성값 저장
	//클래스에 선언된 모든 메소드에서 필드에 접근하여 사용 가능
	String aliasName;//이름(별칭) 
	boolean engineStatus;//엔진상태(시동유무) - false : Off, true : On
	int currentSpeed;//현재속도
	
	//생성자(Constructor) : 객체(인스턴스)를 생성하기 위한 특별한 메소드
	//생성자 선언하지 않으면 기본 생성자가 존재
	
	//메소드(Method) : 표현 대상에 대한 행위 구현
	//필드를 이용하여 표현 대상의 행위를 명령을 작성해 기능으로 제공
	
	//시동을 켜는 행위 - engineState 필드값 변경
	void startEngine() {
		engineStatus = true;
		System.out.println(aliasName + "의 시동을 켰습니다.");
	}

	//시동을 끄는 행위
	void stopEngine() {
		if(currentSpeed != 0) {  //현재속도가 0이 아닌 경우
			
			//클래스 내부에 선언된 메소드는 서로 호출 가능
			//코드의 중복성 최소화 : 유지보수의 효율성 증가
			SpeedZero();
		}
		
		engineStatus= false;
		System.out.println(aliasName + "의 시동을 껐습니다.");
	}
	
	//속도를 증가하는 행위
	void speedUp(int speed) {
		if(!engineStatus) {
			System.out.println(aliasName + "의 시동이 꺼져있습니다.");
			return;
		}
		
		//매개변수에 비정상적인 값이 전달된 경우
		if(currentSpeed + speed > 150) {
			speed = 150 - currentSpeed;
		}
		
		currentSpeed += speed;
		System.out.println(aliasName + "의 속도가 " + speed + "Km/h 증가 되었습니다."
				+ " 현재 속도는 " + currentSpeed + "Km/h 입니다.");
	}
	
	//속도를 감소하는 행위
	void speedDown(int speed) {
		if(!engineStatus) {
			System.out.println(aliasName + "의 시동이 꺼져있습니다.");
			return;
		}
		
		//현재속도보다 큰 값이 전달되면 현재속도 만큼만 감소되게 제어
		if(currentSpeed < speed) {
			speed = currentSpeed;  
		}
		
		currentSpeed -= speed;
		System.out.println(aliasName + "의 속도가 " + speed + "Km/h 감소 되었습니다."
				+ " 현재 속도는 " + currentSpeed + "Km/h 입니다.");
	}
	
	//자동차를 멈추는 행위
	void SpeedZero() {
		currentSpeed = 0;
		System.out.println(aliasName + "의 자동차가 멈추었습니다.");
	}
}
