package Scanner;
import java.util.Scanner;
		public class characters {

	public static void main(String[] args) {
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a character :");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("entered character "+ch+" is vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("entered character "+ch+" is consonant");
		else
			System.out.println("not an alpahbet");
	}

		
		

	}


