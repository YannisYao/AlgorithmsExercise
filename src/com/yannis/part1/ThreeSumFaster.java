package com.yannis.part1;

import java.util.Arrays;

import com.yannis.stdio.StdOut;

public class ThreeSumFaster {
	
	public static int count(int[] a) {
		int N = a.length;
		int sum = 0;
		Arrays.sort(a);
		for(int i =0 ; i< N;i++) {
			if(i == 0 || a[i] != a[i-1])//ШЅжи
			   sum += TwoSumFaster.count(a,-a[i],i+1);
			else continue;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1,2,-3 };
		StdOut.print(count(a));
	}

}
