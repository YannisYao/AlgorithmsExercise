package com.yannis.part1;
/**
 * ����Ҫ�������Լ����ʱ�临�Ӷȣ����Բ���ʹ�ù鲢����nlogn��
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
	 * ���Ͼ������Լ�����������Բ�ֵ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
