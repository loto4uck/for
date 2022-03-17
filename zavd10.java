package ffor;

import java.util.Scanner;

public class zavd10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int d = sc.nextInt();
		int s = 0;
		for (int i = 0; i <= x; i++) {
			if (x % 10 == d) {
				s += 1;
			}
			x /= 10;
			
		}
				System.out.println(s);
			
	}

}
