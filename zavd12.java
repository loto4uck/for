package ffor;

import java.util.Scanner;

public class zavd12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s = 0;
		for (int i = 1; x != 0; i++) {
			s = x % 10;
			x /= 10;
			System.out.print(s);
		}
	}

}
