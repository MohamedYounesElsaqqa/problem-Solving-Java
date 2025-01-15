package org.example;

public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solver = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = solver.new ListNode(2);
        l1.next = solver.new ListNode(4);
        l1.next.next = solver.new ListNode(3);


        AddTwoNumbers.ListNode l2 = solver.new ListNode(5);
        l2.next = solver.new ListNode(6);
        l2.next.next = solver.new ListNode(4);

        ListNode result = solver.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
