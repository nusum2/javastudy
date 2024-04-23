package chapter14.collection.arraylist;

import java.util.Comparator;

//TreeSet클래스에서 이 클래스가 객체생성하여 데이터로 사용하기 위하여
//아래 인터페이스를 반드시 구현해야한다.
//1)Comparable 또는 2)Comparator
public class Member2 /*extends Object*/implements Comparable<Member2>{
	
	private int memberId;
	private String memberName;
	
	
	//매개변수가 있는 생성자
	public Member2(int memberId, String memberName) {
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
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		Member2 member = (Member2) obj;
		if(this.memberId == member.memberId && this.memberName.equals(member.memberName))
			return true;
		else 
		    return false;
	}
	//객체가 대소비교에 사용되는 추상메소드 구현용도
//	@Override
//	public int compare(Member2 o1, Member2 o2) {
//		System.out.println("compare호출");
//		//Member2클래스를 대소비교할때 기준을 잡아야한다.
//		//memberId를 대소비교 대상으로 기준을 잡음.
//		return o1.getMemberId() - o2.getMemberId();
//	}

	@Override
	public int compareTo(Member2 o) {
		System.out.println("comparaTo 호출");
		System.out.println(memberId - o.getMemberId());
		
		//오름차순
		return memberId - o.getMemberId();
	}
}
