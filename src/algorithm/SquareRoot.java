package algorithm;

public class SquareRoot {

	public static void main(String[] args) {
		long n = 4;
		long answer = 0;
		double x = Math.sqrt(n); // 제곱근 구하는 메소드
		System.out.println(x);
		System.out.println(x%1); // >0보다 크면 나머지가 있으므로 제곱근이 되지않음
		if(x%1>0) {
			answer = -1;
		} else {
			answer = (long) Math.pow(x+1, 2) ; // 제곱을 구하는 메소드
		}
		System.out.println("answer = " + answer);
	}
}
