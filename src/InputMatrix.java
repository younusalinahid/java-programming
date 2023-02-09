public class InputMatrix {

    public static void main(String[] args) {

        int[][] number = new int[4][5];
        int k=0;

        //assigning the value to the 2d Arrray
        for (int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                number[i][j] = k;
                k++;
            }
        }

        //printing the elements matrix
        for (int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print(" "+number[i][j]);
            }
            System.out.println();

            }

    }
}
