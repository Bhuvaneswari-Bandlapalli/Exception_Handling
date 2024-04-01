
public class NestedCT {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}catch(Exception e) {
			System.out.println(e);
			try {
				System.out.println(10/0);
				
			}catch(Exception e1) {
				System.out.println(e1);
			}finally{
				System.out.println("inner finnaly close");
			}
		}finally {
			System.out.println("oute finnaly block");
		}

	}

}
