package com.yannis.part1;

import com.yannis.stdio.In;
import com.yannis.stdio.StdOut;

public class Part1_2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = readInts(args[0]);
		for(int i =0;i<ints.length;i++)
			StdOut.println(ints[i]);

	}
	
	public static int[] readInts(String name) {
		In in = new In(name);
		String input = in.readAll();
		String[] words = input.split("\\s+");
		int[] ints = new int[words.length];
		for(int i = 0;i<words.length;i++)
			ints[i] = Integer.parseInt(words[i]);//这里严谨的状态需要处理数据转换异常
		return ints;
	}

}
