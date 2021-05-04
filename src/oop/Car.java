package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����
public class Car {
	//�ʵ�(Field) : ǥ���� ��� ���� �Ӽ� ���� - �Ӽ��� ����
	//Ŭ������ ����� ��� �޼ҵ忡�� �ʵ忡 �����Ͽ� ��� ����
	String aliasName;//�̸�(��Ī) 
	boolean engineStatus;//��������(�õ�����) - false : Off, true : On
	int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü(�ν��Ͻ�)�� �����ϱ� ���� Ư���� �޼ҵ�
	//������ �������� ������ �⺻ �����ڰ� ����
	
	//�޼ҵ�(Method) : ǥ�� ��� ���� ���� ����
	//�ʵ带 �̿��Ͽ� ǥ�� ����� ������ ����� �ۼ��� ������� ����
	
	//�õ��� �Ѵ� ���� - engineState �ʵ尪 ����
	void startEngine() {
		engineStatus = true;
		System.out.println(aliasName + "�� �õ��� �׽��ϴ�.");
	}

	//�õ��� ���� ����
	void stopEngine() {
		if(currentSpeed != 0) {  //����ӵ��� 0�� �ƴ� ���
			
			//Ŭ���� ���ο� ����� �޼ҵ�� ���� ȣ�� ����
			//�ڵ��� �ߺ��� �ּ�ȭ : ���������� ȿ���� ����
			SpeedZero();
		}
		
		engineStatus= false;
		System.out.println(aliasName + "�� �õ��� �����ϴ�.");
	}
	
	//�ӵ��� �����ϴ� ����
	void speedUp(int speed) {
		if(!engineStatus) {
			System.out.println(aliasName + "�� �õ��� �����ֽ��ϴ�.");
			return;
		}
		
		//�Ű������� ���������� ���� ���޵� ���
		if(currentSpeed + speed > 150) {
			speed = 150 - currentSpeed;
		}
		
		currentSpeed += speed;
		System.out.println(aliasName + "�� �ӵ��� " + speed + "Km/h ���� �Ǿ����ϴ�."
				+ " ���� �ӵ��� " + currentSpeed + "Km/h �Դϴ�.");
	}
	
	//�ӵ��� �����ϴ� ����
	void speedDown(int speed) {
		if(!engineStatus) {
			System.out.println(aliasName + "�� �õ��� �����ֽ��ϴ�.");
			return;
		}
		
		//����ӵ����� ū ���� ���޵Ǹ� ����ӵ� ��ŭ�� ���ҵǰ� ����
		if(currentSpeed < speed) {
			speed = currentSpeed;  
		}
		
		currentSpeed -= speed;
		System.out.println(aliasName + "�� �ӵ��� " + speed + "Km/h ���� �Ǿ����ϴ�."
				+ " ���� �ӵ��� " + currentSpeed + "Km/h �Դϴ�.");
	}
	
	//�ڵ����� ���ߴ� ����
	void SpeedZero() {
		currentSpeed = 0;
		System.out.println(aliasName + "�� �ڵ����� ���߾����ϴ�.");
	}
}
