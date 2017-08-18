package com.yannis.part1;

import java.util.Iterator;

public class Part1_3_31<Item> implements Iterable {
	private DoubleNode first;
	private DoubleNode last;
	private int N;

	private class DoubleNode{
		Item item;
		DoubleNode next;
		DoubleNode previous;
	}
	
	private void insertFirst(Item item) {
		DoubleNode oldFirst = first;
		first  =new DoubleNode();
		first.item =item;
		if(isEmpty()) last = first;
		else {
			first.next = oldFirst;
			oldFirst.previous = first;
		}
		N ++;
		
	}
	
	private void insertLast(Item item) {
		DoubleNode oldLast = last;
		last = new DoubleNode();
		last.item = item;
		if(isEmpty()) first = last;
		else {
			oldLast.next = last;
			last.previous = oldLast;
		}
		N ++;
	}
	
	private Item deleteFirst() {
		DoubleNode oldFirst = first;
		Item item = first.item;
		first = first.next;
		oldFirst = null;
		if(first == null)last = null;
		N--;
		return item;
	}
	
	private Item deleteLast() {
		DoubleNode oldLast = last;
		Item item = last.item;
		last = oldLast.previous;
		oldLast = null;
		if(last == null ) first = null;
		N--;
		return item;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
