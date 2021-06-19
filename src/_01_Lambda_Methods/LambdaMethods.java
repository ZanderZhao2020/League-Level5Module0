package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	static Random RandGen = new Random();
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage(S -> {
			for (int Loop = S.length() - 1; Loop > -1; Loop--) {
				System.out.print(S.charAt(Loop));
			}
			System.out.println();
		}, "Backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage(S -> {
			for (char C : S.toCharArray()) {
				if (RandGen.nextBoolean()) {
					System.out.print(Character.toUpperCase(C));
				} else {
					System.out.print(Character.toLowerCase(C));
				}
			}
			System.out.println();
		}, "UppercaseLowercase");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage(S -> {
			for (int Loop = 0; Loop < S.length() - 1; Loop++) {
				System.out.print(S.charAt(Loop) + ".");
			}
			System.out.println(S.charAt(S.length() - 1));
		}, "Period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage(S -> {
			String Str = S;
			char[] Vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
			for (char Vowel : Vowels) {
				Str = Str.replace(Character.toString(Vowel), "");
			}
			System.out.println(Str);
		}, "NoVowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
