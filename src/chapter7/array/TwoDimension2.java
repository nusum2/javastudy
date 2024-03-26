package chapter7.array;

public class TwoDimension2 {

	public static void main(String[] args) {
		
		//배열도 객체다.
		//배열 변수에 주소값이 저장되어있다.
		//배열도 참조타입이다.
		//마지막 요소를 가리키는 이름은 행수 -1, 열수 -1
		int[][] arr = {
				       {1,4},
				       {2,5},
				       {3,6}
				            };
		//배열의 행크기
		System.out.println("배열의 행크기 " + arr.length);
		//첫번째 행의 열크기
		System.out.println("첫번째 행의 열크기 " + arr[0].length);
		//두번째 행의 열크기
		System.out.println("두번째 행의 열크기 " + arr[1].length);
		//세번째 행의 열크기
		System.out.println("세번째 행의 열크기 " + arr[2].length);
		
		//2행2열 데이터를 7로 변경
		arr[1][1] = 7;
		System.out.println("2행2열 " + arr[1][1]);
		//3행2열 데이터를 8로 변경
		arr[2][1] = 8;
		//중첩 for문을 사용하여 2차원 배열 출력
		for (int i = 0; i < arr.length; i++) { //행 인덱스
			for (int j = 0; j < arr[i].length; j++) { //열 인덱스
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		//배열 : 동일한 데이터 타입을 연속적으로 기억장소를 생성해서 대표이름(배열)으로 관리하는 것
		int[] arr2 = new int[] {78, 89, 90};
		int[] arr3 = {78,89,90};
		int[] arr4 = new int[3];
		arr4[0] = 78;
		arr4[1] = 89;
		arr4[2] = 90;
	}

}
