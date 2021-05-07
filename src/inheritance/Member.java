package inheritance;

//ȸ������(���̵�, �̸�)�� �����ϱ� ���� Ŭ����
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
	public void display() {
		System.out.println("���̵� = " + id);
		System.out.println("�̸� = " + name);
	}
	
}
