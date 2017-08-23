package com.yannis.part1;

import com.yannis.stdio.StdOut;
import com.yannis.stdio.StdRandom;

/**
 * �����ʱ�����ݽṹ
 * @author Administrator
 *
 */
public class Stopwatch {
	private final long start;

	public Stopwatch() {
		start = System.currentTimeMillis();
	}
	
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start)/1000.0;
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int[] a = new int[N];
		for(int i = 0; i < N;i++)
			a[i] = StdRandom.uniform(-1000000,1000000);
		Stopwatch timer = new Stopwatch();
		//int cnt = ThreeSum.count(a);
		int cnt = ThreeSumFaster.count(a);
		double time = timer.elapsedTime();
		StdOut.println(cnt + " triples " + time + " seconds");
		
	}
}
