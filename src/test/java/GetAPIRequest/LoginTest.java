package GetAPIRequest;

import org.testng.annotations.Test;

import GetCredentials.Credentials;
import GetCredentials.JavaUtils;

public class LoginTest {
	@Test
	public void loginTest()
	{
		Credentials loginCred = JavaUtils.base64Encode("Abhijat Sharma", "Password");
		System.out.println(loginCred);
		
		
	}
	
	
	
	}


