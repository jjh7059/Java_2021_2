package inheritance;

//사원정보(사원번호, 사원이름)를 저장하기 위한 클래스
// => 인스턴스 생성이 목적이 아닌 상속이 목적인 클래스로 작성 - 추상클래스로 선언
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
