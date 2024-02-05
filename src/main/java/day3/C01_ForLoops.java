package day3;

import java.util.Scanner;

public class C01_ForLoops {
    public static void main(String[] args) {


/*
        Kullanicidan bir kelime girdisi isteyin.
        Loop, Kelimede c harfine rastlanana kadar devam etsin
        a harflerinin sayisi hesaplansin

       aaabaaacaa
       */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz.");
        String kelime = scanner.next();

        int sayac = 0;


        for (int i=0; i<kelime.length(); i++){

            if (kelime.charAt(i) == 'c'){
                break;
            }

            if (kelime.charAt(i) == 'a'){
                sayac++;
            }

        }

        System.out.println(sayac);







    }
}
