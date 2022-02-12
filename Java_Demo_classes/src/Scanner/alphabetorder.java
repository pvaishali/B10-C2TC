package Scanner;
import java.util.Scanner;
public class alphabetorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        //User will be asked to enter the count of strings 
        System.out.print("Enter number of strings:");
        count = scan.nextInt();
        
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        //User is entering the strings and they are stored in an array
        System.out.println("Enter the strings:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order :");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + " ");
        }
	}

}
