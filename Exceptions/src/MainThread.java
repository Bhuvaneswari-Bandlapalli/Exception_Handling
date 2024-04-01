
public class MainThread {
	public void m1() {
		System.out.println("m1 method call start");
		m2();
		System.out.println("m1 method call end");
	}
	public void m2() {//stockoverFlow
		System.out.println("m2 method call start");
		m1();
		System.out.println("m2 method call end");
	}
	public static void main(String[] args) {
		System.out.println("thread starts:"+Thread.currentThread().getName());
		System.out.println("main method starts");
		MainThread main =new MainThread();
		main.m1();
		System.out.println("main method end");

	}

}
