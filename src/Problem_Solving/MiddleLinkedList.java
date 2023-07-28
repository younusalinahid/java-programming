package Problem_Solving;

public class MiddleLinkedList {
    public listNode middleNode(listNode head) {
         listNode slow = head;
         listNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
