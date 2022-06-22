/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, select;

        // İlk olarak kullanıcıdan girişleri alıyoruz. Eğer doğru ise program bitiyor. Yanlış ise şifre yenilemek isteyip istemediğini soruyoruz.

        System.out.println();
        System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
        userName = input.nextLine();
        System.out.print("Lutfen Sifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("\nGirisiniz Yapilmistir ! ");
        } else {
            System.out.println("\nKullanici Adiniz veya Sifreniz Yanlistir ! ");
            System.out.println("Sifrenizi Sifirlamak Istermisiniz ?");
            System.out.print("Evet veya Hayiri Tuslayiniz : ");
        }

        select = input.nextLine();

        // Eğer cevap evetse yeni şifreyi oluşturuyoruz. Hayırsa program bitiyor.

        switch (select) {
            case "Evet":
                System.out.print("\nLutfen Yeni Bir Sifre Belirleyiniz  : ");
                String newPass;
                newPass = input.nextLine();

                if (newPass.equals("java123")) {
                    System.out.println("\nYeni Sifre Bir Oncekiyle Ayni Olamaz ! ");
                } else {
                    System.out.println("\nYeni Sifreniz Basariyla Olusturulmustur ! ");
                }
                break;
            case "Hayir":
                System.out.println("\nGiris Sayfasina Yonlendiriliyorsunuz !");
                break;
        }
    }
}