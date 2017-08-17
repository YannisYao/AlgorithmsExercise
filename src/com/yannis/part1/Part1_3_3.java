package com.yannis.part1;

import com.yannis.stdio.StdIn;
import com.yannis.stdio.StdOut;

public class Part1_3_3 {

	public static void main(String[] args) {
		//String[] strs = {"to","be","or","not","to","-","be","-","-","that","-","-","-","is"};
		//int i =0;
		
       Stack<String> s = new Stack<String>(100);
       while(!StdIn.isEmpty()) {
    	   String item = StdIn.readString();
    	   //String item = strs[i];
    	   if(!item.equals("-")) s.push(item);
    	   else if(!s.isEmpty()) StdOut.print(s.pop()+" ");
    	  // i++;
       }
       StdOut.println("(" + s.size() + " left on stack)");
	}

}
