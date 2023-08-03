package interviewStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoArrayList {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(25,5,6,8,10);
	List<Integer> b=Arrays.asList(1,2,3,4,0);
	
	List<List<Integer>> add=Arrays.asList(a,b);
	List<Integer> s=add.stream().flatMap(x->x.stream()).toList();
	System.out.println(s);
	
}
}
