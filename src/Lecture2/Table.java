package Lecture2;

public class Table {

	public static void main(String[] args) {
		int n=7, i=1 , m=0;
		while(i<=10) {
			m = n*i;
			i++;
			if(m%4 != 0) {
				System.out.println(m);
			}
			//System.out.println(m);
		}
		//System.out.println(m);
	}

}
