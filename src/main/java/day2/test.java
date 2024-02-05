package day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

      /*  1. Kullanıcıdan bir sayı alın.
        2. Ternary kullanarak,
        - Girilen sayı çift ise konsola "Çift Sayı" yazdırın.
                - Girilen sayı tek ise, sayıyı 3 arttırarak konsola yazdırın.
                */

        Scanner sayi = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a = sayi.nextInt();
        int b = sayi.nextInt();

        System.out.println(a==b ? ("sayılar eşit") : (a<b ? b*b : a*a));



/*
        1. Kullanıcıdan iki sayı alın.
        2. Ternary kullanarak,
            - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
            - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.
         */





    }
}
