package Lecture1;

public class DivsibleBy {

	public static void main(String[] args) {
		int n = 30;
		if (n % 2 == 0 && n % 3 == 0) {
			System.out.println("Hey");
		} else if (n % 7 == 0) {
			System.out.println("Bye");
		} else {
			System.out.println("OK");
		}

	}

}
