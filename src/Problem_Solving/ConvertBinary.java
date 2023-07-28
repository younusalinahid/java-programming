package Problem_Solving;

public class ConvertBinary {
    public int getDecimalValue (listNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2;
            result = result + head.val;
            head = head.next;
        }
        return result;
    }
}
