import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int secim;

        System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
        userName = input.nextLine();
        System.out.print("Lutfen Sifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Girisiniz Yapilmistir ! ");
        } else {
            System.out.println("Kullanici Adiniz veya Sifreniz Yanlistir ! ");
            System.out.print("Sifrenizi Sifirlamak Istermisiniz ? \nCevabiniz Evet ise 1'i Hayir ise 2'yi Tuslayiniz : ");
        }

        secim = input.nextInt();

        String newPass;
        input.nextLine();

        switch (secim) {
            case 1:
                System.out.print("Lutfen Yeni Bir Sifre Belirleyiniz : ");
                newPass = input.nextLine();

                if (newPass.equals("java123")) {
                    System.out.print("Yeni Sifre Bir Oncekiyle Ayni Olamaz ! ");
                } else {
                    System.out.print("Yeni Sifreniz Basariyla Olusturulmustur ! ");
                }
                break;

            case 2:
                System.out.print("Giris Sayfasina Yonlendiriliyorsunuz !");
                break;
        }
    }
}

