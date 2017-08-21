package com.yannis.part1;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;
    
    public boolean isEmpty() {
    	return first == null;
    }
    public int size() {
    	return N;
    }
    public void enqueue(Item item) {
    	Node oldlast = last;
    	last  = new Node();
    	last.item = item;
    	if(isEmpty()) first = last;
    	else oldlast.next = last;
    	N++;
    	
    }
    public Item dequeue() {
    	Item item = first.item;
    	Node oldfirst = first;
    	first = first.next;
    	oldfirst.next = null;
    	if(isEmpty()) last = null;
    	N--;
    	return item;
    }
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}

	  private class Node{
		  Item item;
		  Node next;
	  }
	  
	  private class QueueIterator implements Iterator<Item>{
		 private Node index = first;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = index.item;
			index = index.next;
			return item;
		}
		  
	  }
}
