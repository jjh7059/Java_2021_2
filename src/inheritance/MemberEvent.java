package inheritance;

//�̺�Ʈ ���� ȸ������(���̵�, �̸�, �̸���)�� �����ϱ� ���� Ŭ����
// => ȸ�������� �����ϴ� Ŭ����(Member)�� ��ӹ޾� �ۼ��ϴ� ���� ����
//extends Ű���带 �̿��Ͽ� ���� Ŭ����(�θ�Ŭ���� - Super Class)�� ��ӹ޾� ���ο� 
//Ŭ����(�ڽ� Ŭ���� - Sub Class)�� �ۼ�
// => �ڽ� Ŭ���������� �θ� Ŭ������ �ʵ� �Ǵ� �޼ҵ忡 �����Ͽ� ��� - ��Ӽ�(Inheritance)
// => ���� ��Ӹ� ���� - �θ� Ŭ������ �ϳ��� ���� ����
public class MemberEvent extends Member {
	/*
	//�θ� Ŭ����(Member)�� ��ӹ����Ƿ� �ʵ� �̼���
	private String id;
	private String name;
	*/
	private String email;
	
	//super : �ڽ� Ŭ������ �޼ҵ忡�� �θ� �ν��Ͻ��� �����ϱ� ���� �Ű�����(Ű����)
	// => super Ű���带 �̿��Ͽ� �θ� �ν��Ͻ��� �ʵ� �Ǵ� �޼ҵ忡 �����Ͽ� ��� ����
	// => super Ű���带 ������� �ʾƵ� �θ� �ν��Ͻ��� �ʵ� �Ǵ� �޼ҵ� ���� ����
	//this Ű����� �ʵ� �Ǵ� �޼ҵ带 �����Ͽ� ���� ��� �ʵ�, �޼ҵ带 superŰ����� ����
	// super - �θ� Ŭ���� ����, this - �ڽ� Ŭ���� ����
	
	//super Ű���带 ǥ���ϴ� ���
	//1. �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
	// => ������ ȣ�� ��� ���� �ٸ� ����� �ۼ��� ��� ���� �߻�
	// => �θ� Ŭ������ �Ű������� ����� ������ ȣ���Ͽ� �θ� �ν��Ͻ� �ʵ忡 �ʱ�ȭ �۾�
	//2. �ڽ� Ŭ������ �������̵� �޼ҵ忡�� �θ� Ŭ������ ������ �޼ҵ带 ȣ���ϱ� ���� super ���
	
	//Constructor
	public MemberEvent() {
		//�θ� Ŭ������ �Ű������� ���� �����ڰ� ���� ��� ���� �߻�
		//super();//�θ� Ŭ������ �Ű������� ���� ������(�⺻ ������) ȣ�� - ���� ����
	}
	
	//Constructor with Arguments
	/*
	public MemberEvent(String id, String name, String email) {
		super();
		//�ڽ� Ŭ�������� �ʵ� �Ǵ� �޼ҵ� ���� ���� : �ڽ� Ŭ���� ���� >> �θ� Ŭ���� ����
		// => �θ� Ŭ������ ����ȭ ����� �ʵ� �Ǵ� �޼ҵ�� ���� �Ұ���
		//this.id = id;
		super.setId(id);//�θ� �ν��Ͻ��� �޼ҵ� ȣ��
		//this.name = name;
		setName(name);
		this.email = email;
	}
	*/
	
	public MemberEvent(String id, String name, String email) {
		super(id, name);//�θ� Ŭ������ �Ű������� �ִ� ������ ȣ�� - �ʵ� �ʱ�ȭ �۾�
		this.email = email;
	}
	
	//Setter & Getter
	
	/*
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
	*/
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Method
	
	//�޼ҵ� �������̵�(Method Override) : ��� ���迡�� �θ� Ŭ������ �޼ҵ带 
	//�ڽ� Ŭ�������� �缱���ϴ� ��� - �θ� Ŭ������ �޼ҵ�� ���� �������� ����
	// => ����������, ��ȯ��, �޼ҵ��, �Ű�����, ���������� ��� ������ ����
	// => �θ� Ŭ������ �޼ҵ�� �������� �ڽ� Ŭ������ �޼ҵ常 ��� ����
	
	/*
	public void display() {
		//System.out.println("���̵� = " + id);
		System.out.println("���̵� = " + getId());
		//System.out.println("�̸� = " + name);
		System.out.println("�̸� = " + getName());
		System.out.println("�̸��� = " + email);
	}
	*/
	
	//��Ŭ�������� �θ� Ŭ������ �޼ҵ带 �������̵� �����ϴ� ���
	//�������̵� ������ �޼ҵ�� �Է� >> [ctrl] + [space] >> Override ����
	//@Override : �������̵� �޼ҵ带 ǥ���ϱ� ���� Annotation
	// => �������̵� ��Ģ�� ������ ��� ���� �߻�
	//������̼�(Annotation) : Ư���� ������ �ۼ��ϱ� ���� ����
	// => Java Source�� Ư���� ����� �����ϱ� ���� ���
	@Override
	public void display() {
		super.display(); //super Ű���带 �̿��Ͽ� �θ� Ŭ������ �޼ҵ� ȣ��
		System.out.println("�̸��� = " + email);
	}
	
}
