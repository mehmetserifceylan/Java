import java.util.Scanner;

public class RecAsalSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı girin:");
        int num=input.nextInt();
        if (asalMi(num,2)){
            System.out.println(num+" Asal sayıdır.");
        }
        else{
            System.out.println(num+" Asal sayı değildir.");
        }
    }

    static boolean asalMi(int num, int i) {
        if (num<=2){
            return (num==2);
        }
        if (num%i==0){
            return false;
        }
        if (i*i>num){
            return true;
        }
        return asalMi(num,i+1);
    }
}
