package evenNumbr;

import java.util.Scanner;

public class findLargestNum {
	private static void findLargestnumbroutofThree(int n, int n1, int n2){
		if(n>0){
			if(n>n1 && n>n2){
				System.out.println("Largest Number is :: "+n);
			}else if(n1>n && n1>n2){
				System.out.println("Largest Number is ::"+n1);
			}else{
				System.out.println("Largest Nuber is ::"+n2);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number :: ");
		int n= sc.nextInt();
		System.out.println("Enter the second Number ::");
		int n2= sc.nextInt();
		System.out.println("Enter the third Number :: ");
		int n3= sc.nextInt();
		findLargestNum.findLargestnumbroutofThree(n, n2, n3);
	}

}
