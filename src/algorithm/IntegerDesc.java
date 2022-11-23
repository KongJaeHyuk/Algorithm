package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntegerDesc {

	public static void main(String[] args) {
		// 정수 내림차순 정렬
		long a = 12345678;
		long answer = 0;
		String s = Long.toString(a);
		List list = new ArrayList();
		System.out.println(s);
		
		for(int i =0; i <s.length(); i++) {
			list.add(s.charAt(i));
		}
		System.out.println(list.get(0));
		list.sort(Comparator.reverseOrder());
		
		String b = "";
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
			b += list.get(i);
		}
		System.out.println(b);
		answer = Long.parseLong(b);
		System.out.println(answer);
	}
}