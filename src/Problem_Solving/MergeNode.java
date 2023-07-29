package Problem_Solving;

public class MergeNode {
    public listNode mergeNodes(listNode head) {

        listNode temp = head;
        while(temp != null) {
            if(temp.next.val != 0) {
                temp.val += temp.next.val;
                temp.next = temp.next.next;
            }
            else {
                temp.next = temp.next.next;
                temp = temp.next;
            }
        }
        return head;
    }
}
