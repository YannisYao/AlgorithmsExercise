package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println(toBinaryString(2048));

	}
	/**
	 * ʮ����ת������
	 * @param N
	 * @return
	 */
	public static String toBinaryString(int N) {
		String s = "";
		for (int n =N ; n > 0; n /= 2)//ע��������������1/2=0��������ֹ
			s = (n % 2)+s;
		return s;
	}

}
