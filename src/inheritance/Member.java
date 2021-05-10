package inheritance;

//회원정보(아이디, 이름)를 저장하기 위한 클래스
public class Member {
	private String id;
	private String name;
	
	//Constructor
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor with arguments
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Setter & Getter
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
	
	//Method
	
	//자식 클래스에서 오버라이드 선언된 부모클래스의 메소드는 숨겨진 메소드(Hide Method)로 처리
	// => 부모 클래스의 숨겨진 메소드에 접근하면 자동으로 자식 클래스의 오버라이드 메소드를 호출
	public void display() {
		System.out.println("아이디 = " + id);
		System.out.println("이름 = " + name);
	}
	
}
