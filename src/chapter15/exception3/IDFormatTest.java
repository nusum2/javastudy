package chapter15.exception3;

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 가능합니다.");
		}
		this.userID = userID;
	}
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserID(userID);
			
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		userID = "1234567"; //아이디 7자리
		
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
