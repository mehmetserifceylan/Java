import java.util.Scanner;
import java.util.Arrays;


public class YakinSayi {

	public static void main(String[] args) {
		int[] list= {15,12,788,1,-1,-778,2,0};
		Scanner input=new Scanner(System.in);
		System.out.println("girilen sayı:");
		int n=input.nextInt();
		Arrays.sort(list);
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		for(int i=0; i<list.length; i++) {
			if(list[i]>n) {
				System.out.println("girilen sayıdan küçük en yakın sayı:"+list[i-1]);
				System.out.println("girilen sayıdan büyük en yakın sayı:"+list[i]);
				break;
				
			}
		}
	}

}
