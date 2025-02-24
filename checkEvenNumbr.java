package evenNumbr;

import java.util.Scanner;

public class checkEvenNumbr {
	private static void chechkNuber(int n){
		if(n%2==0){
			System.out.println("EvenNumber "+n);
		}else{
			System.out.println("OddNumber "+n);
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered Number :: ");
		int n=sc.nextInt();
		checkEvenNumbr.chechkNuber(n);
		sc.close();
	}

}
