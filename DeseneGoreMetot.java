import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı girin:");
        int num=input.nextInt();
        int temp=num;
        metot(num,temp);
    }

    static void metot(int num,int temp) {
        System.out.print(num+" ");
        if (num>=0){
            num-=5;
            metot(num,temp);
        }else {
            metot2(num,temp);
        }

    }

    static void metot2(int num, int temp) {
        if (num<temp){
            num+=5;
            System.out.print(num+" ");
            metot2(num,temp);
        }
    }
}
