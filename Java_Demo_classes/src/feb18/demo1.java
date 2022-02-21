package feb18;

public class demo1 {

	public static void main(String[] args) {
		
		
		int a=10;
		for(int i=3;i>=0;i--){
		try {
			System.out.println(a/i);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("e");
			System.out.println("it is an airthmetic exception program");
			}
}
	}}