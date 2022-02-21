package feb18;

public class demo3 {
	static void validate_canVote(int age){
		if(age<18)
			throw new ArithmeticException("you are not an adult!");
		else
		System.out.println("you can vote!");
		}
		public static void main (String[] args) {
		
			validate_canVote(10);
			 validate_canVote(30);
			
			System.out.println("rest of the code..........................");
		}
}
