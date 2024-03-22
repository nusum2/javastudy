package chapter5.hiding;

public class Student {
	
	int studentId;
	String studentName;
	int grade;
	String address;
	private int score;
    
	//setter, getter메소드는 이름을 반드시 다음과 같은 규칙으로 만들어야 한다.
	//setScore(), getScore()
	//score필드에 값을 저장. setter메소드
	public void setScore(int score) {
		if(score < 0 || score >= 100) {
			this.score = 0;
			return;
		}
		this.score = score;
	}
	
	//score필드에 값을 읽기. getter메소드
	public int getScore() {
		return score;
	}
}
