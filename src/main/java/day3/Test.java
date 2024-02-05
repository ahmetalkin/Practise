package day3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
/*

        - Kullanıcıdan pozitif tamsayılar isteyin.

        - 0 girdisi alındığında, döngüyü durdurun.

        - Döngü durdurulduğunda, toplam girilen sayı adedini ve sayıların toplamını print edin.

        - Kullanıcı negatif bir sayı girerse, bunun mümkün olmadığını belirtin.

        - Negatif sayı girilirse, bu sayıyı, sayı adedine veya toplama eklemeyin.

 */
        Scanner input = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;

        do {
            System.out.println("bir sayı giriniz");
            int s = input.nextInt();

            if (s<0){
                System.out.println("pozitif sayı giriniz");
            } if(s>0){
                sayac++;
                toplam = toplam + s;
                }
            if (s==0){
                break;
            }
             }  while(true);

        System.out.println("toplam " + toplam);
        System.out.println("sayac " + sayac);











    }
}
