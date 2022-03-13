package com.generics;

public class GenericsDemo1 {
	public static <P> void PrintArray(P[] inputArray)
    {
    	for(P element:inputArray) 
    	{
    		System.out.printf("%s",element);
    	}
    	System.out.println();
    }
    public static void main(String[] args) 
    {
		Integer[] intArray= {1,2,6};
		Double[] doubleArray= {1.1,1.5,1.6};
		Character[] charArray= {'a','b','k','p'};
		System.out.println("\nArray integer Array Contains");
		PrintArray(intArray);
		System.out.println("\nArray double Array Contains");
		PrintArray(doubleArray);
		System.out.println("\nArray character Array Contains");
		PrintArray(charArray);
	}
}
