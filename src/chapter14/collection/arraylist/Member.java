package chapter14.collection.arraylist;

public class Member /*extends Object*/{
	
	private int memberId;
	private String memberName;
	
	
	//매개변수가 있는 생성자
	public Member(int memberId, String memberName) {
		super(); //생략해도 컴파일 과정에서 자동생성. Object클래스의 기본생성자 호출
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
    //재정의 목적 - 클래스의 필드내용 확인
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}
