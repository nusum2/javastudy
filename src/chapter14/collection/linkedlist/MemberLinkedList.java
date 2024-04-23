package chapter14.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

import chapter14.collection.arraylist.Member;

//ArrayList클래스의 데이터로 Member클래스 사용하기 
public class MemberLinkedList {
	
	//기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터 중복 허용
	private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	//데이터 추가
	public void addMember(Member member) {
		linkedList.add(member);
	}
	//데이터 제거
	public boolean removeMember(int memberId) {
		
		//arrayList.size() : 컬렉션 기억장소 요소의 개수
		for (int i = 0; i < linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				linkedList.remove(i); //멤버를 삭제
				return true; 
			}
		}
		return false;
	}
	//모든 데이터 보기
	public void showAllMember() {
		//4번 반복
		for (Member member : linkedList) {
			System.out.println(member); //member.toString() 호출
		}
		System.out.println();
	}
}
