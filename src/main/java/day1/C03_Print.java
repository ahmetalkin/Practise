package day1;

public class C03_Print {
    public static void main(String[] args) {

        String isim = "Ali";
        String soyisim = "XYZ";
        byte yas = 18;
        double boy = 1.80;
        double kilo = 80.5;

        //Yukaridaki degiskenleri tek bir println kullanarak, alt alta yazdirin.

        System.out.println("Isim: "+ isim );
        System.out.println("Soyisim :"+ soyisim );
        System.out.println("yas : " + yas);
        System.out.println("Boy: "+ boy);
        System.out.println("kilo : " + kilo); // bu uzun yöntem

        System.out.println("************************");

        System.out.println("İsim: " + isim + "\nsoyisim: " + soyisim + "\nYaş: " + yas + "\nKilo: " + kilo);
        // yeni satıra geçmek için \n ile yapılır(new line)


    }
}
