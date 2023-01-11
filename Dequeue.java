package com;


public class StackList <T> {
	
int size;
	
  Node<T> top;   
  

	
	public void push(T newData) {
		Node<T> newNode = new Node<>();
		newNode.data = newData;
		newNode.next = null;
		newNode.next = top;
		top = newNode;
	}
	
	
	/**
	 * Show method uses to display the elements
	 *using while condition to check next node is null or not
	 *loop will be active still it reaches the null
	 * @param <T>
	 */
	
	public void show() {
		
		Node<T> currNode = top;
		while (currNode.next != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		System.out.println(currNode.data);
	}	
	
	/**
	 * @author rekha
	 * it peek or Retrieves the element, but it don't remove element
	 * @param <T>
	 */
	
	public T peek() {
		final Node<T> f = top;
		return (f == null) ? null : f.data;
	}
	
	/**
	 * Pops or removes the elements
	 * Prints stack is empty if all the stack is empty
	 *if not , it retrieves top element and removes it and continous still the stack the is empty
	 * @param <T>
	 */
	
	public void pop() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			System.exit(0);
		}
		top=top.next;
		size--;
	}
	
	/**
	 * checks weather stack is empty or not
	 * @return boolean
	 */
	
	public boolean isEmpty() {
		
		return size ==0;
	}
	
	
}
