package Problem_Solving;

public class RemoveLinkedListElements {
    public listNode removeElements (listNode head, int valu) {

        if (head == null)
            return null;

        if (head.val == valu)
            return removeElements(head.next, valu);

        head.next = removeElements(head.next, valu);
        return head;
    }
}