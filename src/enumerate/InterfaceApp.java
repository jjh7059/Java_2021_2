package enumerate;

//클래스(인터페이스)에 상수필드를 선언한 경우의 단점
// => 상수필드를 이용하여 고유값(대표값)으로 사용하기 부적절
// => 상수필드를 의미있는 문자열로 표현 불가능
// => 상수필드가 선언된 클래스(인터페이스)가 무의미
//JDK 1.5 이상에서는 클래스(인터페이스)에서 선언된 상수필드의 단점을 보완하기 위해 enum 자료형 추가 
public class InterfaceApp {
	public static void main(String[] args) {
		//인터페이스에 선언된 상수필드값 출력 - 상수필드로 표현된 기본값이 출력
		System.out.println("삽입 = " + InterfaceOne.INSERT);
		System.out.println("변경 = " + InterfaceOne.UPDATE);
		System.out.println("삭제 = " + InterfaceOne.DELETE);
		System.out.println("검색 = " + InterfaceOne.SELECT);
		System.out.println("==============================================");
		System.out.println("삽입 = " + InterfaceTwo.ADD);
		System.out.println("변경 = " + InterfaceTwo.MODIFY);
		System.out.println("삭제 = " + InterfaceTwo.REMOVE);
		System.out.println("검색 = " + InterfaceTwo.SEARCH);
		System.out.println("==============================================");
		
		//상수필드의 기본값과 동일한 자료형의 변수의 상수필드 저장 가능
		int choice = InterfaceOne.INSERT;
		System.out.println("선택 = " + choice);
		System.out.println("==============================================");
		
		switch(choice) {
		//case InterfaceOne.INSERT:
		case InterfaceTwo.ADD:
			System.out.println("# 학생정보를 저장합니다.");
			break;
		case InterfaceOne.UPDATE:
			System.out.println("# 학생정보를 변경합니다.");
			break;
		case InterfaceOne.DELETE:
			System.out.println("# 학생정보를 삭제합니다.");
			break;
		case InterfaceOne.SELECT:
			System.out.println("# 학생정보를 검색합니다.");
			break;
		}
		System.out.println("==============================================");
	}
}
