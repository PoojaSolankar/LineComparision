package com.Bridgelabz;

public class Linecomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparison computation program");
		Integer x1=2, x2=6, y1=4, y2=5;
		Integer c1=2, c2=6, d1=4, d2=5;
		Double AB, CD;
		
		AB = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("Length of line AB :" +AB);
		
		CD = Math.sqrt((c2-c1)^2+(d2-d1)^2);
		System.out.println("Length of line CD :" +CD);
		
		System.out.println(AB.equals(CD));
		
	}
}
