
public class NestedTC {

	public static void main(String[] args) {
		try {
			System.out.println(10/2);
			try {
				System.out.println(10/0);
			}catch(Error e) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
