package chapter2;

// 형변환 : 데이터타입변환
// 명시적 형변환
public class ExpliciConversion {

	public static void main(String[] args) {
        
		// 큰데이터타입 = 작은 데이터타입 (가능) 묵시적 형변환
		// 명시적 형변환
		// 작은 데이터타입 = 큰데이터타입 (불가능:에러) -> 작은데이터타입 = (좌측데이터타입)큰데이터타입 (가능)
		
		double dnum1 = 1.2; // 해석 : double dnum1 = 1.2d;
        float fnum2 = 0.9f; 
        
        // 실수값이 정수값으로 변환시 소수부분은 버려진다.(반올림없음) 예) (int)0.9f == 0
        int inum3 = (int)dnum1 + (int)fnum2;
        int inum4 = (int)(dnum1 + fnum2);
        
        System.out.println(inum3); // 1
        System.out.println(inum4); // 2
	}

}
