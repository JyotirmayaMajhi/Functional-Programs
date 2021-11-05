package com.bridgelabz.array;

import java.util.Scanner;
public class Two_D_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M;
		System.out.println("Print M");
		M = sc.nextInt();
		
		int N;
		System.out.println("Print N");
		N = sc.nextInt();
		int [][] arr = new int[M][N];
		
		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr.length;j++) {
				
				int mul = M*N;
				System.out.print("  "+mul);
			}
		}
	}

}
