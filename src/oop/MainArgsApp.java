package oop;

public class MainArgsApp {
	//main �޼ҵ��� �Ű��������� ���α׷� ����� �Էµ� ���ڿ����� ���޹޾� �迭������
	//window cmd�� "java ���ڿ�"���·� �����ϸ� ���ڿ� ������ ��µ�
	//eclipse������ Run�޴� > Run Configurations > Program Argument �Է� > Run (����ϰ� ��������)
	public static void main(String[] args) {
		System.out.println("���޵� ���ڿ��� ���� = " + args.length);
		
		for(int i =0; i < args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}
