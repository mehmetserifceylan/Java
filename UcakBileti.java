import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int year,distance,type;
        double total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:");
        year=input.nextInt();
        System.out.print("Lütfen mesafeyi giriniz");
        distance=input.nextInt();
        System.out.print("Lütfen yolculuk tipini giriniz(1-tek yön 2-gidiş dönüş):");
        type=input.nextInt();

        if ((year>0 && distance>0)&&(type==1 || type==2)){
            total=distance*0.10;
            if (year<12) total -= total / 2;
            else if(year>=12 && year<=24) total-=total*0.1;
            else if(year>=65) total-=total*0.3;
        }else {
            System.out.println("Hatalı veri girdiniz!");
        }
        if (type==2){
            total=(total*2);
            total-=total*0.2;
        }
        System.out.println("Toplam tutar="+total);

    }
}
