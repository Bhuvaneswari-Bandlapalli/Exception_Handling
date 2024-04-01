
public class ExitFinnally {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}finally {//finally won't print...because above exit code has happen
			System.out.println("finnaly block");
		}

	}

}
