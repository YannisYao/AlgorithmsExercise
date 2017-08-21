package com.yannis.part1;
/**
 * �ı��༭��������ʹ��˫ջ�ֱ��¼�����ߣ������ұߵĽڵ�
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
