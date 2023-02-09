import java.util.Iterator;

public class ArrayList {


    public static void main(String[] args) {

        java.util.ArrayList<Integer> number = new java.util.ArrayList<>();
        System.out.println("size = "+number.size());

        //addig elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

       //System.out.println(number);

       for (int x : number){
        System.out.print(" "+x);

      /*  Iterator itr = number.iterator();
        while (itr.hasNext()){
            System.out.print(" "+itr.next());
       */
        }
        System.out.println();
        System.out.println("size = "+number.size());

        //Removing elements
        number.remove(2);
        System.out.println("After removing ArrayList contains :"+number);

        number.removeAll(number);
        System.out.println(number);


    }
}
