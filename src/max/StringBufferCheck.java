package max;

public class StringBufferCheck {
	public static void main(String[] args) {
		
		StringBuffer sb;
		long t = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
			new StringBuffer();
		}
		long t1 = System.currentTimeMillis();
		System.out.println("StringBuffer : "+" "+ (t1-t));
		
		StringBuilder sb1;
		long t2 = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
			new StringBuilder();
		}
		long t3 = System.currentTimeMillis();
		System.out.println("StringBuilder : "+" "+ (t3-t2));
	}
	
	

}
