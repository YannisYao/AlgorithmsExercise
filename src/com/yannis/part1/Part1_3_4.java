package com.yannis.part1;

import com.yannis.stdio.StdIn;
import com.yannis.stdio.StdOut;
/**
 * 识别括号是否配对
 * @author Administrator
 *
 */
public class Part1_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Stack<String> s = new Stack<>(20);
		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(item.equals("(") || item.equals("[") || item.equals("{")) {
				s.push(item);
			}
			
			if(item.equals(")") && (s.isEmpty() || !s.pop().equals("("))) {
				flag = false;
				break;
			}else if(item.equals("]") && (s.isEmpty() || !s.pop().equals("["))) {
				flag = false;
				break;
			}else if(item.equals("}") && (s.isEmpty() || !s.pop().equals("{"))) {
				flag = false;
				break;
			}
		}
		StdOut.println("result:"+(flag && s.isEmpty()));
	}

}
