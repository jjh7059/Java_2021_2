package xyz.itwill.access;

//private : Ŭ����, �ʵ�, �޼ҵ忡 �����ϴ� ���� ������
// => Ŭ���� ���ο����� ���� �����ϵ��� �����ϴ� ������
public class PrivateMember {
	private int num;
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = " + num);
	}
}
