import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz:");
        heat=input.nextInt();
       /* if (heat<5){
            System.out.print("kayak yapabilirsiniz:");
        } else if (heat>=5 && heat<=25) {
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat>=10){
                System.out.println("pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }*/
        if (heat<5){
            System.out.print("kayak yapabilirsiniz:");
        }
        else if (heat>=5 && heat<=10){
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (heat>10 && heat<=15) {
            System.out.println("pikniğe gidebilirsiniz.");
            System.out.println("Sinemaya gidebilirsiniz");
        }else if (heat>15 && heat<=25){
            System.out.println("pikniğe gidebilirsiniz");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}