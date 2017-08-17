package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(args[0]);
		while(N > 0) {
			stack.push(N % 2);
			N /= 2;
		}
		for(int d : stack) {
			StdOut.print(d);
		}
		StdOut.println();

	}

}
