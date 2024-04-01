import java.io.FileNotFoundException;

public class TestTrows {
	public void m1() throws FileNotFoundException{
		System.out.println("hi");
	}
	public void m2() throws ArithmeticException{
		System.out.println("hello");
	}
	public void m3() throws ClassNotFoundException{
		System.out.println("oi");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		TestTrows tt=new TestTrows();	
		try {
			tt.m1();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	  tt.m2();
	  tt.m3();
	}
}
