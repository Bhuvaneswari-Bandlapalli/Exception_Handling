
public class AbnormalTermination {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}catch(Error e) {
			System.out.println(e);
			try {
				System.out.println(10/2);
			}catch(Exception e1) {
				System.out.println(e1);
			}
		
		}finally {
			System.out.println("close all");

	}

}
}
