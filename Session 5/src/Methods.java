
public class Methods {
	
	static int f(int x, int y) {
		
		return (x*x + y*y + 2*x*y);
	}
	

	public static void main(String[] args) {
			
			//Methods refVar = new Methods();
			
			//int result = refVar.f(10, 20);
			
			//int result = Methods.f(10, 20);
			
			// f if marked as static and belongs to the same class, where main also resides
			// we can directly execute it also :)
			int result = f(10, 20);
			
			System.out.println("Result is: "+result);
			
	}

}
