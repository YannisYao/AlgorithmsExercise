package com.yannis.part1;

import java.util.Iterator;
/**
 * 自动扩容式队列
 * @author Administrator
 *
 * @param <T>
 */
public class ResizingArrayQueue<T> implements Iterable<T> {
	private T[] ts;
	private int first;
	private int last;
	
	

	public ResizingArrayQueue(int cap) {
		ts = (T[]) new Object[cap];
	}

	public ResizingArrayQueue() {
		ts = (T[]) new Object[1];
	}

	public void enqueue(T t) {
		if(last == ts.length) resize(ts.length*2);
		ts[last++] = t;
	}
	
	public T dequeue() {
		T t = ts[first];
		ts[first] = null;
		first++;
		if(first > 0 && size() == ts.length/4)resize(ts.length/2);
		return t;
	}
	public boolean isEmpty() {
		return last-first == 0;
	}
	public int  size() {
		return last - first;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ResizingQueueIterator();
	}

	private void resize(int size) {
		T[] newTs = ts;
		int oldsize = size();
		ts = (T[]) new Object[size];
		for(int i = first,t = 0 ; i < last;i++,t++) {
			ts[t] = newTs[i];
		}
		first = 0;
		last = oldsize;//重新引导索引
	}
	
	private class ResizingQueueIterator implements Iterator<T>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return size()>0;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return dequeue();//这里有问题，不能直接dequeue不然会删除掉元素
		}
		
	}
}
