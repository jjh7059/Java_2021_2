package realization;

//Ŭ���� ����� Ŭ������ ����ϱ� ���� extends Ű���� ��� - ���ϻ�Ӹ� ����
//Ŭ���� ����� �������̽��� ��ӹޱ� ���� implements Ű���� ��� - ���߻�� ����
// => ��ӹ��� �������̽��� ��� �߻� �޼ҵ带 �������̵� ����
public class WolfHuman extends Human implements Wolf {

	@Override
	public void cryLoudly() {
		System.out.println("[����]ū �Ҹ��� ���¢�� �� �ִ� �ɷ�");
	}

	@Override
	public void fastWalk() {
		System.out.println("[����]�� �߷� ������ �޸� �� �ִ� �ɷ�");
	}
	
	public void change() {
		System.out.println("[�����ΰ�]������ �� �ִ� �ɷ�");
	}
}
