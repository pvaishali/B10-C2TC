package com.java.pratice;
class GCD1{
static void gcdmethod(int a,int b) {
	int gcd=1;
	for(int i=1;i<=a&&i<=b;i++) {
		if(a%i==0 && b% i==0) {
			gcd=i;
		}
	}System.out.println(" GCD of "+a+" and "+b+" is :"+gcd);
}}
public class finfgcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GCD1.gcdmethod(23, 24);
	}

}
