public class MathDemo {
    public static void main(String[] args) {

        int x = 2, y = 3;

        int max = Math.max(x,y);
        System.out.println("Maximum"+max);

        int min = Math.min(x,y);
        System.out.println("minimum"+min);

        int absolute = Math.abs(y);
        System.out.println("Absolute of y = "+absolute);

        double power = Math.pow(x,y);
        System.out.println("x to the power y = "+power);

        double round = Math.round(8.5f); //near integer number
        System.out.println("Round of 8.8 = "+round);

        double pi = Math.PI;
        System.out.println("pi = "+pi);




    }

}
