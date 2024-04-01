
public class CatchBlock {
	public void m1(){
		
	try {
		String v=null;
		//System.out.println(v.length());
		System.out.println(10/0);
	}catch(Exception | Error e) {
		System.out.println("ex");
		System.out.println(e);
	}
   
}
	 public void m2() {
		 try {
				String v=null;
				System.out.println(v.length());
				System.out.println(10/0);
			}catch(NullPointerException e) {
				System.out.println("ex");
				System.out.println(e);
			}catch(ArithmeticException ex) {
				System.out.println("ex");
				System.out.println(ex);
			}catch(Exception ex) {
				System.out.println("ex");
				System.out.println(ex);
			}
		 
	    }
	 public void m3() {
		 try {
				String v=null;
				//System.out.println(v.length());
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("ex");
				System.out.println(e);
			}
//		 catch(ArithmeticException ex) {
//				System.out.println("ex");
//				System.out.println(ex);
//			}catch(Exception ex) {
//				System.out.println("ex");
//				System.out.println(ex);
//			}
	 }
		
	public static void main(String[] args) {
		CatchBlock c=new CatchBlock();
		c.m1();
		c.m2();
		c.m3();
				
	}
}
