import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumofDiamogonalElements = 0;
        int sumofUperlElements = 0;
        int sumofLowerlElements =0;

        //Matrix input
        for (int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                A[row][col] = input.nextInt();
            }
        }

        //diagonal,uper,lower
        for (int row=0; row<3; row++){
            for(int col=0; col<3; col++){

                if (row==col){
                    sumofDiamogonalElements = sumofDiamogonalElements + A[row][col];
                }
                if (row<col){
                    sumofUperlElements = sumofUperlElements + A[row][col];
                }
                if (row>col){
                    sumofLowerlElements = sumofLowerlElements + A[row][col];
                }


            }
        }
        System.out.println("sum of diagonal elements : "+sumofDiamogonalElements);
        System.out.println("sum of upper elements : "+sumofUperlElements);
        System.out.println("sum of lower elements : "+sumofLowerlElements);




    }
}
