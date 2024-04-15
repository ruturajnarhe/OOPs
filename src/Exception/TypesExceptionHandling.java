package Exception;

public class TypesExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 0;
		
		int [] nums = new int [5];
		String str = null;
		
		try {
			j = 18/ i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			System.out.println(str.length());
		}
			catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero" );
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in your limits");
		}
		catch (NullPointerException e) {
			System.out.println("String is empty");
		}
		catch (Exception e) {
			System.out.println("Something went wrong" + e);
		}

		
		System.out.println(j);
		System.out.println("Bye..");
	}

}
