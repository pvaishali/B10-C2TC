package basics;
public class Alphabetical_order {

	public static void main(String[] args) {

		        // storing input in variable
		        int n = 8;
		        
		        // create string array called names
		        String names[]
		            = { "Rahul", "Abhi", "Ganesh", "Zom" , "Vaishali" , "Latchu" , "Yamini" , "Paavi"};
		        String temp;
		        for (int i = 0; i < n; i++) {
		            for (int j = i + 1; j < n; j++) {
		                
		                // to compare one string with other strings
		                if (names[i].compareTo(names[j]) > 0) {
		                    // swapping
		                    temp = names[i];
		                    names[i] = names[j];
		                    names[j] = temp;
		                }
		            }
		        }
		        
		        // print output array
		        System.out.println(
		            "The names in alphabetical order are: ");
		        for (int i = 0; i < n; i++) {
		            System.out.println(names[i]);
		        }
		    }
		  
			  
		    {
		        // storing input in variable
		        int n = 8;
		        
		        // create string array called names
		        String names[]
		            = { "Rahul", "Abhi", "Ganesh", "Zom" , "Vaishali" , "Latchu" , "Yamini" , "Paavi" };
		        String temp;
		        for (int i = 0; i < n; i++) {
		            for (int j = i + 1; j < n; j++) {
		                
		                // to compare one string with other strings
		                if (names[i].compareTo(names[j]) > 0) {
		                    // swapping
		                    temp = names[i];
		                    names[i] = names[j];
		                    names[j] = temp;
		                }
		            }
		        }
		        
		        // print output array
		        System.out.println(
		            "The names in alphabetical order are: ");
		        for (int i = 0; i < n; i++) {
		            System.out.println(names[i]);
		        }
		    }
		}

