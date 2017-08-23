package com.yannis.part1;

import java.util.Arrays;

import com.yannis.stdio.StdOut;

/**
 * 不使用二分查找法，时间复杂度为线性复杂度
 * 
 * @author Administrator
 *
 */
public class TwoSumFaster {
	/**
	 * 线性时间复杂度的2-sum 算法
	 * @param a 源数组
	 * @param k sum值
	 * @param i 开始索引
	 * @return 2-sum对数
	 */
	public static int count(int[] a,int k,int i) {
		//Arrays.sort(a);
		/*for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();*/
		int N = a.length;
		int cnt = 0;
		int start = i;
		int end = N - 1;
		while (start < end) {
			if (a[start] + a[end] > k) {
				end--;
			} else if (a[start] + a[end] == k) {// 处理重复情况
				cnt++;
				//去除左右重复
				while(end > start && a[start] == a[++start]);
				while(end > start && a[end] == a[--end]);
			} else {
				start++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -12, -11, -10, -8, -5, -4, -100, 100, -50, 50, -42, 41, -6, 8, -45, 45, -1, -4, 13, 34 };
		Arrays.sort(a);
		StdOut.print(count(a,0,0));

	}

}
