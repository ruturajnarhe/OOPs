package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
		try {
		j = 18 / i;
		}
		
		catch (Exception e) {
			System.out.println("Somethimg went wromg..");
		}
		
		System.out.println(j);
		System.out.println("Bye..");
	}

}





