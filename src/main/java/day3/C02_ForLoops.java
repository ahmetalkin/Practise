package day3;

import java.util.Scanner;

public class C02_ForLoops {
    public static void main(String[] args) {

        /*

        - Kullanıcıdan 5 sayı girmesini isteyin.

        - Bu sayılardan birler basamağı 7 veya 9 olanlar hariç, sayıların toplamını hesaplayın.

        1
        2
        19
        22
        47
        --> 25
 */

        Scanner input = new Scanner(System.in);


        int toplam = 0;

        for (int i =1 ; i<6 ; i++){

            System.out.println("bir sayi giriniz");
            int sayilar = input.nextInt();

            if(sayilar%10==7 || sayilar%10==9){

            }else {
                toplam = toplam + sayilar;
            }
        }
        System.out.println(toplam);
        System.out.println("*****************");
        //---------------------------------

        //2.yol

        int toplamm = 0;

        for (int i=0; i<5; i++){

            System.out.println("Bir sayi giriniz.");
            int sayi = input.nextInt();

            if (sayi%10 == 7 || sayi%10 == 9){
                continue;   //bu daha iyi kod
            }

            toplamm = toplamm + sayi; // toplam += sayi

        }

        System.out.println("Toplam: "+ toplamm);








    }
}
