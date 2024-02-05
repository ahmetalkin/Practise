package day3;

import java.util.Scanner;

public class C05_DoWhileLoops {
    public static void main(String[] args) {

        /*

        - Kullanıcıdan pozitif tamsayılar isteyin.

        - 0 girdisi alındığında, döngüyü durdurun.

        - Döngü durdurulduğunda, toplam girilen sayı adedini ve sayıların toplamını print edin.

        - Kullanıcı negatif bir sayı girerse, bunun mümkün olmadığını belirtin.

        - Negatif sayı girilirse, bu sayıyı, sayı adedine veya toplama eklemeyin.

 */

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;

        do {

            System.out.println("bir sayı giriniz");
            int sayi = input.nextInt();

            if (sayi<0){
                System.out.println("pozitif sayi giriniz");
            }
            else if (sayi==0) {
                break;
            }
            else  {
                toplam=toplam+sayi;
                sayac++;
            }
        }
            while (true);

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " +sayac);




        }
}
