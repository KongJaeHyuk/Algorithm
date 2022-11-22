package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NaturalNumberReverse {

	public static void main(String[] args) {
		int[] answer = {};
		long n = 12345;
		String s = String.valueOf(n);
		answer = new int[s.length()];
		System.out.println("s.length() = " + s.length());
		while(n>0) {
			 for(int i =0; i<s.length(); i++) {
				 answer[i] = (int) (n%10);
				 n /= 10;
			 }
		}
		System.out.println("answer = " + Arrays.toString(answer));
	}
}
