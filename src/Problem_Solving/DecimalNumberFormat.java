package Problem_Solving;

import java.text.DecimalFormat;

public class DecimalNumberFormat {

    public static void main(String[] args) {

        DecimalFormat ob = new DecimalFormat("0.000");
    double x = 2.9875400;
        System.out.println("x = "+ob.format(x));

    }

}
