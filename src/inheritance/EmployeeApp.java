package inheritance;

//��� �޿� ���� ���α׷�
public class EmployeeApp {
	public static void main(String[] args) {
		//�߻�Ŭ������ �ν��Ͻ��� ������ ��� ���� �߻�
		//Employee employee = new Employee();
		
		Employee employee1 = new EmployeeRegular();
		Employee employee2 = new EmployeeTime();
		Employee employee3 = new EmployeeContract();
	}
}
