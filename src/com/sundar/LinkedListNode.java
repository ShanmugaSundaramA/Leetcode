package com.sundar;

import java.util.HashSet;
import java.util.Set;

public class LinkedListNode {

	public static boolean hasCycle(ListNode head) {

		Set<ListNode> set = new HashSet<>();
		if (head == null) {
			return false;
		}
		while (head.next != null) {
			if (set.contains(head)) {
				return true;
			} else {
				set.add(head);
				head = head.next;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		ListNode head1 = new ListNode(2);
		head.next = head1;


		System.out.println(hasCycle(head));

	}
}
