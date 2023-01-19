import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Sayı giriniz:");
        int num=input.nextInt();
        if (isPalindrom(num)==true){
            System.out.println(num +" Palindrom sayıdır.");
        }else{
            System.out.println(num+" Palindrom sayı değildir.");
        }
    }
    static boolean isPalindrom(int num){
        int temp=num, reverseNum=0, lastNum;
        while (temp!=0){
            lastNum=temp%10;
            reverseNum=(reverseNum*10)+lastNum;
            temp/=10;
        }
        if (num==reverseNum){
            return true;
        }else{
            return false;
        }
    }
}
