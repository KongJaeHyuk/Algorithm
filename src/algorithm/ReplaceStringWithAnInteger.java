package algorithm;

public class ReplaceStringWithAnInteger {

	public static void main(String[] args) {
		// 문자열을 정수로 치환
		String s = "-1234";
		int answer = 0;
		if(s.length() >= 1 && s.length() <=5) {
			answer = Integer.parseInt(s);
		}
		System.out.println(answer);
	}
}
