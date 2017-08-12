package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();
		main2();
		main3();
		

	}

	public static void main1() {
		double t = 9.0;
		while(Math.abs(t-9.0/t) > .001)
			t = (9.0/t +t)/2.0;
		StdOut.printf("%.5f\n", t);
	}
	
	public static void main2() {
		int sum = 0;
		for(int i = 1; i< 1000;i++)
			for(int j =0; j< i;j++)
				sum++;
		StdOut.println(sum);
	}
	
	public static void main3() {
		int sum =0;
		 for (int i =1;i< 1000;i *=2)
			 for(int  j =0;j < 1000;j++)
				 sum++;
		 StdOut.println(sum);
	}
}
