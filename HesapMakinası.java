import java.util.Scanner;

public class HesapMakinası {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int select;
        String menu="1- Toplama işlemi\n"
                +"2- Çıkarma işlemi\n"
                +"3- Çarpma işlemi\n"
                +"4- Bölme işlemi\n"
                +"5- Üslü sayı hesaplama\n"
                +"6- Faktöriyel hesaplama\n"
                +"7- Mod alma\n"
                +"8- Dikdörtgen alan ve çevre hesabı\n"
                +"0- Çıkış yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz:");
            select=input.nextInt();

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }while(select!=0);
    }

    static void rectangle() {
        Scanner input=new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarı:");
        int kisa=input.nextInt();
        System.out.print("Dikdorgenin uzun kenarı:");
        int uzun=input.nextInt();

        System.out.println("Dikdörgenin Alanı:"+(kisa*uzun));
        System.out.println("Dikdörtgenin çevresi:"+2*(kisa+uzun));
    }

    static void mod() {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int s=input.nextInt();
        System.out.print("Hangi sayıya göre mod alınacak:");
        int n=input.nextInt();

        System.out.println("Sonuç:"+(s%n));
    }

    static void factorial() {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n=input.nextInt();
        int result=1;
        for (int i =1; i <=n ; i++) {
            result*=i;
        }
        System.out.println("Sonuç:"+result);
    }

    static void power() {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değeri");
        int base=input.nextInt();
        System.out.print("Üs değeri:");
        int exponent=input.nextInt();

        int result=1;
        for (int i = 1; i <exponent ; i++) {
            result*=base;
        }
        System.out.println("Sonuc:"+result);
    }

    static void plus() {
        Scanner input=new Scanner(System.in);
        int number, result=0, i=1;
        while (true){
            System.out.print(i++ +". sayı:");
            number=input.nextInt();
            if(number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Sonuc:"+result);
    }
    static void minus(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet gireceksiniz:");
        int count=input.nextInt();
        int num,result=0;
        for(int i=1;i<=count;i++){
            System.out.print(i+". sayı:");
            num=input.nextInt();
            if (i==1){
                result+=num;
                continue;
            }
            result-=num;
        }
        System.out.println("Sonuç:"+result);
    }
    static void times(){
        Scanner input=new Scanner(System.in);
        int num, result=1, i=1;
        while (true){
            System.out.print(i++ +".sayı:");
            num=input.nextInt();
            if (num==1){
                break;
            }
            if (num==0){
                result=0;
                break;
            }
            result*=num;
        }
        System.out.println("Sonuç:"+result);
    }
    static void divided(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        int counter=input.nextInt();
        double num, result=0.0;

        for (int i = 1; i <=counter ; i++) {
            System.out.print(i+". sayı:");
            num=input.nextDouble();
            if (i!=1 && num==0){
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i==1){
                result=num;
                continue;
            }
            result/=num;
        }
        System.out.println("Sonuç:"+result);
    }
}
