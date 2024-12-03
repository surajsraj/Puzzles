
class TwoSumLinkedList {

//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//    Example:
//
//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807.

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(getNumber(l1, 0, 1) + getNumber(l2, 0, 1));
    }

    public static int getNumber(ListNode node, int number, int multiplier) {

        if (node == null) {
            return number;
        }

        if (node.val == 0) {
            getNumber(node.next, number, multiplier * 10);
        }

        number = number + (node.val * multiplier);

        return getNumber(node.next, number, multiplier * 10);
    }


    //================================================Run===================================================//

    ListNode b = new ListNode(1);
    ListNode c = new ListNode(0, b);

    ListNode x = new ListNode(2);
    ListNode y = new ListNode(1, x);
    ListNode z = new ListNode(0, y);

    public static void main(String[] args) {
        TwoSumLinkedList twoSumLinkedList = new TwoSumLinkedList();
        addTwoNumbers(twoSumLinkedList.c, twoSumLinkedList.z);
    }
}