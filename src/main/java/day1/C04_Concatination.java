package day1;

public class C04_Concatination {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Güzel";
        int sayı1 = 5;
        int sayı2 = 3;

        // Java5 yazdırmak için;

        System.out.println(str1 + sayı1);

        //Java8güzel yazdırmak için;
        System.out.println(str1 + (sayı2 + sayı1) + str2);

        //2güzel15 yazdırmak için;

        System.out.println((sayı1 - sayı2) + str2 + (sayı2 * sayı1));

        //Java22 yazdırmak için;
        //1.YOL:
        System.out.println(str1 + (sayı1 - sayı2) + (sayı1 - sayı2) );
        //2.YOL:
        System.out.println(str1 + (sayı1 * sayı1 - sayı2));

    }
}
