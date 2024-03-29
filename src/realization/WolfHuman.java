package realization;

//클래스 선언시 클래스를 상속하기 위해 extends 키워드 사용 - 단일상속만 가능
//클래스 선언시 인터페이스를 상속받기 위해 implements 키워드 사용 - 다중상속 가능
// => 상속받은 인터페이스의 모든 추상 메소드를 오버라이드 선언
public class WolfHuman extends Human implements Wolf {

	@Override
	public void cryLoudly() {
		System.out.println("[늑대]큰 소리로 울부짖을 수 있는 능력");
	}

	@Override
	public void fastWalk() {
		System.out.println("[늑대]네 발로 빠르게 달릴 수 있는 능력");
	}
	
	public void change() {
		System.out.println("[늑대인간]변신할 수 있는 능력");
	}
}
