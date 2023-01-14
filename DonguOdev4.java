import java.util.Scanner;

public class DonguOdev4 {
    public static void main(String[] args) {
        int n,r;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen n değerini girin:");
        n=input.nextInt();
        System.out.print("Lütfen r değerini girin:");
        r=input.nextInt();

        int fakn=1, fakr=1,fakn_r=1;

        for (int i = 1; i <=n ; i++) {
            fakn*=i;
        }
        for (int i = 1; i <=r ; i++) {
            fakr*=i;
        }
        for (int i = 1; i <=n-r ; i++) {
            fakn_r*=i;
        }
        System.out.println("C(n,r)="+fakn/(fakr*(fakn_r)));
    }
}
