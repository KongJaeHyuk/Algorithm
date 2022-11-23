package algorithm;

public class HarshadNumber {

	public static void main(String[] args) {
		// 하샤드수
		boolean answer = true;
		int sum = 0;
		int x = 10;
		int a = x;
		while(x>0) {
			sum += x%10;
			System.out.println("sum = " + sum);
			x /= 10;
			System.out.println("x = " + x);
		}
		System.out.println("a/sum " + a/sum);
		if(a%sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		System.out.println("answer = " + answer);
	}
}
