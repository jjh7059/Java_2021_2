package oop;

public class OverloadApp {
	public static void main(String[] args) {
		Overload overload = new Overload();
		
		overload.displayInt(100);
		overload.displayBoolean(false);
		overload.displayString("ȫ�浿");
		System.out.println("=========================================================");
		
		//�޼ҵ� �����ε忡 ���� ������
		//������(Polymorphism) : ���� �̸��� �޼ҵ带 ȣ���ص� ���¿� ���� �޼ҵ带
		//�����Ͽ� ȣ���ϴ� ��� - �޼ҵ� �����ε�, �޼ҵ� �������̵�
		overload.display(100);
		overload.display(false);
		overload.display("ȫ�浿");
		System.out.println("=========================================================");
	}
}
