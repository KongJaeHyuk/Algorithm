package algorithm;

public class divisor {

	public static void main(String[] args) {
		int answer = 0;
		int sum = 0;
		int n = 12;
		for(int i = 1; i<=n; i++) {
			if(n % i == 0) {
				System.out.println("약수의 합 = " + (sum + i));
				sum = sum+i;
			}
		}
	}
}
