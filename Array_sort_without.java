package interviewStream;

import java.util.Arrays;
import java.util.List;

public class Array_sort_without {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(5, 6, 8, 1, 3, 7);
		int temp = 0, a, b;
		for (int i = 0; i < li.size(); i++) {
			for (int j = i + 1; j < li.size(); j++) {
				if (li.get(i) > li.get(j)) {
					a = li.get(i);
					b = li.get(j);
					temp = b;
					b = a;
					a = temp;
				}
			}
		}
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
	}
}
