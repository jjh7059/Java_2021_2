package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����
//Ŭ������ �ۼ��� �� �ʵ� �Ǵ� �޼ҵ忡 ���� �����ڸ� �����Ͽ� ���� ���� ����
//���� ������(Access Modifier) : private, protected, public

public class Car {
	//�ʵ�(Field) : ǥ���� ��� ���� �Ӽ� ���� - �Ӽ��� ����
	//Ŭ������ ����� ��� �޼ҵ忡�� �ʵ忡 �����Ͽ� ��� ����
	//Ŭ����, �ʵ�, ������, �޼ҵ忡 �����Ͽ� ���� ������ �����ϴ� Ű����
	//private : Ŭ���� ���ο����� ���� �����ϸ� �ܺο����� ���� �Ұ����ϵ��� �����ϴ� ������
	//�ʵ� ����� ��� : �ν��Ͻ� �ʵ忡 �������� ���� ���� - ����ȭ(Data Hiding)
	//public : ��� ��Ű���� Ŭ�������� ���� �����ϵ��� �����ϴ� ������
	//�޼ҵ� ����� ��� : �޼ҵ带 ��� Ŭ�������� �����Ͽ� ����� �� �ֵ��� ����
	private String aliasName;//�̸�(��Ī) 
	private boolean engineStatus;//��������(�õ�����) - false : Off, true : On
	private int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü(�ν��Ͻ�)�� �����ϱ� ���� Ư���� �޼ҵ�
	//������ �������� ������ �⺻ �����ڰ� ����
	
	//�޼ҵ�(Method) : ǥ�� ��� ���� ���� ����
	//�ʵ带 �̿��Ͽ� ǥ�� ����� ������ ����� �ۼ��� ������� ����
	
	//�õ��� �Ѵ� ���� - engineState �ʵ尪 ����
	public void startEngine() {
		engineStatus = true;
		System.out.println(aliasName + "�� �õ��� �׽��ϴ�.");
	}

	//�õ��� ���� ����
	public void stopEngine() {
		if(currentSpeed != 0) {  //����ӵ��� 0�� �ƴ� ���
			
			//Ŭ���� ���ο� ����� �޼ҵ�� ���� ȣ�� ����
			//�ڵ��� �ߺ��� �ּ�ȭ : ���������� ȿ���� ����
			SpeedZero();
		}
		
		engineStatus= false;
		System.out.println(aliasName + "�� �õ��� �����ϴ�.");
	}
	
	//�ӵ��� �����ϴ� ����
	public void speedUp(int speed) {
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
	public void speedDown(int speed) {
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
	public void SpeedZero() {
		currentSpeed = 0;
		System.out.println(aliasName + "�� �ڵ����� ���߾����ϴ�.");
	}
	
	//����ȭ ����� �ʵ�� �ʵ尪�� ��ȯ�ϴ� Getter �޼ҵ�� �ʵ尪�� �����ϴ�
	//Setter �޼ҵ� ���� >> ĸ��ȭ - �ʵ� �ڷ��� boolean�� ��� is �޼ҵ� ����
	//Getter & Setter �޼ҵ� �ڵ� ���� ����Ű - alt + shift + s >> r
	public String getAliasName() {  //Getter �޼ҵ�
		return aliasName;  //�ʵ尪 ��ȯ
	}
	
	public void setAliasName(String aliasName) {  //Setter �޼ҵ�
		this.aliasName = aliasName;
	}

	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}
