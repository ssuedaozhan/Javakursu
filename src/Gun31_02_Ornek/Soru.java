package Gun31_02_Ornek;

public class Soru {
    enum Role{ ADMIN, MUDUR, SATIS, PERSONEL}
    enum Statu{AKTIF, PASIF }

    public static void main(String[] args) {
        User user1= new User("Sueda Ozhan",Role.PERSONEL,Statu.AKTIF);
        User user2= new User("Furkan Yildirim ",Role.MUDUR,Statu.AKTIF);
        User user3 = new User("Ayse Yildirim",Role.SATIS,Statu.PASIF);
        System.out.println("user3 = " + user3);
        System.out.println("user2 = " + user2);
        System.out.println("user1 = " + user1);
usersil(user1);
usersil(user2);
usersil(user3);
    }
    public static void usersil(User user){
        if (user.role==Role.ADMIN)
        {
            System.out.println(user.username+"Admin silinemez");
        }
    }
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız

    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim.

}
