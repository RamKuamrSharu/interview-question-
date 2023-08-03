package interviewStream;

public class Single {
static Single s;
private Single() {
	
}
public static Single createobject() {
if(s==null) {
	s=new Single();
}
return s;
}
public void samp() {
	System.out.println("hi");
}
public void sam() {
	System.out.println("hello");
}
public static void main(String[] args) {
	Single s1= createobject();
	s1.samp();
	Single s2=createobject();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	s2.sam();
}
}
