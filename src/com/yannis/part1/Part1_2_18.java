package com.yannis.part1;

import com.yannis.stdio.StdOut;
import com.yannis.stdio.StdRandom;

public class Part1_2_18 {

	
	public static void main(String[] args) {
		Accumulator acc = new  Accumulator();
		int T = Integer.parseInt(args[0]);
		for(int t = 0;t<T;t++) {
			acc.addDataValue(StdRandom.random());
		}
		StdOut.println(acc.mean());
		StdOut.println(acc.var());
		StdOut.println(acc.stddev());
	}
}
