package com.yannis.part1;

import com.yannis.stdio.StdOut;
/**
 * �����Զ���ȫ�㷨     1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
 * @author Administrator
 *
 */
public class Part1_3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String[] strs = {"1","+","2",")","*","3","-","4",")","*","5","-","6",")",")",")"};
	 Stack<String> s = new Stack<>();
	 int i = 0;
	 while(i < strs.length) {
		 String item = strs[i];
		 if(!item.equals(")"))
			 s.push(item);
		 if(item.equals(")") && !s.isEmpty()) {//������������ջǰ����Ԫ�أ����ϡ���������ϳ�һ��Ԫ�أ���ջ
			 String temp = ")";
			int cout = 0;
			while(!s.isEmpty() && cout < 3) {
				temp = s.pop() + temp;
				cout++;
			}
			 temp = "(" + temp;
			 s.push(temp);
		 }
		 i++;
	 }
    for(String str : s) {
    	StdOut.print(str);
    }
	}

}
