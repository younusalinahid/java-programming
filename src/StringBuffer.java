public class StringBuffer {

    public static void main(String[] args){

        java.lang.StringBuffer sb = new java.lang.StringBuffer("Younus ali");

        System.out.println(sb);

        sb.append(" Nahid ");
        sb.append(82);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);



    }
}
