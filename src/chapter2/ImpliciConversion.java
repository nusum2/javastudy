package chapter2;

// 형변환 : 데이터타입변환
// 묵시적 형변환
public class ImpliciConversion {

	public static void main(String[] args) {
		
		// 정수데이터타입 크기 순서 byte(1) < short(2) < int(4) < long(8)
		
		byte bnum = 10; // 크기 1바이트
		
		// 1바이트 10이 4바이트 10으로 형변환되어 좌측의 변수에 대입된다.
		int inum = bnum; // 4바이트 = 1바이트 해석 : int inum = (int) bnum;
		
		System.out.println(bnum);
		System.out.println(inum);
		
		// 정수데이터타입보다는 실수데이터타입이 크다.
        int inum2 = 20;
        float fnum = inum2; // 해석 : float fnum = (float) inum2;
        
        System.out.println(inum2); // 20
        System.out.println(fnum);// 20.0f
        
        double dnum;
        
        // 우측의 연산코드도 큰데이터타입으로 변환되어 연산된다.
        dnum = fnum + inum; // fnum + inum 해석 : (float) + (int) -> (float) + (float)
        
        System.out.println(dnum);
	}

}
