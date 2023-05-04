package passwordvalidation;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

	@Test
	public void isTheLengthOfThePasswordLongerOrEqualThanEight() {
		//given
		String pass= "12345678";
//		boolean expectedResult= true;
		//when
		boolean result=PasswortValidation.passwordLengthMinimumEight(pass);
		//then
		assertTrue(result);
	}
	
	@Test
	public void isTheLengthOfThePasswordShorterOrEqualThanEight() {
		//given
		String pass= "1234567";
		boolean expectedResult= false;
		//when
		boolean result=PasswortValidation.passwordLengthMinimumEight(pass);
		//then
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void doesThePassWordContainANumReturnTrue() {
		//given
		String pass= "123dfsw34 dfe";
		boolean expectedResult= true;
		//when
		boolean result=PasswortValidation.passwordContainNumbers(pass);
		//then
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void doesThePassWordContainSmallCharReturnTrue() {
		//given
		String pass= "123dfsw34 dfe";
		boolean expectedResult= true;
		//when
		boolean result=PasswortValidation.passwordContainSmallChar(pass);
		//then
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void doesThePassWordContainBigCharReturnTrue() {
		//given
		String pass= "123dfsw34B dfe";
		boolean expectedResult= true;
		//when
		boolean result=PasswortValidation.passwordContainBigChar(pass);
		//then
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void countsNumberOfNums() {
		//given
		String pass= "123dfsw34 dfe";
		int expectedResult= 5;
		//when
		int result=PasswortValidation.passwordNumCounter(pass);
		//then
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void checksIfFourFollowingCharThenFalse() {
		//given
		String pass= "123456789";
		boolean expectedResult= false;
		//when
		boolean result=PasswortValidation.passwordIsStrong(pass);
		//then
		assertEquals(expectedResult,result);
	}
	
	
	
	

}
