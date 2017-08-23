package com.yannis.part1;
/**
 * 这题要求是线性级别的时间复杂度，所以不能使用归并排序（nlogn）
 * @author Administrator
 *
 */
public class Part1_4_16 {
	public static double[] absMax(int[] a) {
		double[] num = new double[2];
		double max= a[0];
		double min =a[0];
		int N = a.length;
		for(int i =0;i<N-1;i++) {
			if(a[i+1]>a[i]) {
				max = a[i+1];
			}
			if(a[i+1]<a[i])
				min = a[i+1];
		}
		num[0] = max;
		num[1] = min;
		return num;
		
	}

	/**
	 * 以上就是线性级别的求最大绝对差值
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
