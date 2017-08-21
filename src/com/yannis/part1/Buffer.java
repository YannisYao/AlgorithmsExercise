package com.yannis.part1;
/**
 * 文本编辑缓冲器，使用双栈分别记录光标左边，与光标右边的节点
 * @author Administrator
 *
 */
public class Buffer {
	private Stack<Character> left;
	private Stack<Character> right;
	public Buffer() {
		left = new Stack<>();
		right = new Stack<>();
	}
	
	public int size() {
		return left.size() + right.size();
	}
   
	public void insert(char c) {
		left.push(c);
	}

	public char delete() {
		char c = left.pop();
		return c;
	}
	
	public void left(int k) {
		int count = 0;
		while(count < k && left.size() != 0) {
			right.push(left.pop());
			count++;
		}
	}
	
	public void right(int k) {
		int count = 0;
		while(count < k && right.size() != 0) {
			left.push(right.pop());
			count++;
		}
	}
}
