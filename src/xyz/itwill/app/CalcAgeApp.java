package xyz.itwill.app;

//java.lang ��Ű���� �ڷ����� �⺻������ import ����
import java.util.Date;
import java.util.Scanner;

//Ű����� �̸��� �¾ ������ �Է¹޾� �̸��� ���̸� ����ϴ� ���α׷��� �ۼ��ϼ���
//ex) �̸� �Է� >> ȫ�浿
//    �¾ �⵵ �Է� >> 2000
//    [���]ȫ�浿���� ���̴� 22���Դϴ�.
public class CalcAgeApp {
	public static void main(String[] args) {
		//Ű���� �Է°��� �����ޱ� ���� Scanner �ν��Ͻ� ����
		Scanner in = new Scanner(System.in);
		
		//Ű����� �̸��� �¾ �⵵�� �Է¹޾� ������ ����
		System.out.print("�̸� �Է� >> ");
		String name = in.nextLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		int birthYear = in.nextInt();
		
		
		
		//java.util.Date Ŭ������ �ν��Ͻ� ����
		// => java.util.Date : ��¥(�ð�)������ �����ϱ� ���� Ŭ����
		//Date Ŭ������ �Ű������� ���� �����ڷ� �ν��Ͻ��� �����ϸ� ���� �ý���(�ü�� - OS)��
		//���� ��¥(�ð�)������ ������ Date �ν��Ͻ� ����
		Date now = new Date();
		//Date.toString() : Date �ν��Ͻ��� ����� ��¥(�ð�)������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		// => ���������� ����� ��� toString() �޼ҵ� ȣ�� ���� ���� - �ڵ� ȣ��
		//System.out.println("now = " + now);
		
		//Date.getYear() : Date �ν��Ͻ��� ����� �� �� �⵵�� ��ȯ�ϴ� �޼ҵ�
		// => 1900����� 1�� ������ ������ ��ȯ - 1900�� ���ؾ� �ùٸ� �⵵�� ǥ��
		// => @Deprecated ������̼��� ����� �޼ҵ�
		//@Deprecated : �޼ҵ� ����� �������� �ʵ��� �����ϴ� ������̼�(Annotation)
		// => @Deprecated ������̼��� ����� �޼ҵ� ȣ��� ��� �߻�
		//@SuppressWarnings : ����� �����ϴ� ������̼�
		// => ������̼��� value �Ӽ��� ������ ��� �Ӽ����� �����Ͽ� ����
		// => �ٸ� ������̼� �Ӽ��� ���� ��� �Ӽ����� ���� ����
		@SuppressWarnings("deprecation")
		int currentYear = now.getYear() + 1900;  //now.getYear()�� ȣ���ϸ� 121�� ��ȯ
		
		//���̸� ����Ͽ� ������ ����
		//int age = 2021 - birthYear + 1;
		int age = currentYear - birthYear + 1;

		//��� ���
		System.out.println("[���]" + name + "���� ���̴� " + age + "���Դϴ�.");
		
		in.close();
	}
}