package com.yannis.part1;

import java.util.Arrays;

/**
 * 求局部最小元素   a[i]<a[i+1] 和 a[i] < a[i-1];
 * @author Administrator
 *
 */
public class Part1_4_18 {
	
	public static int areaMin(int[] a) {
		//Arrays.sort(a);
		int hi = a.length -1;
		int lo = 0;
		if(a.length <3) return -1;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(a[mid] < a[mid+1] && a[mid] < a[mid-1])
				return mid;
			else if(a[mid-1]<=a[mid+1])
				hi = mid -1;
			else 
				lo = mid +1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubq

	}

}
