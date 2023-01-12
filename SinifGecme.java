import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;
        double toplam=0;
        System.out.print("Matematik Notu: ");
        matematik=input.nextInt();
        if (matematik>=0&&matematik<=100) toplam += matematik;
        System.out.print("Fizik Notu: ");
        fizik=input.nextInt();
        if (fizik>=0 &&fizik<=100) toplam+=fizik;
        System.out.print("Türkçe Notu: ");
        turkce=input.nextInt();
        if (turkce>=0 &&turkce<=100) toplam+=turkce;
        System.out.print("Kimya Notu: ");
        kimya=input.nextInt();
        if (kimya>=0 &&kimya<=100) toplam+=kimya;
        System.out.print("Müzik Notu: ");
        muzik=input.nextInt();
        if (muzik>=0 &&muzik<=100) toplam+=muzik;
        double gecmeNotu =toplam/5;
        if (gecmeNotu>=55){
            System.out.println("Başarıyla geçtiniz: "+gecmeNotu);
        }else System.out.println("Kaldınız: "+gecmeNotu);
    }
}