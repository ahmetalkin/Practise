package day1;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın karesini bulun

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();
        System.out.println("karesi : " + sayi*sayi);


        // bir rakam giriniz ve 5 katını bulunuz

        Scanner veri = new Scanner(System.in);
        System.out.println("rakam giriniz");
        int rkm = veri.nextInt();
        System.out.println("rakamın 5 katı : " + 5*rkm);


    }
}
