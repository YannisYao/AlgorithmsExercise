package com.yannis.part1;

import com.yannis.stdio.StdOut;
import com.yannis.stdio.StdRandom;

public class DoubleTest {
	
	public static double timeTrial(int N) {
		final int MAX = 1000000;
		int[] a = new int [N];
		for (int i =0;i<N;i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		Stopwatch timer = new Stopwatch();
		//int cnt = ThreeSum.count(a);
		//int cnt = ThreeSumFast.count(a);
		//int cnt = TwoSumFaster.count(a);
		//int cnt = TwoSumFast.count(a);
		int cnt = ThreeSumFaster.count(a);
		//int cnt = FourSum.count(a);
		return timer.elapsedTime();
		
	}
	
	public static void main(String[] args) {
		for(int N = 250;true;N += N) {
			double time = timeTrial(N);
			StdOut.printf("%7d %5.1f\n", N,time);
		}
	}

}
