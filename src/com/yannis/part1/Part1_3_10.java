package com.yannis.part1;

import com.yannis.stdio.StdOut;
/**
 * 这里面包含的1.3.10和1.3.11
 * @author Administrator
 *
 */
public class Part1_3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		String[] input = InfixToPostfix();
		int i =0;
		while(i < input.length) {
			String item = input[i];
			if(!item.equals("+")&&!item.equals("-")&&!item.equals("*")&&!item.equals("/")) stack.push(item);
			if((item.equals("+")||item.equals("-")||item.equals("/")||item.equals("*")) && stack.size()>1) {
				handle(stack,item);
			}
			i++;
		}
		StdOut.println("result:"+stack.pop());

	}
	
	public static void  handle(Stack<String> stack,String item) {
		int val2 = Integer.parseInt(stack.pop());
		int val1 = Integer.parseInt(stack.pop());
		if(item.equals("+")) stack.push(val1+val2+"");
		else if(item.equals("-"))stack.push(val1-val2+"");
		else if(item.equals("*"))stack.push(val1*val2+"");
		else if(item.equals("/"))stack.push(val1/val2+"");
	}
	
	public static String[] InfixToPostfix(){
		String[] strs = {"(","(","1","+","2",")","*","(","(","3","-","4",")","*","(","5","-","6",")",")",")"}; 
		Stack<String> postfix = new Stack<>();
		int i = 0;
		while(/*!StdIn.isEmpty()*/i < strs.length) {
			//String item = StdIn.readString();
			String item = strs[i];
			if(!item.equals(")")) postfix.push(item);
			if(item.equals(")") && postfix.size() > 3) {
				String val2 = postfix.pop();
				String op = postfix.pop();
				String val1 =postfix.pop();
				String x = postfix.pop();
				if(x.equals("("))postfix.push(val1+val2+op);
			}
			i++;
		}
		String temp = "";
		for(String s : postfix) {
			temp += s;
			StdOut.print(s);
		}
		StdOut.println();
		String[] str1s = new String[temp.length()];
		for(int t= 0; t<temp.length();t++) {
			str1s[t] = temp.charAt(t)+ "";
		}
		return str1s;
	}

}
