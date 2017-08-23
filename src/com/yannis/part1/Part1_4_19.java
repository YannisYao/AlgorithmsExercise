package com.yannis.part1;
/**
 * 这是N*N时间复杂度
 * @author Administrator
 *
 */
public class Part1_4_19 {
	/**
	 * 暴力解法
	 * @param a
	 * @return
	 */
	public static int[] rectMin(int[][] a) {
		int[] point = new int[2];
		int N = a.length;
		if(N < 3) return point;
		int row = 1;
		int col = 1;
		while(row < N-1) {
			if(a[row][col]<a[row+1][col] && a[row][col] < a[row-1][col] && a[row][col]<a[row][col-1] && a[row][col] <a[row][col+1]) {
				point[0] = row;
				point[1] = col;
				break;
			}else {
				if(col == N-2) {
					row++;
					col = 1;
				}else {
					col++;
				}
			}
		}
		return point;
	}
	/**
	 * 使用二分法查找
	 * @param a
	 * @return
	 */
	public static int[] rectMin2(int[][] a) {
		int[] point = new int[2];
		int N = a.length;
		if(N < 3) return point;
		int lo = 0;
		int hi = N-1;
		int col = 1;
		while(lo <= hi&&col<N-1) {
			int mid = lo + (hi - lo)/2;
			if(a[mid][col] < a[mid+1][col] && a[mid][col] < a[mid-1][col]) {
				int y = Part1_4_18.areaMin(a[col]);
				if(y != -1) {
					point[0] = mid;
					point[1] = y;
				}else {
					col++;
				}
			}else if(a[mid-1][col]<=a[mid+1][col])
				hi = mid -1;
			else 
				lo = mid +1;
		}
		
		return point;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
