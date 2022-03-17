package ffor;

import java.util.Scanner;

public class zavd4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 1;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
            f *= i;
            sum = i + f;
		}
		System.out.println(sum);
	}

}
