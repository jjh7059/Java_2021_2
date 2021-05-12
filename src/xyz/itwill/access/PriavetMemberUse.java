package xyz.itwill.access;

public class PriavetMemberUse {
	public void run() {
		@SuppressWarnings("unused")
		PrivateMember member = new PrivateMember();
		
		//member.num = 100;
		//member.display();
	}
}
