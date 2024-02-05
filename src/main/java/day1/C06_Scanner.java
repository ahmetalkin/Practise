package day1;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan kilosunu ve boyunu alın, vücut kitle endeksini bulun
        //kilo/(boy*boy)

        Scanner input = new Scanner(System.in);
        System.out.println("kilonuz");
        int kg = input.nextInt();
        System.out.println("boyunuz");
        double boy = input.nextDouble();

        double endeks = kg/(boy*boy);
        System.out.println("vücut kitle endeksi : " + endeks);

        if (endeks<15) {
            System.out.println("zayıfsınız");
        }   else if (endeks>33) {
                System.out.println("şişmansınz");
        }     else {
                    System.out.println("normal kilodasınız");

            }
            }
            }
