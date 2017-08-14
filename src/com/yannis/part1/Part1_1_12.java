package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		for(int i =0 ;i < 10;i++)
			a[i] = 9-i;
		for(int i =0 ;i<10;i++)
			a[i] = a[a[i]];
		for(int i = 0; i< 10;i++)
			StdOut.println(i);

	}

}
