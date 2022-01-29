package test;

public class ReverseExample {

	public static void main(String[] args) {

		int intArray[];
		String str = "Clean India Green India";
		String revStr = "";

		for (int index = str.length() - 1; index >= 0; index--) {
			revStr = revStr + str.charAt(index);
		}
		
		System.out.println(revStr);
		
		String vowels="";
		for(int index=0; index<revStr.length(); index++) {
			char ch = revStr.charAt(index);
			if(ch == 'a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
				vowels=vowels+ch;
			}
		}
		System.out.println("Vowels word is ---> "+vowels);
	}
}
