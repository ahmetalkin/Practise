package day3;

import java.util.Scanner;

public class C04_WhileLoops {
    public static void main(String[] args) {

        /*

        - Kullanıcıdan bir sayı girdisi isteyin.

        - Girilen sayıdan başlayarak, 10'un katına gelene kadar ardışık şekilde sayıları yazdırın.

        22

        22, 23, 24, 25, 26, 27, 28, 29

 */

        int sayi = 22;

        while (sayi%10 != 0){
            System.out.print(sayi+" ");
            sayi++;
        }

        // 2. yol

       /*
       Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();
        int a = sayi%10;

        do {
            System.out.println(sayi);
            sayi++;
            a++;
        } while (a<10);              */













    }
}
