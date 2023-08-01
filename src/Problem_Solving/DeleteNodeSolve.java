package Problem_Solving;

public class DeleteNodeSolve {
    public static void main(String[] args) {

        listNode head = new listNode(4);
        head.next = new listNode(5);
        head.next.next = new listNode(1);
        head.next.next.next = new listNode(9);
        listNode node = head.next;

        DeleteNode solution = new DeleteNode();
        listNode result = solution.deleteNode(head, node);
        head = head.next;

        listNode current = result;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
}
