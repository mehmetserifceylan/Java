import java.util.Scanner;

public class DonguOdev2 {
    public static void main(String[] args) {
        int s;
        int total=0;

        Scanner input=new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz:");
            s=input.nextInt();
            if (s%2==0 && s%4==0){
                total+=s;
            }
        }while (s%2==0);
        System.out.println("Toplam:"+total);
    }
}
