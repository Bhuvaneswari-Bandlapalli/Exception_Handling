
public class DefaultExceptionHandlar {
	public void m1() {
		m2();
		
	}
	public void m2() {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		DefaultExceptionHandlar deh=new DefaultExceptionHandlar();
		deh.m1();

	}

}
