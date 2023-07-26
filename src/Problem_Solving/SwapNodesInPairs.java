package Problem_Solving;

public class SwapNodesInPairs {

    public listNode SwapNode (listNode head){

        if (head == null || head.next == null) {
            return head;
        }
        listNode first = head;
        listNode second = head.next;
        first.next = SwapNode(second.next);
        second.next = first;
        return second;
    }
}
