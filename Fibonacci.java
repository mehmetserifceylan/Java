import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int fib, firstNum=0,secondNum=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Fibonacci serisinin " +
                "eleman sayısını giriniz:");
        fib=input.nextInt();
        for (int i = 0; i <= fib ; i++) {
            System.out.print(firstNum+" ");
            int nextNumber=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNumber;
        }
    }
}
