package com.yannis.part1;

import java.util.Iterator;

/**
 * 数组实现的扩容栈
 * @author Administrator
 *
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item> {
	private Item[] items = (Item[]) new Object[1];
	private int N;
	
   public Stack(int cap){
	   items = (Item[]) new Object[cap];
   }
   
   
   
   public Stack() {

   }



public void push(Item item) {
	   if(N == items.length) resize(2*items.length);
	   items[N++] = item;
   }
   
   public Item pop() {
	   Item item = items[--N];
	   items[N] = null;//清空pop出来的对象放置对象游离
	   if(N>0 && N == items.length/4) resize(items.length/2);
	   return item;
   }
   
   public boolean isEmpty() {
	   return N ==0;
   }
   
   public Item peek() {
	   return items[N-1];
   }

   public int size() {
	   return N;
   }
   
   public void resize(int size) {
	   Item[] temp = (Item[]) new Object[size];
	   for(int i = 0;i<N;i++)
		   temp[i] = items[i];
	   items = temp;
   }
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item>{
		private int i = N;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return items[--i];
		}
		
	}
	/**
	 * 拷贝一个String类型栈的副本
	 * @param stack
	 * @return
	 */
	public static Stack<String> copy(Stack<String> stack){
		Stack<String> newStack = new Stack<>();
		String[] strs = new String[stack.size()];
		int i =0;
		for(String s : stack) {
			strs[i++] = stack.pop();
		}
		for(int t = strs.length -1;t >=0 ;t--) {
			newStack.push(strs[t]);
		}
		return newStack;
	}

}
