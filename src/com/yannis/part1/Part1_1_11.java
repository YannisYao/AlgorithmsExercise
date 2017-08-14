package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] booleans = {{true,false,true},{false,true,false},{false,true,false}};
		for(int i =0;i<booleans.length;i++) {
				StdOut.print("\t");
				StdOut.print(i+1);
		}
		StdOut.println();
		for(int i = 0; i< booleans.length;i++) {
			StdOut.print(i+1);
			StdOut.print("\t");
			for(int j = 0;j<booleans[i].length;j++) {
				if(booleans[i][j]) StdOut.print("*");
				else StdOut.print(" ");
				StdOut.print("\t");
			}
			StdOut.println();
		}

	}

}
