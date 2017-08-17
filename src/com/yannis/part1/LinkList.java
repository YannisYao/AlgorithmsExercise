package com.yannis.part1;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
	private Node first;
	private Node last;
	int N;
	private class Node{
		T t;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}
    public int size() {
    	return N;
    }
    
    public void enqueue(T t) {
    	Node oldLast = last;
    	last = new Node();
    	last.t = t;
    	last.next = null;
    	/*if(oldLast != null) oldLast.next = last;
    	if(first == null) first = last;*/
       //����ʹ��һ�´����滻
    	if(isEmpty()) first = last;
    	else oldLast.next = last;
    	N++;
    }
    /**
     * ʹ��FIFOԭ��
     * @return
     */
    public T dequeue() {
    	/*Node oldFirst = first;
    	T t = oldFirst.t;*/
    	T t = first.t;
    	first = first.next;
    	if(isEmpty()) last = null;
    	//oldFirst = null;��һ����˸о�����һ���Ͻ�
    	N --;
    	return t;
    }
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkListIterator();
	}
	
	private class LinkListIterator implements Iterator<T>{
		private Node i = first;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i != null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T t = i.t;
			i = i.next;
			return t;
		}
		
	}

}
