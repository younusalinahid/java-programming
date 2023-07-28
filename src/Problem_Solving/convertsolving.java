package Problem_Solving;

public class convertsolving {
    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(0);
        head.next.next = new listNode(1);

        ConvertBinary solution = new ConvertBinary();
        int ansr = solution.getDecimalValue(head);
        head = head.next;

        System.out.println(ansr);
    }
}
