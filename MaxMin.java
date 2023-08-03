package interviewStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(1,5,6,8,7,3,8);
	List<Integer> aa=Arrays.asList(10,11,12,14,17);
	List<List<Integer>>aaa=Arrays.asList(a,aa);
	List<Integer>a1=aaa.stream().flatMap(x->x.stream()).toList();
	System.out.println(a1);
	Integer b=a.stream().min(Comparable::compareTo).get();
	System.out.println(b);
	Integer c=a.stream().max(Comparable::compareTo).get();
	System.out.println(c);
	Boolean d=a.stream().anyMatch(x->x==26);
	System.out.println(d);
	Integer  e=a.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
	System.out.println(e);
}
}
