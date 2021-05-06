package oop;

//회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스 : VO(Value Object) 클래스 
//(필드, getter, setter만 존재)

public class Member {
	
	//필드(Field)
	private String id;
	private String name;
	private String email;
	
	//생성자(Constructor)
	//생성자를 선언하지 않으면 내부적으로 기본 생서자가 제공
	//생성자를 하나라도 선언하면 기본 생성자는 미제공
	
	//생성자(Constructor) - 인스턴스를 생성하기 위한 특별한 메소드
	//  생성자 작성 규칙 - 반환형이 없으며 메소드명은 반드시 클래스명과 동일하게 작성
	//  오버로드 선언 가능 : 매개변수가 다른 여러 개의 생성자 선언 가능
	//  초기화 작업 구현 : 생성 인스턴스의 필드에 원하는 초기값이 저장되도록 명령 작성
	
	//매개변수가 없는 생성자 - 기본 생성자와 동일
	//  일반적으로 초기화 작업을 미구현
	//  선언하지 않을 경우 상속 관련 문제 발생 될 수 있으므로 선언하는 것을 권장
	// 매개변수가 없는 생성자 자동 완성 : [ctrl] + [space] >> constructor 선택
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 선언된 생성자
	//  매개변수에 전달된 값을 이용하여 필드에 저장 - 초기화 작업
	//  필드에 원하는 값이 저장된 인스턴스를 생성하기 위해 생성자를 작성
	//  매개변수가 선언된 생성자 자동 완성 : [alt] + [shift] + [s] >> [o] >> 초기화 필드 선택 
	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	

	//메소드(Method)
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//필드값을 출력하는 메소드 >> 필드값 확인
	public void display() {
		System.out.println("아이디 = " + id);
		System.out.println("이름 = " + name);
		System.out.println("이메일 = " + email);
	}
	
}
