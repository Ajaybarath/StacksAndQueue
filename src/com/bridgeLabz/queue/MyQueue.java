package com.bridgeLabz.queue;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyLinkedList;

public class MyQueue<K> {

	MyLinkedList<Integer> queue;

	MyQueue() {
		queue = new MyLinkedList<>();
	}

	public void add(INode<K> newNode) {
		
		queue.append((INode<Integer>) newNode);
	}
	
	public INode<K> peak() {
		return (INode<K>) queue.head;
	}
	
	public void printQueue() {
		queue.printNode();
	}
}
