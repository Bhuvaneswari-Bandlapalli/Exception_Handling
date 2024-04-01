
public class OuterFinalTC {

	public static void main(String[] args) {
		try {
			System.out.println("hiiii");
		}finally{
			System.out.println("in final");
		}try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("hello");
		}
         System.out.println("hello bhuvana");
	}

}
