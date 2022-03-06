package com.Equals;
public class EqualsDemo2 {
	public static void main(String[] args) {
/*Long l1=15l;
Long l2=15l;
Double d1=12.8d;
Double d2=13.8d;
System.out.println("l1 and l2 are equal:"+(l1.equals(l2)));	
System.out.println("l1 and l2 are equal:"+(d1.equals(d2)));*/
/*-----------------------------------------------------------------------*/
	/*Boolean b1=true;
	Boolean b2=true;
	Boolean b3=false;
	System.out.println("b1 and b2 are equal:"+(b1.equals(b2)));	
	System.out.println("b1 and b3 are equal:"+(b1.equals(b3)));	
	System.out.println("b2 and b3 are equal:"+(b2.equals(b3)));*/
/*--------------------------------------------------------------*/
		String s1=new String("VAISHALI");
		String s2=new String("VAisHALI");
		String s3=null;
		String s4="VAISHALI";
		System.out.println("s1 and s2 are equal:"+(s1.equals(s2)));
		System.out.println("s1 and s4 are equal:"+(s1.equals(s4)));
		System.out.println("s2 and s4 are equal:"+(s2.equals(s4)));
		System.out.println("s4 and s3 are equal:"+(s4.equals(s3)));
	}
}
