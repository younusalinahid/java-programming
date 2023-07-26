package Problem_Solving;

public class SwapSolving {
    public static void main(String[] args) {

        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);

        SwapNodesInPairs sotution = new SwapNodesInPairs();
        listNode result = sotution.SwapNode(head);
        head = head.next;

        listNode current = result;
        while (current != null) {
            System.out.print(current.val+ "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
