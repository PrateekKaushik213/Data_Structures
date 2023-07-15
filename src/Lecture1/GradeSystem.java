package Lecture1;

public class GradeSystem {

	public static void main(String[] args) {
		int m = 55;
		if (m >= 75) {
			System.out.println("A");
		} else if (m >= 65) {
			System.out.println("B");
		} else if (m >= 55) {
			System.out.println("C");
		} else if (m >= 45) {
			System.out.println("Pass");
		} else {
			System.out.print("Fail");
		}
	}

}
