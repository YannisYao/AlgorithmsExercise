package com.yannis.part1;

import com.yannis.stdio.StdOut;
/**
 * 递归求解链表的最大值
 * @author Administrator
 *
 */
public class Part1_3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Part1_3_28 build = new Part1_3_28();
        Node first  = build.new Node(9);
        Node second = build.new Node(2);
        Node third =  build.new Node(88);
        Node four = build.new Node(102);
        Node five = build.new Node(50);
        Node six = build.new Node(43);
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = six;
        StdOut.println(max(first));
	}
	
	public static int max(Node first) {
		if(first.next == null) return first.t;
		if(first.t<first.next.t)return max(first.next);
		else {
			first.next = first.next.next;
			return max(first);
		}
	}
	
	private class Node{
		int t;
		Node next;
		public Node(int t) {
			this.t = t;
		}
		
	}

}
