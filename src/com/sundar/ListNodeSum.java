package com.sundar;

public class ListNodeSum {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode n = null, n1 = null, n2 = null;
		int sum = 0;
		while (l1 != null || l2 != null || sum != 0) {
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			n = new ListNode(sum % 10);
			if (n1 != null) {
				n1.next = n;
				n1 = n;
			} else {
				n1 = n2 = n;
			}
			sum = sum / 10;
		}
		return n2;
	}

	public static void main(String[] args) {

		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;

		ListNode s1 = new ListNode(5);
		ListNode s2 = new ListNode(6);
		ListNode s3 = new ListNode(4);
		s1.next = s2;
		s2.next = s3;

		ListNode l = addTwoNumbers(n1, s1);
		while (l != null) {
			System.out.println(l.val);
			l=l.next;
		}
	}
}
