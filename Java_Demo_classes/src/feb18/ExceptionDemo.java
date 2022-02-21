package feb18;
import java.util.Scanner;


class Exception{
	static void	function(int a,int b) {
		int[] arr={1,2,3};
		System.out.println(10/a);
try {
	System.out.println(arr[b]);
}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("rest of the code");
}}}
public class ExceptionDemo {
	public static void main (String[] args) {
		
			Scanner in=new Scanner(System.in);
				System.out.println("enter the number");
				int a=in.nextInt();
				int b=in.nextInt();
				Exception.function(a, b);
					for(int i=0;i<3;i++){	
						try {
				Exception.function(in.nextInt(),in.nextInt());
						}
				catch(ArithmeticException e) {
						System.out.println("can't divide by zero");
						}
catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Out of bounds!");
						}			
			
}}}