package org.test;

public class Swap {

	public static void main(String[] args) {
		
		
		
		int a[] = {1,2,5};
		
		int b[] = {3,6,7};
		
		int temp[]= {};
		
		System.out.println("Before swapping"+a);
		System.out.println("After swapping"+b);
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("After Swapping" +a);
		
		System.out.println("After Swapping "+b);
		
	}
}
