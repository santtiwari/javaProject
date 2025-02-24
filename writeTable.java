package evenNumbr;

import java.util.Scanner;

public class writeTable {
	private static void table(int n, int len){
		if(n>0){
			for(int i=1;i<=len;i++){
				System.out.println(n+" X "+i+" = "+n*i);
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the Number :: ");
		int num = sc.nextInt();
		System.out.println("Enter the length :: ");
		int l = sc.nextInt();
		writeTable.table(num, l);
	}
	
	

}
