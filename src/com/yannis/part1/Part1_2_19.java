package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "5/22/1939";
        Date date =  new Date(str1);
        String str2 = "Turing 5/22/1939 11.99";
        Transaction tran = new Transaction(str2);
        StdOut.println(date);
        StdOut.println(tran);
        
	}

}
