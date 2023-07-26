package Problem_Solving;

import java.util.LinkedList;

public class SwapSolving {
    public static void main(String[] args) {

        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);

        SwapNodesInPairs sotution = new SwapNodesInPairs();
        listNode result = sotution.SwapNode(head);
        System.out.println(2143);


    }
}
