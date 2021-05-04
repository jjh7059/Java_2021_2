package oop;

//Car Ŭ������ �̿��Ͽ� �ۼ��� ���α׷�
public class CarApp {
	public static void main(String[] args) {
		//Ŭ������ ��ü(�ν��Ͻ�)�� �����Ͽ� ���������� ����
		//����) Ŭ������ �������� = new Ŭ������();
		//��ü(�ν��Ͻ�)�� �����ϸ� �ν��Ͻ� �ʵ忡�� �⺻���� �ڵ����� ����Ǿ� �ʱ�ȭ
		
		Car carOne = new Car();
		Car carTwo = new Car();
		
		System.out.println(carOne);
		System.out.println(carTwo);
		System.out.println("=========================================================");
		
		//���������� �̿��Ͽ� ���������� ����� ��ü(�ν��Ͻ�)�� ��ҿ� �����Ͽ� ���
		// . �����ڸ� �̿��Ͽ� ��ü(�ν��Ͻ�)�� ��ҿ� ����
		carOne.aliasName = "Ƽ��";
		carOne.engineStatus = false;
		carOne.currentSpeed = 0;
		
		System.out.println("ù��° �ڵ����� ��Ī = " + carOne.aliasName);
		System.out.println("ù��° �ڵ����� �������� = " + carOne.engineStatus);
		System.out.println("ù��° �ڵ����� ����ӵ� = " + carOne.currentSpeed);
		System.out.println("=========================================================");
		
		carTwo.aliasName = "��Ÿ��";
		System.out.println("�ι�° �ڵ����� ��Ī = " + carTwo.aliasName);
		System.out.println("�ι�° �ڵ����� �������� = " + carTwo.engineStatus);
		System.out.println("�ι�° �ڵ����� ����ӵ� = " + carTwo.currentSpeed);
		System.out.println("=========================================================");
		
		
		//��ü(�ν��Ͻ�)�� �̿��Ͽ� �޼ҵ� ȣ�� - ��� ����
		carOne.startEngine();
		carOne.speedUp(10);
		carOne.speedUp(20);
		carOne.speedUp(30);
		carOne.speedDown(30);
		carOne.SpeedZero();
		carOne.stopEngine();
		carOne.speedDown(20);
		System.out.println("=========================================================");
		
	}
}
