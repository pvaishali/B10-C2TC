package feb16;
class A{
	int a=19;
	final void m1(){
		a=20;
		System.out.println("print the value a:" +a);
		}
void m2() {
	System.out.println("method 2");
}
void m2(String s) {
}
}
public class final1 {
   //@override
void m2() {
	System.out.println("method 2 of final1");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		final1 fd= new final1();
a.m1();
a.m2();
fd.m2();
}
}
