package day2;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        1. Kullanıcıdan bir sayı alın.
        2. Ternary kullanarak,
            - Girilen sayı çift ise konsola "Çift Sayı" yazdırın.
            - Girilen sayı tek ise, sayıyı 3 arttırarak konsola yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi = input.nextInt();

        Object result =  (sayi %2 == 0) ? ("Çift Sayi") : (sayi+3);
        System.out.println(result);

        // 2. Yol
        System.out.println(sayi%2 == 0 ? "Çift Sayı" : sayi+3);






    }
}
