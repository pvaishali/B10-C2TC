package feb18;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int divideByZero=5/0;
			System.out.println("rest of the code in try block");
		} catch (ArithmeticException e) {
			System.out.println("AirthmeticException =>" +e.getMessage());
			
		}
		System.out.println("End of program!");
	}

}
