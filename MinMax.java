import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n=input.nextInt();
        int i=1;
        int min=0,max=0,temp=0;
        while (i<=n){
            System.out.println(i+". Sayıyı giriniz.");
            temp=input.nextInt();
            if (temp<min){
                min=temp;
            }if(temp>max){
                max=temp;
            }
            i++;
        }
        System.out.println("En küçük sayı:"+min);
        System.out.println("En büyük sayı:"+max);
    }
}
