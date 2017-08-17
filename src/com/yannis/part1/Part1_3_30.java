package com.yannis.part1;

public class Part1_3_30 {

	public Node reverse(Node x) {
		Node first = x;//永远指向剩余节点的首节点
		Node reverse = null;//永远指向结果链表的首节点
		while(first != null) {
			Node second = first.next;//永远指向剩余节点的第二个节点
			first.next =reverse;//这一步是反向的关键，每次切下来的结果节点，都指向上一次的头结点
			reverse = first;//reverse 重置为结果的头结点
			first = second;//迭代
		}
		return reverse;
	}
	/**
	 * 使用递归解答
	 * @param x
	 * @return
	 */
    public Node reverse1(Node x) {
    	Node first = x;
    	if(first == null) return null;
    	if(first.next == null) return first;
    	else {
    		Node second = first.next;
    		Node result = reverse1(second);//先倒序好N-1个链表
    		second.next = first;//然后将N-1个结果链表的最后一个Node指向first
    		first.next = null;//first节点变last，清空next
    		return result;
    	}
    }
	private class Node{
		Object item;
		Node next;
	}
}
