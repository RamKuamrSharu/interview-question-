package interviewStream;

import java.util.Arrays;
import java.util.List;

public class Target {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 4, 5, 2, 7, 20, 48, 56);
		List<String> l = Arrays.asList("Ram", " ", "Blacky", " ", "Mathan");
		List<Integer> ll = Arrays.asList(1, 5, 3, 8, 5, 6, 7, 8);
		int target = 7;
		li.stream().flatMap(x -> li.stream().filter(y -> x + y == target && x != y).map(y -> Arrays.asList(x, y)))
				.forEach(System.out::println);

		System.out.println("***above 20***");
		li.stream().filter(x -> x.intValue() > 20).forEach(System.out::println);

		System.out.println("****square above 20****");

		li.stream().filter(x -> (x * x) > 20).forEach(System.out::println);

		System.out.println("****square count*****");

		Long a = li.stream().filter(x -> (x * x) > 20).count();

		System.out.println("count-->" + a);

		System.out.println("****Space Count****");

		Long b = l.stream().filter(x -> x.equals(" ")).count();

		System.out.println(b);

		System.out.println("***Dublicate and true or false");

		int count = 0;
		for (int i = 0; i < ll.size(); i++) {
			for (int j = i; j < ll.size(); j++) {
				if (ll.get(i) == ll.get(j)) {
					count++;
				}
			}
		}
		if (count > 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("****Remove dublicate *****");
		
		ll.stream().distinct().forEach(System.out::println);
	}
}
