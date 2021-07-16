package company;

public class A4_Que_5 {
	
	static String firstLetter(String str) {
		
		String result = " ";
		boolean a = true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				a = true;
			}
			else if (str.charAt(i) !=- ' ' && a == true) {
				         result += (str.charAt(i));
				         a = false;	
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("The string is: ");
		String str = "Object Oriented Programming system";
		System.out.println(firstLetter(str));

	}

}
