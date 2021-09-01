package com.bridgeLabz.stacks;

import java.util.Stack;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyLinkedList;
import com.bridgeLabz.linkedList.MyNode;

public class MyStack<K> {
	
	int top = 0;
	MyLinkedList<Integer> stack;
	
	MyStack() {
		stack = new MyLinkedList<>();
	}
	
	public static void main(String args[]) {

		MyStack<Integer> mstack = new MyStack<>();

		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);

		mstack.push(node3);
		mstack.push(node2);
		mstack.push(node1);
		
		mstack.printStack();
		
		mstack.head();
		mstack.pop();
		mstack.head();
		
		mstack.printStack();
	}
	
	public void push(INode<K> newNode) {
		
		stack.add((INode<Integer>) newNode);
	}

	public INode<K> pop() {
		return (INode<K>) stack.pop();
	}
	
	public INode<K> head() {
		return (INode<K>) stack.head;
	}
	
	public void printStack() {
		stack.printNode();
	}
}
