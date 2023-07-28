package Problem_Solving;

public class middleSolving {
    public static void main(String[] args) {

        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);
        head.next.next.next.next = new listNode(5);

        MiddleLinkedList solution = new MiddleLinkedList();
        listNode result = solution.middleNode(head);
        head = head.next;

        listNode current = result;
        while (current != null) {
            System.out.print(current.val + ",");
            current = current.next;
        }
    }
}
