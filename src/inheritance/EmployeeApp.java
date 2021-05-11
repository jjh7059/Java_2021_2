package inheritance;

//사원 급여 관리 프로그램
public class EmployeeApp {
	public static void main(String[] args) {
		//추상클래스로 인스턴스를 생성할 경우 에러 발생
		//Employee employee = new Employee();
		
		Employee employee1 = new EmployeeRegular();
		Employee employee2 = new EmployeeTime();
		Employee employee3 = new EmployeeContract();
	}
}
