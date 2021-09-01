package com.bridgeLabz.queue;

import org.junit.Assert;
import org.junit.Test;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyNode;
import com.bridgeLabz.stacks.MyStack;

public class QueueTest {

	@Test
	public void stackAddTest() {
		MyQueue<Integer> queue = new MyQueue<>();

		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);

		queue.add(node1);
		queue.add(node2);
		queue.add(node3);
		
		queue.printQueue();
		
		Assert.assertEquals(queue.peak(), node1);

	}
}
