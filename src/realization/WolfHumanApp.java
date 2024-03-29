package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wolfHuman = new WolfHuman();
		
		wolfHuman.speak();
		wolfHuman.walk();
		wolfHuman.smile();
		wolfHuman.change();
		wolfHuman.cryLoudly();
		wolfHuman.fastWalk();
		System.out.println("=============================================");
		
		//부모 클래스로 참조변수 생성하여 자식 클래스의 생성자로 인스턴스를 생성해 저장
		// => 참조변수는 부모 인스턴스의 메소드만 호출 가능
		// => 객체 형변환을 이용하면 자식 인스턴스의 메소드도 호출 가능
		Human human = new WolfHuman();
		human.speak();
		human.walk();
		human.smile();
		System.out.println("=============================================");
		
		//명시적 객체 형변환을 이용하여 자식 인스턴스의 메소드 호출
		((WolfHuman)human).change();
		System.out.println("=============================================");
		
		//인터페이스를 이용하여 참조변수 생성
		// => 자식 클래스의 생성자로 인스턴스를 생성하여 저장 가능
		//Wolf wolf = new WolfHuman();
		
		//자식 클래스가 같은 부모 클래스 또는 부모 인터페이스는 서로 명시적 객체 형변환을
		//이용하여 자식 인스턴스 저장 가능
		Wolf wolf = (Wolf)human;
		
		//묵시적 객체 형변환에 의해 자식 인스턴스의 메소드 호출
		wolf.cryLoudly();
		wolf.fastWalk();
		System.out.println("=============================================");
		
	}
}
