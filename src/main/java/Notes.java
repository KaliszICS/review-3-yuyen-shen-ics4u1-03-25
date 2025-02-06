
class Notes {
	public static void main(String[] args) {
		
		//characters

		char c;
		c = 'a'; //it uses single quotes not double quotes like String

		//StringVar.charAt(index)

		String word;
		word = "Hello";
		System.out.println(word.charAt(3));

		//indexes start at 0, end at 1 less than the length of the string


		//Errors and Exceptions

		//Syntax Error - Errors in "spelling and grammar" of code
		//Runtime Errors - Erors that happen due to a value
		//Logical Erorrs - Erorrs where your program has an unexpected result
	
		//Syntax Errors - Errors that happen during compliation, Your code does not run

		//Examples - Spelling mistakes, missing brackets, missing semi-colons, quotations etc.

		// in num;// int num
		//Look at the line number, and the error for information

		//Runtime Errors - Errors that are found during execution (after compiliation)

		//division by 0
		//wrong data types - scanners
		// System.out.println(8/0);
		//Read the exception and line number for information

		//Logical errors - unexpected results

		//similar variables, use the wrong one
		//wrong symbol/operator
		//order of operations
		//test to figure out the problem

		//Booleans

		//created using comparison
		// equals (==), not equals(!=), greater than (>), less than (<), greater than OR equals to(>=), less than OR equal to (<=)
		// Can be done on any primitive type except booleans

		System.out.println(7 > 5);
		System.out.println(7 < 5);

		System.out.println(5 > 5);

		System.out.println('a' < 'c');
		System.out.println('Z' > 'a');
		//Compared by ASCII values

		//compare NON-primitive types - String

		System.out.println("hello" == "bye"); //DO NOT DO THIS
		System.out.println("hello".equals("hello"));
		System.out.println(!"hello".equals("bye"));
	
		//AND OR and NOT

		//combining booleans
		// AND - &&, both booleans on either side must both be true
		//any other combination will result in false

		System.out.println(true && true); //1 * 1 = 1
		System.out.println(7 < 9 && 7 < 10);
		System.out.println(true && false); //1 * 0 = 0
		System.out.println(false && true); //1 * 0 = 0
		System.out.println(false && false); //0 * 0 = 0

		//OR - ||, one of the two booleans is true, the result is true
		//only false when both booleans are false

		System.out.println(true || true); //1 + 1 = 2
		System.out.println(true || false); //1 + 0 = 1
		System.out.println(false || true); //0 + 1 = 1
		System.out.println(false || false); //0 + 0 = 0

		//NOT - !, swaps the value of the boolean

		System.out.println(!true);
		System.out.println(!false);

		//ORDER OF OPERATIONS of booleans
		//NOT -> AND -> OR

		System.out.println(true || false && !true);
		//true || false && false
		//true || false
		//true

		//change the order, use brackets

		System.out.println(true || false && !true && false || true && !false && true);
		System.out.println(false || false && !true && false || true && !false && true || true);
	}
}
