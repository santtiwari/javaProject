package evenNumbr;

import java.util.Scanner;

public class swapNumbr {
	//Swap number without third variable
	private static void swapNumbrwithoutThird(int a, int b){
		
		if(a>0 && b>0){
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swap First Number is :: "+a+" "+"After Swap Second Nuber is :: "+b);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number :: ");
		int n=sc.nextInt();
		System.out.println("Enter the second Nuber :: ");
		int n1=sc.nextInt();
		swapNumbr.swapNumbrwithoutThird(n, n1);
	}

}
