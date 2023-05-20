public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "MD";
        names[1] = "Younus";
        names[2] = "Ali";
        names[3] = "Nahid";

        //for loop
        /* for (int i=0; i<5; i++){
            System.out.println(names[i]);
        }
         */
        //for each loop
        for (String x : names){
            System.out.println(x);
        }
    }
}
