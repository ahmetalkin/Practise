package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        //kullanıcıdan kilosunu ve boyunu alın, vücut kitle endeksini bulun
        //kilo/(boy*boy)

        Scanner input = new Scanner(System.in);
        System.out.println("kilonuz");
        int kilo = input.nextInt();
        System.out.println("boyunuz");
        double boy = input.nextDouble();

        double endeks = kilo / (boy*boy) ;
        System.out.println("endeks : " + String.format("%.3f", endeks)); //ondalıklı sayılarda noktadan sonra kaç basamak olacağını
                                                                        //string format ile yaparız ve bu formülü kullanırız "%.3f"






    }
}
