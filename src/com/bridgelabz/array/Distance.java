package com.bridgelabz.array;
import java.util.Scanner;
public class Distance {

	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println("x");
		int x=0;
		x = sc.nextInt();
		
		System.out.println("y");
		int y=0;
		y = sc.nextInt();
	
		int [][] arr = new int[x][y];
		
		double distance = Math.sqrt((x*x)+(y*y));
		System.out.println("Distance from (0,0) to (" + x + ", " + y + ") is " +distance);
                
                
	}

}
