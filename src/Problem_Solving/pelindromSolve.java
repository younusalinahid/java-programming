package Problem_Solving;

public class pelindromSolve {
    public static void main(String[] args) {

        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(2);
        head.next.next.next = new listNode(1);

        Palindrome solution = new Palindrome();

        boolean ans = solution.ispalindrome(head);
        System.out.println(true);
    }
}