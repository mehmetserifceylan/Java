import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        int price;
        while(right>0){
            System.out.print("Kullanıcı Adı:");
            userName=input.nextLine();
            System.out.print("Parolanız:");
            password=input.nextLine();
            if (userName.equals("Patika")&&password.equals("dev123")){
                System.out.println("Merhaba, MSC bankasına hoşgeldiniz :)");
                do {
                    System.out.println("1-para yatırma\n" +
                            "2-para çekme\n" +
                            "3-bakiye sorgula\n" +
                            "4-çıkış yap");
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz.");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("yatırmak istediğiniz para miktarı:");
                            price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("çekmek istediğiniz miktar:");
                            price=input.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye yetersiz.");
                            }
                            else {
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:"+balance);
                            break;
                        case 4:
                            System.out.println("Çıkış Yapılıyor...");
                            break;
                    }
                }while (select!=4);
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else {
                    System.out.println("Kalan hakkınız:"+right);
                }
            }
        }
    }
}
