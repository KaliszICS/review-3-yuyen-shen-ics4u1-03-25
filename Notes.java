
class Notes {
	public static void main(String[] args) {
		//char

		char c;
		c = 'a';

		//String.charAt(index) - get a character from a string at the index.

		String word;
		word = "Hello World";
		System.out.println(word.charAt(5)); //Get the 6th character of the string

		c = word.charAt(0); //Store the first character of word in c.
		System.out.println(c);

		//errors and exceptions

		//Syntax errors - Grammar of coding

		//Crashes before executing

		//Spelling mistakes
		//Missing brackets, semi-colons any other symbols

		// system.out.println("Hello World");
		// System.out.println("Hello World")

		//Runtime errors - Errors that can happen sometimes and not other times
		//Happen during execution of the code.  Any code above still executes

		// int num = 5;
		// int num1 = 0;
		// System.out.println(num/num1);

		Scanner s = new Scanner(System.in);

		// s.nextInt(); //Input mismatch if something other than an int is given


		//Logical Errors - Program does something different than expected

		// Assign 2 to 2 different variables.  Add them together and output the result

		// int num2 = 2;
		// int num3 = 3;
		// System.out.println(num2 + num3);

		//booleans all comparisons, and, not, or, order of operations

		//comparison.  Comparing primitive types (can't be broken down)
		//  Equals(==), not equals(!=), greater than (>), less than (<), greater than equals to (>=) less than equals (<=)

		//Comparison must be done between the same data types

		System.out.println(5 < 7); //true
		System.out.println(7 < 5); //false

		//greater than and less than are not true when the values are equal

		System.out.println(5 < 5); //false

		//Comparing non-primitive types (for now Strings), use var.equals()

		System.out.println("hello".equals("Hello")); //false
		String word2;
		word2 = "Hello";
		System.out.println(word2.equals("Bye")); //false
		System.out.println(!word2.equals("Bye")); //true

		//AND NOT and OR

		//AND - &&, both booleans need to be true to resolve to a single true boolean
		//only true when both booleans were true

		System.out.println(true && true);//true

		//OR - || (captial \), Only needs at least 1 of the two booleans to be true
		//only false when both booleans are false

		System.out.println(true || false); //true

		//NOT - ! - swap the value of a boolean

		System.out.println(!true); //false

		//Order of operations of NOT AND OR.  Unless you use brackets to change the order

	}
}
