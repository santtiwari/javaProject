package evenNumbr;

import java.util.Scanner;

public class checkNumbr {
	private static void chckNumbrPrime(int n){
		boolean flag=false;
		if(n>0 &&n>1){
			for(int i=2;i<=n/2;i++){
				if(n%i ==0){
					flag=true;
				}
			}
			if(flag!=true){
				System.out.println("Prime Number...");
			}else{
				System.out.println("Not Prime Number...");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :: ");
		int num=sc.nextInt();
		checkNumbr.chckNumbrPrime(num);
	}

}
