package day2;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {

        /*
        Kullanıcıdan iki sayı isteyin,
            - Sayıların ikisi de pozitif ise sayıların toplamını yazdırın.
            - İkisi de negatif ise sayıların çarpımını yazdırın.
            - İkisi farklı işaretlere sahip ise sayılarla işlem yapılamadığını yazdırın.
            - Sayılarda sıfıra eşit olan var ise yutan eleman yazdırın.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int sayi1 = input.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = input.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);

        } else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);

        } else if ((sayi1<0 && sayi2>0)  || (sayi1>0 && sayi2<0) ) {
            System.out.println("işlem yapılamaz");
            //sayi1*sayi2<0 diyerekde yapabilirdik, daha kısa ve güzel olurdu

        }  else {
            System.out.println("yutan eleman");

        }



    }
}
