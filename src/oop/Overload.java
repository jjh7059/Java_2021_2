package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("������ = " + param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("���� = " + param);
	}
	
	public void displayString(String param) {
		System.out.println("���ڿ� = " + param);
	}
	
	
	//�޼ҵ� �����ε�(Method Overload) ���� : ������ ����� �����ϴ� �޼ҵ尡 �Ű�������
	//���� ���� �� �����ؾ� �� ��� �޼ҵ���� ���� �����ϴ� ���
	//Ŭ�������� �޼ҵ� �Ķ���� ����, �ڷ������� �ٸ��� ����
	public void display(int param) {
		System.out.println("������ = " + param);
	}
	
	public void display(boolean param) {
		System.out.println("���� = " + param);
	}
	
	public void display(String param) {
		System.out.println("���ڿ� = " + param);
	}
}
