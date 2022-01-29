package test;

public class SwitchExample {

	public static void main(String[] args) {

		String str = "Clean India Green India";
		str = str.toLowerCase();
		int vowelCount = 0;

		for (int index = 0; index < str.length(); index++) {

			char temp = str.charAt(index);
			switch (temp) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;

			default:
				System.out.println("Inside default as the char is " + temp);// like else condition of if statement
			}
		}

		System.out.println("The vowel count is " + vowelCount);
	}

}
