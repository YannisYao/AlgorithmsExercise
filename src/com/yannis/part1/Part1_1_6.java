package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int f = 0;
     int g = 1;
     for (int i =0;i<=15;i++) {
    	 StdOut.println(f);
    	 f= f + g;
    	 g = f - g;
     }
	}

}
