package Problem_Solving;
public class PowerofTwo {
    public static void main(String[] args) {

        int n = 16;
        for(int i=0; i<50; i++){
            if(Math.pow(2,i) == n){
                System.out.println(true);
            }
        }
    }
}
