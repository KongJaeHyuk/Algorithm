package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		boolean answer = true;
		int[] arr = {4,3,2};
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != i+1) {
				answer = false;
				break;
			} else {
				answer = true;
			}
		System.out.println(answer);
		}
	}
}
