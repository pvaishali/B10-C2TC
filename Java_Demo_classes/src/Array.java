import java.util.Arrays;
public class Array {
	public static int getMissingNumber(int[]arr) {
	int n=arr.length;
	int m=n+1;
	int total=m*(m+1)/2;
	int sum=Arrays.stream(arr).sum();
	return total-sum;
}
	public static void main(String[] args) {
				int [] arr= {1,2,3,4,5,6,7,8,9,10,11,12,14};
				System.out.println("the missing num in the array:"+getMissingNumber(arr));
				
					}
				}
			
	


