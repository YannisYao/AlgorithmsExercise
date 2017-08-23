package com.yannis.part1;

import java.util.Arrays;

public class Part1_4_17 {
    public static double[] absMin(int[] a) {
    	double[] resurt = new double[2];
    	Arrays.sort(a);
    	double mintemp = Double.MAX_VALUE;
    	for(int i =0;i<a.length;i++) {
    		if(Math.abs(a[i]-a[i+1]) < mintemp) {
    			mintemp = Math.abs(a[i]-a[i+1]);
    			resurt[0] = a[i];
    			resurt[1] = a[i+1];
    		}
    	}
    	return resurt;
    		
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
