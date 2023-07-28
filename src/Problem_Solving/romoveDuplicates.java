package Problem_Solving;

public class romoveDuplicates {
    public listNode deleteDuplicates(listNode head) {
        listNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }
}
