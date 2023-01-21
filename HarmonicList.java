import java.util.Scanner;

public class HarmonicList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Dizi boyutu:");
		int n=input.nextInt();
		int[] dizi=new int[n];
		
		for(int i=0; i<dizi.length; i++) {
			dizi[i]=input.nextInt();
			
		}
		double sum=0.0;
		for(int i=0; i<dizi.length; i++) {
			System.out.println(dizi[i]);
			sum+=(1.0/dizi[i]);
		}
		System.out.println("Harmonik ortlama:"+dizi.length/sum);
		
		

	}

}
