
public class DEHOne {
	public void m1() {
		m2();
	}
	public void m2() {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		DEHOne o=new DEHOne();
		try {
			o.m1();
		}catch(Exception e) {
			System.out.println("main");
			//System.out.println(e);//e.tostring() give same
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
