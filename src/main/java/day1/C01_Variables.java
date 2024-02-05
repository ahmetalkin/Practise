package day1;

public class C01_Variables {
    public static void main(String[] args) {

        //bir yaş variable'i oluştur ve yazdır

        byte age = 18
                ;
        System.out.println(age);  // 18    //18 yazar ama kullanıcı ne olduğunu anlamayabilir
        System.out.println("yas = " + age); //yas = 18 // age i biz yazarak 18 in ne olduğunu belirtebiliriz
        System.out.println("yas = " +                   age); //yas = 18 //boşluklar tırnak içinde değilse java bunu algılayamaz
        System.out.println("yas =           " + age);  // yas =           18
        System.out.println("age = " + age);  // age = 18      //soutv ile yazarsak parantaz içini otomatik bu şekilde yazar
                                             //soutv de variable ve değerini alır yazdırır


        //bir benimYasim variable ı oluşturun, mevcut yas değişkenini atayın
        //dinamik kode denir buna amacı variable değiştin mi otomatik diğer kodlarda da değişmesini sağlamak
        int benimYasim = age;
        System.out.println("benimYasim = " + benimYasim);


        //bir isim variable ı oluştur ve yazdır
        String name = "Ali" ; //string de değişken tırnak içinde yazılır
        System.out.println(name);  //ali

        // bir benimIsmim değişkeni oluştur ve mevcut isim değişkenini ata
        String benimIsmim = name ;
        System.out.println("benimIsmim = " + benimIsmim);  //benimIsmim = Ali

        name = "Veli";
        System.out.println("benimIsmim = " + name);  //benimIsmim = Veli
        System.out.println("benimIsmim = " + benimIsmim);  //benimIsmim = Ali



    }
}
