package com.yannis.part1;

import java.util.Iterator;
/**
 * 实现一个环形队列，并实现迭代器
 * @author Administrator
 *
 * @param <Item>
 */
public class CircleQueue<Item> implements Iterable<Item>{
	private Node first;
	private Node last;
	int N;
	
	private class Node{
		Item item;
		Node next;
	}
    public void enqueue(Item item) {
    	Node oldLast = last;
    	last = new Node();
    	last.item = item;
    	if(isEmpty()) first = last;
    	else oldLast.next = last;
    	last.next = first;//只要队列不为空，last.next = first;
    	N ++;
    }
    public Item dequeue() {
    	Item item = first.item;
    	first = first.next;
    	if(isEmpty()) last = null;
    	else last.next = first;
    	N--;
    	return item;
    }
    public int size() {
    	return N;
    }
    public boolean isEmpty() {
    	return first == null;
    }
	@SuppressWarnings("unchecked")
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new CircleQueIterator();
	}
	
	private class CircleQueIterator implements Iterator<Item>{
       private Node i = first;
       private boolean one = true;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !isEmpty() && (i != first || one);//避免死循环
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			one = false;
			Item item = i.item;
			i = i.next;
			return item;
		}
		
	}

}
