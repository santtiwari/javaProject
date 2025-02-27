package max;

import java.util.Random;

public class User {
	final String adhar;
	User(){
		adhar=genrateRandom();
	}
	
	public User genrateAdhar(int age){
		if(age<18 || age>=60){
			System.out.println("Age should be greater than 18 and less than 60");
			return null;
		}else{
			return new User();
		}
		
		
	}
	private String genrateRandom(){
		String str="";
		for(int i=0;i<=9;i++){
			str=str+new Random().nextInt(10);
		}
		return str;
	}
	public String toString(){
		System.out.println("toString");
		return adhar;
		
	}
	
	public static void main(String[] args) {
		User u= new User();
		User result = u.genrateAdhar(18);
		System.out.println(result);
	}
	

}
