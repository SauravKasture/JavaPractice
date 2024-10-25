package CoreJavaPractice;

public class ExamResult {
	public boolean isPass(int marks) {
//		if (marks >= 50) {
//			
//			return true;
//		} else {
//			return false;
//		}
		boolean returnValue = marks > 50;
		return returnValue;
//		return marks>50;
	}

	public static void main(String[] args) {

		ExamResult result = new ExamResult();

		boolean isExcel = result.isPass(51);
		if (isExcel == true) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}
	}
}
