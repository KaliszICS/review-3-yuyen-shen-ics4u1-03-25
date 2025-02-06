import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String word = in.nextLine();
		System.out.println(word.charAt(0));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Boolean boba = in.nextBoolean();
		System.out.println(!boba);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num = in.nextInt();
		System.out.println(num > 5);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double dodo = in.nextDouble();
		System.out.println(-2 <= dodo && dodo <= 2);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String hello = in.nextLine();
		System.out.println(hello.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num1 = in.nextInt();
		System.out.print("In: ");
		int num2 = in.nextInt();
		System.out.println(num1 <= num2);
	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double bobo1 = in.nextDouble();
		System.out.print("In: ");
		double bobo2 = in.nextDouble();
		System.out.println(bobo1 > bobo2);
	}

}
