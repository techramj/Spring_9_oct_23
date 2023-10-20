package com.seed;

public class Pattern {
	
	public static void main(String[] args) {
		printPyramid2();
	}
	/*
	 
	*
	**
	***
	****
	
	*/
	public static void printRIghtAngleTrianglePatter() {

		for(int row=1;row<=4;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printTrianglePatter() {

		for(int row=1;row<=4;row++) {
			//space
			for(int col=1;col<=4-row;col++) {
				System.out.print(" ");
			}
			
			//star
			for(int col=1;col<=2*row-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printPyramid() {

		for(int row=1;row<=7;row++) {
			//space
			int k = Math.abs(4-row);
			for(int col=1;col<=k;col++) {
				System.out.print(" ");
			}
			
			//star
			int j = 4-k;
			for(int col=1;col<=2*j-1;col++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void printPyramid1() {
		char ch ='A';
		for(int row=1;row<=7;row++) {
			//space
			int k = Math.abs(4-row);
			for(int col=1;col<=Math.abs(4-row);col++) {
				System.out.print(" ");
			}
			
			//star
			int j = 4-k;
			for(int col=1;col<=2*j-1;col++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println("");
		}
	}
	
	
	public static void printPyramid2() {
		char ch ='A';
		for(int row=1;row<=7;row++) {
			//space
			int k = Math.abs(4-row);
			for(int col=1;col<=Math.abs(4-row);col++) {
				System.out.print(" ");
			}
			
			//star
			int j = 4-k;
			for(int col=1;col<=2*j-1;col++) {
				if(col ==1 || col == 2*j-1 ) {
					System.out.print(ch);
					ch++;
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}

}
