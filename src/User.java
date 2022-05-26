import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, secim;

        System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
        userName = input.nextLine();
        System.out.print("Lutfen Sifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Girisiniz Yapilmistir ! ");
        } else {
            System.out.println("Kullanici Adiniz veya Sifreniz Yanlistir ! ");
            System.out.println("Sifrenizi Sifirlamak Istermisiniz ?");
            System.out.print("Evet veya Hayiri Tuslayiniz : ");
        }

        secim = input.nextLine();

        switch (secim) {
            case "Evet" -> {
                System.out.print("Lutfen Yeni Bir Sifre Belirleyiniz  : ");
                String newPass;
                newPass = input.nextLine();

                if (newPass.equals("java123")) {
                    System.out.print("Yeni Sifre Bir Oncekiyle Ayni Olamaz ! ");
                } else {
                    System.out.print("Yeni Sifreniz Basariyla Olusturulmustur ! ");
                }
            }
            case "Hayir" -> System.out.print("Giris Sayfasina Yonlendiriliyorsunuz !");
        }
    }
}

