package com.bridgelabz.array;

import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a:");
		double a = sc.nextDouble();
		System.out.println("b:");
		double b = sc.nextDouble();  
		System.out.print("c:");  
		double c = sc.nextDouble();
		
		double d = b*b-4*a*c;
		
		if(d>0.0) {
			double r1 = (-b + Math.sqrt(d))/(2*a);
			double r2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		System.out.println("Delta"+d);
		

	}

}
