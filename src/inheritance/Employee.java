package inheritance;

//�������(�����ȣ, ����̸�)�� �����ϱ� ���� Ŭ����
// => �ν��Ͻ� ������ ������ �ƴ� ����� ������ Ŭ������ �ۼ� - �߻�Ŭ������ ����
public abstract class Employee {
	private int empNo;
	private String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
