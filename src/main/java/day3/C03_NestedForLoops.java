package day3;

public class C03_NestedForLoops {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int sayi =5;

        for (int i = 0; i <sayi ; i++) {

            for (int j =0; j<i+1 ; j++){
                System.out.print("* ");

             }
            System.out.println(" ");
        }

            for (int i=sayi-1 ; i>0 ; i--){

                for(int l=0 ; l<i ; l++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }







    }
}
