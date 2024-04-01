
public class TestREx {
	public void m1() {
		System.out.println("enter the m1");
		m2();
		try{
			System.out.println(10/2);
		}catch(Error e) {
			System.out.println(e);
		}

		System.out.println("end the m1");
		
	}
	public void m2() {
		System.out.println("entered the m2");
		try{
			System.out.println(10/0);
		}catch(Throwable e) { //runtimeexception,exception,throwble,arithmetic exception
			System.out.println(e);
		}
		System.out.println("end the m2");
	}

	public static void main(String[] args) {
		System.out.println("enterded the main method");
		TestREx t=new TestREx();
		t.m1();
		System.out.println("ended the main method");

	}

}
