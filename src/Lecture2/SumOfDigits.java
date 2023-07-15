package Lecture2;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 3467, sum =0;
		while(n%10 != 0) {
			sum = sum +(n%10);
			n = n/10;
		}
		System.out.println(sum);

	}

}
