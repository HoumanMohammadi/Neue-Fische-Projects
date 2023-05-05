package passwordvalidation;

public class PasswortValidation {
	
	public static boolean passwordLengthMinimumEight (String pass) {
		
		return pass.length()>=8;

	}
	
	public static boolean passwordContainNumbers (String pass) {
		
		
		boolean hasNum= pass.matches(".*[0-9].*");
		
		return hasNum;
	}
	
	public static boolean passwordContainSmallChar(String pass) {
			
		return pass.matches(".*[a-z].*");
		
	}
	
	public static boolean passwordContainBigChar(String pass) {
		
		return pass.matches(".*[A-Z].*");
		
	}
	
	public static boolean passwordIsStrong(String pass) {
		
		int counter=0;
		
		for (int i=0; i< pass.length()-1; i++) {
//			if(pass.length()<)
			char nextChar = (char) (pass.charAt(0)+i);
//			System.out.println(pass.charAt(i)+1);
//			System.out.println(nextChar);
			if(pass.charAt(i)==nextChar) {
				counter+=1;
			}
			}
		if(counter<=4) {
			return true;
		}
		else return false;
	}

		

	
	public static int passwordNumCounter (String pass) {
		
		int NumCount=0;
		for(int i=0; i<pass.length(); i++) {
			char c=pass.charAt(i);
			if (Character.isDigit(c)) {
				NumCount+=1;
			}			
		}
		return NumCount;
	}
	
	public static void main (String[] args) {
		
		System.out.println(passwordIsStrong("abcdefg"));
		
	}
			

}
