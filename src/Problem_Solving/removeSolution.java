package Problem_Solving;

public class removeSolution {
    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(1);
        head.next.next = new listNode(2);

        romoveDuplicates solution = new romoveDuplicates();
        listNode result = solution.deleteDuplicates(head);
        head = head.next;

        listNode current = result;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
    }
}
