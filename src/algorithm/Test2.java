package algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		int [] estimates = {5,1,9,8,10,5};
		int k = 3;
		int answer = 0;
		int sum = 0;
		List list = new ArrayList();
		
			// index 가 012 123 234 345 돌게 for문
			for(int i = 0; i<=estimates.length-k; i++) {
				for(int j = 0; j<k; j++ ) {
					System.out.println("i = " + i);
					System.out.println("j = " + j);
					sum += estimates[i+k-j-1];
					list.add(sum);
				}
				System.out.println("sum = " + sum);
				sum = 0;
			}
			list.sort(Comparator.naturalOrder());
			int lastIndex = list.size()-1;
			System.out.println(list.get(lastIndex));
			answer = (int) list.get(lastIndex);
		}
	}