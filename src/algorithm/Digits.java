package algorithm;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int answer = 0;
		System.out.println(123%10);
		System.out.println(123/10%10);
		System.out.println(123/10/10%10);
		
		while(a>0) {
			answer += a%10;
			a/= 10;
		}
		System.out.println(answer);
	}

}
