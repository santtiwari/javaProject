package evenNumbr;

import java.util.Scanner;

public class checkVowelCons {
	
	private static void checkCharcters(char ch){
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			System.out.println("character is vowel :: "+ch);
		}else{
			System.out.println("character is constant :: "+ch);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character :: ");
		char c = sc.next().toLowerCase().charAt(0);
		checkVowelCons.checkCharcters(c);
	}

}
