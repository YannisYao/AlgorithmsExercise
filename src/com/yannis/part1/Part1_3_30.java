package com.yannis.part1;

public class Part1_3_30 {

	public Node reverse(Node x) {
		Node first = x;//��Զָ��ʣ��ڵ���׽ڵ�
		Node reverse = null;//��Զָ����������׽ڵ�
		while(first != null) {
			Node second = first.next;//��Զָ��ʣ��ڵ�ĵڶ����ڵ�
			first.next =reverse;//��һ���Ƿ���Ĺؼ���ÿ���������Ľ���ڵ㣬��ָ����һ�ε�ͷ���
			reverse = first;//reverse ����Ϊ�����ͷ���
			first = second;//����
		}
		return reverse;
	}
	/**
	 * ʹ�õݹ���
	 * @param x
	 * @return
	 */
    public Node reverse1(Node x) {
    	Node first = x;
    	if(first == null) return null;
    	if(first.next == null) return first;
    	else {
    		Node second = first.next;
    		Node result = reverse1(second);//�ȵ����N-1������
    		second.next = first;//Ȼ��N-1�������������һ��Nodeָ��first
    		first.next = null;//first�ڵ��last�����next
    		return result;
    	}
    }
	private class Node{
		Object item;
		Node next;
	}
}
