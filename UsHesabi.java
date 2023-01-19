import java.util.Scanner;

public class UsHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değeri:");
        int base=input.nextInt();
        System.out.print("Üs değeri:");
        int exponent=input.nextInt();
        int result=square(base,exponent);
        System.out.println("Sonuç:"+result);
    }

    static int square(int base, int exponent) {
        if (exponent<1){
            return 1;
        }
        return square(base,exponent-1)*base;
    }
}
