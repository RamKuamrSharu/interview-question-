package interviewStream;

public class child extends Parent {
	public String m1() {
		return "world";
	}
public static void main(String[] args) {
	Parent p=new Parent();
	child c=new child();
	Parent p1=new child();
//	child c1=new Parent();
	child c1=(child)p1;
	System.out.println(p.m1());
	System.out.println(c.m1());
	System.out.println(p1.m1());
	System.out.println(c1.m1());
    
}
}
