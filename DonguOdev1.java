import java.util.Scanner;

public class DonguOdev1 {
    public static void main(String[] args) {
        int s, counter=0, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz:");
        s=input.nextInt();
        for (int i = 0; i <= s; i++) {
            if (i%3==0 && i%4==0){
                counter+=1;//i 0 olduğunda da counter 1 artıyor.
                sum+=i;
            }
        }
        int ort=sum/counter;
        System.out.println("3 ve 4 bolünen sayıların ortalaması:"+ort);
        System.out.println(counter);
        System.out.println(sum);

    }
}
