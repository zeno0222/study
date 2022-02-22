public class SwapNodesinPairs {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        head.next.val = 2;
        head.next.next.val = 3;
        head.next.next.next.val = 4;
    }

    public static ListNode swapPairs(ListNode head) {
        /*if(head == null || head.next == null) return head;
        ListNode tmp = head.next.next;
        ListNode newHead = head.next;
        head.next.next = head;
        head.next = swapPairs(tmp);
        return newHead;*/
        
        // Dummy node
        ListNode dummy = new ListNode(0);
        // Point the next of dummy node to the head
        dummy.next = head;
        // This node will be used to traverse the list
        ListNode current = dummy;
        // Loop until we reach to the second last node
        while (current.next != null && current.next.next != null) {
            // First node of the pair
            ListNode first = current.next;
            // Second node of the pair
            ListNode second = current.next.next;
            // Point the next of first node to the node after second node
            first.next = second.next;
            // Now the current node's next should be the second node
            current.next = second;
            // Linking the original second node to the first node
            current.next.next = first;
            // Move the pointer two nodes ahead
            current = current.next.next;
        }
        return dummy.next;
    }
}


