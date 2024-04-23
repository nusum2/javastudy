package chapter15.stream2;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		//객체이름 이름, 나이, 여행비용
		//customerLee "이순신", 40, 100
		//customerKim "김유신", 20, 80
		//customerHong "홍길동", 13, 50
		
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 80);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		 
		//List컬렉션 ArraysList사용 customerList 작성
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("--- 고객명단 추가된 순서대로 출력 ---");
		//map() : 일부를 참조할 때 사용
		customerList.stream().map(c -> c.getName()).forEach(n -> System.out.println(n));
		
		System.out.println("--- 고객나이 추가된 순서대로 출력 ---");
		customerList.stream().map(c -> c.getAge()).forEach(a -> System.out.println(a));
		
		System.out.println("--- 고객여행비용 추가된 순서대로 출력 ---");
		customerList.stream().map(c -> c.getPrice()).forEach(p -> System.out.println(p));
		
		System.out.println("---고객 총 여행비용을 출력---");
		//총 여행비용
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행비용 : " + total); //230
		
		System.out.println("---나이가 20세 이상인 고객명단을 정렬하여 출력---");
		//조건을 이용할 때 Stream API 작업
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).
		sorted().forEach(s -> System.out.println(s));
		
	}
	   

}
