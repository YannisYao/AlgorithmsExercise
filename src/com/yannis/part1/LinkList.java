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
       //可以使用一下代码替换
    	if(isEmpty()) first = last;
    	else oldLast.next = last;
    	N++;
    }
    /**
     * 使用FIFO原则
     * @return
     */
    public T dequeue() {
    	/*Node oldFirst = first;
    	T t = oldFirst.t;*/
    	T t = first.t;
    	first = first.next;
    	if(isEmpty()) last = null;
    	//oldFirst = null;这一句个人感觉比上一句严谨
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
