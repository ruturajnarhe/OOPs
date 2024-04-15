package Exception;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 0;
		
		try {
			j = 18 / i;
			if (j == 0) 
				throw new RuturajException ("I dont want to print zero");
		}
		catch(RuturajException e){
			j = 18 / 1;
			System.out.println("Thats the default output " + e);
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println(j);
		System.out.println("Bye..");
	} 

}

class RuturajException extends Exception {
	public RuturajException (String string) {
		super(string);
	}
}
