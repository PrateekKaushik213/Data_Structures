package Lecture1;

public class MaximumNo {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 54;
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			}
		} else if (b > c) {
			System.out.println(b);
		} else
			System.out.println(c);
	}

}
