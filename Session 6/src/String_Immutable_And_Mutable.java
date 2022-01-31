
public class String_Immutable_And_Mutable {

	public static void main(String[] args) {
//IMMUTABLE-->
		// Strings are Immutable
		// We cannot change the String, once it is created in the memory
		String quote = "be exceptional";
		
		System.out.println("quote is: "+quote);
		
		// Whenever a String manipulation is done
		// old String will not be modified
		// we will get a new String in the memory
		String upperCaseQuote = quote.toUpperCase();

		System.out.println("quote now is: "+quote);
		System.out.println("upperCaseQuote now is: "+upperCaseQuote);
		
		// here we are updating the reference variable to refer to the new Upper Case String
		// hence, the old lower case String will go dangling
		// i.e. String literal resides in the memory with no reference variable referring to it
		// quote = quote.toUpperCase(); -> not a good practice as per above explanation
		
		String names = "john, jennie, jim, jack, joe";
		System.out.println("names is: "+names);
		String replacedNames = names.replace('j', 'k');
		System.out.println("name now is: "+names);
		System.out.println("replacedNames is: "+replacedNames);
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
//MUTABLE-->
		
		String str = new String("John");
		String name = str + " Watson"; //str.concat(" Watson");
		System.out.println("str is: "+str);
		System.out.println("name is: "+name);
		
		// Mutable Strings: StringBuffer and StringBuilder
		
		//StringBuffer buffer = "John"; // error
		// Is a bit slower as it is thread-safe
		StringBuffer buffer = new StringBuffer("John");
		buffer.append(" Watson");
		System.out.println("buffer is: "+buffer);
		
		// A bit more faster and not thread-safe
		StringBuilder builder = new StringBuilder("Fionna");
		builder.append(" Flynn");
		System.out.println("builder is: "+builder);

	}

}
