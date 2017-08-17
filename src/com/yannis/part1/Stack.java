package com.yannis.part1;

import java.util.Iterator;

/**
 * ����ʵ�ֵ�����ջ
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
	   items[N] = null;//���pop�����Ķ�����ö�������
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

}
