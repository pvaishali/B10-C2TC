package feb18;
import java.util.*;
class  WeightLimitExceeded extends Exception{
	static void WeightLimitExceeded(int x)
	{
		System.out.println(Math.abs(15-x)+"kg:");
	}
}
public class demo4 {
		static void validWeight(int weight) throws WeightLimitExceeded {
		if(weight>15)
		throw new WeightLimitExceeded();
		else
		System.out.println("You are ready to fly!");
		}
		public static void main (String[] args) {
			
		demo4 ob=new demo4();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter x:");
		System.out.println("Enter weight:");
		int x=in.nextInt();
		int y=in.nextInt();
		 WeightLimitExceeded. WeightLimitExceeded(x);
		for(int i=0;i<2;i++){
		try{
		demo4.validWeight(in.nextInt());
		}catch(WeightLimitExceeded e){
		System.out.println(e);
		}
		}
		}
		}


