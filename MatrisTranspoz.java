import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoz {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Satır sayısı:");
		int n=input.nextInt();
		System.out.print("Sutun sayısı:");
		int m=input.nextInt();
		int[][] list=new int[n][m];
		int[][] list1=new int[m][n];
		
		for(int i=0; i<list.length;i++) {
			for(int j=0; j<list[i].length; j++) {
				list[i][j]=input.nextInt();
			}
		}
		for(int i=0; i<list.length;i++) {
			for(int j=0; j<list[i].length; j++) {
				list1[j][i]=list[i][j];
			}
		}
		
		
		
		
		
		
		for(int i=0; i<list1.length;i++) {
			for(int j=0; j<list1[i].length; j++) {
				System.out.print(list1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
