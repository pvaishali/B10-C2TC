package com.java.pratice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to find the factorial:");
int num=sc.nextInt();
int factorial=1;
for(int i=1;i<=num;i++) {
	factorial=factorial*i;
}System.out.println("factorial of"+num+"is"+factorial);
sc.close();
	}

}
