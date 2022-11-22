package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PandY {

	public static void main(String[] args) {
		boolean answer = true;
		
		String a = "pypypfd";
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		for(int i =0; i<a.length(); i++) {
			char b = a.charAt(i);
			b = Character.toLowerCase(b);
			System.out.println(b);
			if(b == 'p') {
				list1.add(b);
				System.out.println(list1.size());
			} else if(b == 'y') {
				list2.add(b);
			}
		}
		if(list1.size()==list2.size()) {
			answer = true;
		} else {
			answer = false;
		}
		System.out.println(answer);
	}
}
