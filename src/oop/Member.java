package oop;

//ȸ������(���̵�, �̸�, �̸���)�� �����ϱ� ���� Ŭ���� : VO(Value Object) Ŭ���� 
//(�ʵ�, getter, setter�� ����)

public class Member {
	
	//�ʵ�(Field)
	private String id;
	private String name;
	private String email;
	
	//������(Constructor)
	//�����ڸ� �������� ������ ���������� �⺻ �����ڰ� ����
	//�����ڸ� �ϳ��� �����ϸ� �⺻ �����ڴ� ������
	
	//������(Constructor) - �ν��Ͻ��� �����ϱ� ���� Ư���� �޼ҵ�
	//  ������ �ۼ� ��Ģ - ��ȯ���� ������ �޼ҵ���� �ݵ�� Ŭ������� �����ϰ� �ۼ�
	//  �����ε� ���� ���� : �Ű������� �ٸ� ���� ���� ������ ���� ����
	//  �ʱ�ȭ �۾� ���� : ���� �ν��Ͻ��� �ʵ忡 ���ϴ� �ʱⰪ�� ����ǵ��� ��� �ۼ�
	
	//�Ű������� ���� ������ - �⺻ �����ڿ� ����
	//  �Ϲ������� �ʱ�ȭ �۾��� �̱���
	//  �������� ���� ��� ��� ���� ���� �߻� �� �� �����Ƿ� �����ϴ� ���� ����
	// �Ű������� ���� ������ �ڵ� �ϼ� : [ctrl] + [space] >> constructor ����
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//�Ű������� ����� ������
	//  �Ű������� ���޵� ���� �̿��Ͽ� �ʵ忡 ���� - �ʱ�ȭ �۾�
	//  �ʵ忡 ���ϴ� ���� ����� �ν��Ͻ��� �����ϱ� ���� �����ڸ� �ۼ�
	//  �Ű������� ����� ������ �ڵ� �ϼ� : [alt] + [shift] + [s] >> [o] >> �ʱ�ȭ �ʵ� ���� 
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
	

	//�޼ҵ�(Method)
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
	
	//�ʵ尪�� ����ϴ� �޼ҵ� >> �ʵ尪 Ȯ��
	public void display() {
		System.out.println("���̵� = " + id);
		System.out.println("�̸� = " + name);
		System.out.println("�̸��� = " + email);
	}
	
}
