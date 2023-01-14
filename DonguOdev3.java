import java.util.Scanner;

public class DonguOdev3 {
    public static void main(String[] args) {
        int s;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz:");
        s=input.nextInt();
        for (int i = 1, j=1; i < s && j<s; i*=4,j*=5) {
            System.out.println("4 ün kuvvetleri:"+i);
            System.out.println("5 in kuvvetleri:"+j);
        }
    }
}
