package oop;

//자동차를 표현하기 위한 클래스
//클래스를 작성할 때 필드 또는 메소드에 접근 지정자를 선언하여 접근 유무 설정
//접근 지정자(Access Modifier) : private, protected, public

public class Car {
	//필드(Field) : 표현에 대상에 대한 속성 구현 - 속성값 저장
	//클래스에 선언된 모든 메소드에서 필드에 접근하여 사용 가능
	//클래스, 필드, 생성자, 메소드에 선언하여 접근 유무를 지정하는 키워드
	//private : 클래스 내부에서만 접근 가능하며 외부에서는 접근 불가능하도록 설정하는 지정자
	//필드 선언시 사용 : 인스턴스 필드에 직접적인 접근 차단 - 은닉화(Data Hiding)
	//public : 모든 패키지의 클래스에서 접근 가능하도록 설정하는 지정자
	//메소드 선언시 사용 : 메소드를 모든 클래스에서 접근하여 사용할 수 있도록 지정
	private String aliasName;//이름(별칭) 
	private boolean engineStatus;//엔진상태(시동유무) - false : Off, true : On
	private int currentSpeed;//현재속도
	
	//생성자(Constructor) : 객체(인스턴스)를 생성하기 위한 특별한 메소드
	//생성자 선언하지 않으면 기본 생성자가 존재
	
	//메소드(Method) : 표현 대상에 대한 행위 구현
	//필드를 이용하여 표현 대상의 행위를 명령을 작성해 기능으로 제공
	
	//시동을 켜는 행위 - engineState 필드값 변경
	public void startEngine() {
		engineStatus = true;
		System.out.println(aliasName + "의 시동을 켰습니다.");
	}

	//시동을 끄는 행위
	public void stopEngine() {
		if(currentSpeed != 0) {  //현재속도가 0이 아닌 경우
			
			//클래스 내부에 선언된 메소드는 서로 호출 가능
			//코드의 중복성 최소화 : 유지보수의 효율성 증가
			SpeedZero();
		}
		
		engineStatus= false;
		System.out.println(aliasName + "의 시동을 껐습니다.");
	}
	
	//속도를 증가하는 행위
	public void speedUp(int speed) {
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
	public void speedDown(int speed) {
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
	public void SpeedZero() {
		currentSpeed = 0;
		System.out.println(aliasName + "의 자동차가 멈추었습니다.");
	}
	
	//은닉화 선언된 필드는 필드값을 반환하는 Getter 메소드와 필드값을 변경하는
	//Setter 메소드 선언 >> 캡슐화 - 필드 자료형 boolean인 경우 is 메소드 선언
	//Getter & Setter 메소드 자동 생성 단축키 - alt + shift + s >> r
	public String getAliasName() {  //Getter 메소드
		return aliasName;  //필드값 반환
	}
	
	public void setAliasName(String aliasName) {  //Setter 메소드
		this.aliasName = aliasName;
	}

	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}
