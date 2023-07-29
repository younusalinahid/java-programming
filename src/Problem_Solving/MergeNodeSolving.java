package Problem_Solving;

public class MergeNodeSolving {
    public static void main(String[] args) {

        listNode head = new listNode(0);
        head.next = new listNode(3);
        head.next.next = new listNode(1);
        head.next.next.next = new listNode(0);
        head.next.next.next.next = new listNode(4);
        head.next.next.next.next.next = new listNode(5);
        head.next.next.next.next.next.next = new listNode(2);
        head.next.next.next.next.next.next.next = new listNode(0);

        MergeNode solution = new MergeNode();
        listNode result = solution.mergeNodes(head);
        head = head.next;

        listNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
