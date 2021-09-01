package com.bridgeLabz.stacks;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyLinkedList;
import com.bridgeLabz.linkedList.MyNode;

public class MyStack<K> {
	
	int top = 0;
	MyLinkedList<Integer> stack;
	
	public void push(INode<K> newNode) {
		
		stack.add((INode<Integer>) newNode);
	}

}
