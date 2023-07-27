package Problem_Solving;

public class RemoveSolving {
    public static void main(String[] args) {

        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(6);
        head.next.next.next = new listNode(3);
        head.next.next.next.next = new listNode(4);
        head.next.next.next.next.next = new listNode(5);
        head.next.next.next.next.next.next = new listNode(6);
        int value = 6;

        RemoveLinkedListElements soution = new RemoveLinkedListElements();
        listNode result = soution.removeElements(head,value);
        head = head.next;

        listNode current = result;
        while (current != null) {
            System.out.print(current.val+ ",");
            current = current.next;
        }
    }
}
