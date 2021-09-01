package com.bridgeLabz.stacks;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyNode;

public class StackTest {

	@Test
	public void stackAddTest() {
		MyStack<Integer> stack = new MyStack<>();

		INode<Integer> node1 = new MyNode(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);

		stack.push(node3);
		stack.push(node2);
		stack.push(node1);

	}
}
