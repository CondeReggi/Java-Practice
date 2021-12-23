import java.util.Arrays;

public class Second {

	/*
	 * Complete the function that accepts a string parameter, and reverses each word
	 * in the string. All spaces in the string should be retained.
	 */

	public static String reverseWords(final String original) {
		String[] arr = original.split(" ");

		if (arr.length == 0) {
			return original;
		}

		String resultado = "";

		for (String word : arr) {
			StringBuilder input = new StringBuilder();
			resultado += input.append(word).reverse().toString() + " ";
		}

		return resultado.trim();
	}

	/*
	 * A square of squares You like building blocks. You especially like building
	 * blocks that are squares. And what you even like more, is to arrange them into
	 * a square of square building blocks!
	 * 
	 * However, sometimes, you can't arrange them into a square. Instead, you end up
	 * with an ordinary rectangle! Those blasted things! If you just had a way to
	 * know, whether you're currently working in vain… Wait! That's it! You just
	 * have to check if your number of building blocks is a perfect square.
	 */

	public static boolean isSquare(int n) {

		if (n < 0) {
			return false;
		}

		Double raiz = Math.sqrt(n);

		if (raiz % 1 == 0) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * You are going to be given a word. Your job is to return the middle character
	 * of the word. If the word's length is odd, return the middle character. If the
	 * word's length is even, return the middle 2 characters.
	 */

	public static String getMiddle(String word) {
		int largo = word.length();

		if (largo % 2 != 0) { // Es impar
			int medio = Math.round(largo / 2);
			return word.substring(medio, medio + 1);
		} else {
			return word.substring(largo / 2 - 1, largo / 2 + 1);
		}

	}

	// OR

	public static String getMiddle2(String word) {
		int length = word.length();
		return (length % 2 != 0) ? String.valueOf(word.charAt(length / 2))
				: word.substring(length / 2 - 1, length / 2 + 1);
	}

	/*
	 * Simple, given a string of words, return the length of the shortest word(s).
	 * String will never be empty and you do not need to account for different data
	 * types.
	 */

	public static int findShort(String s) {
		String[] arr = s.split(" ");
		String minimo = arr[0];

		for (String word : arr) {
			if (minimo.length() > word.length()) {
				minimo = word;
			}
		}

		return minimo.length();
	}

	/*
	 * Complete the solution so that the function will break up camel casing, using
	 * a space between words.
	 * 
	 * Example "camelCasing" => "camel Casing" "identifier" => "identifier" "" => ""
	 */

	public static String camelCase(String input) {
		String cadena = "";

		if (input.length() == 0) {
			return input;
		}

		for (String word : input.split("")) {
			if (Character.isUpperCase(word.charAt(0))) {
				cadena += " " + word;
			} else {
				cadena += word;
			}
		}

		return cadena;
	}

	// OR

	public static String camelCase2(String input) {
		return input.replaceAll("([A-Z])", " $1"); // Java tiene replaceAll
	}

	/*
	 * Return the number (count) of vowels in the given string.
	 * 
	 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
	 */

	// Utilizando import java.util.Arrays;

	public static int getCount(String str) {
		int vowelsCount = 0;

		String[] arr = { "a", "e", "i", "o", "u" };

		for (String word : str.split("")) {
			if (Arrays.asList(arr).contains(word)) {
				vowelsCount++;
			}
		}

		return vowelsCount;
	}

	// OR

	public static int getCount2(String str) {
		return str.replaceAll("[^aeiou]", "").length(); // Remplazar todas menos las aeiou por un vacio y le saco el
														// length
	}

	/*
	 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain
	 * anything but exactly 4 digits or exactly 6 digits.
	 * 
	 * If the function is passed a valid PIN string, return true, else return false.
	 */

	public static boolean validatePin(String pin) {
		if (pin.length() == 4 || pin.length() == 6) {
			int copia = pin.replaceAll("([0-9])", "").length();

			return copia == 0;
		} else {
			return false;
		}
	}

	// OR

	public static boolean validatePin(String pin) {
		return pin.matches("[0-9]{4}|[0-9]{6}");
	}

	/*
	 * Complete the method/function so that it converts dash/underscore delimited
	 * words into camel casing. The first word within the output should be
	 * capitalized only if the original word was capitalized (known as Upper Camel
	 * Case, also often referred to as Pascal case).
	 */

	static String toCamelCase(String s) {

		String resultado = "";

		StringBuilder result = new StringBuilder();

		String[] arr = s.split("-|_");

		for (int i = 0; i < arr.length; i++) {
			String auxiliar;

			if (i != 0) {
				auxiliar = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1, arr[i].length());
			} else {
				auxiliar = arr[i].substring(0, arr[i].length());
			}

			result.append(auxiliar);
		}

		resultado = result.toString();
		return resultado;
	}
	
	

	public static void main(String[] args) {

		System.out.println(5 << 12 == 5 * Math.pow(2, 12));

		System.out.println(5 >> 2); // Si el resultado de a / 2^b --> a >> b es negativo return 0 sino return trunc
									// del numero

		System.out.println(5 | 11);

		String s = "the_Stealth-Warrior";

		System.out.println(String.valueOf(s.split("-|_")[0].charAt(0)).toUpperCase() + "Hola");

		StringBuilder sb = new StringBuilder();
		sb.append("This is a sentence.");
		sb.append("This is a sentence.");

		System.out.println(sb);

	}

}
