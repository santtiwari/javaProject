package max;

import java.util.Scanner;

public class stringTest {
	
	private static void reverse(String s){
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
		System.out.println(c[i]);
		}
	}
	private static void reversestrng(String s){
		String st="";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			st=st+ch[i];
			
		}
		System.out.println(st);
		
	}
	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter the string :: ");
		//String s1 = sc.next();
		//stringTest.reverse("ram is good");
		stringTest.reversestrng("ram is good");
		
	}

}
