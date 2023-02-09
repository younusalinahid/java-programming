public class StringBuilder {
    public static void main(String[] args) {

        java.lang.StringBuilder str = new java.lang.StringBuilder("Nahid");

        System.out.println("str = "+str);

        str.append(" Ali");
        str.append(" 82");

        System.out.println("str = "+str);

        str.reverse();
        System.out.println(str);
    }
}
