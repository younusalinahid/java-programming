public class UnaryIncDec {
    public static void main(String[] args) {

        int x = 20, y;

        y = x++; //post increment
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);

        y = ++x; //pre increment
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);

        y = x--;//pre Decrement
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);

        y = --x;
        System.out.println("y = "+y);

    }
}
