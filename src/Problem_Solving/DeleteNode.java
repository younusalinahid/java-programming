package Problem_Solving;

public class DeleteNode {
    public listNode deleteNode(listNode head, listNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        return head;
    }
}
