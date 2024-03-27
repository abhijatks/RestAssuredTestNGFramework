package GetCredentials;
import java.util.Base64;


public class JavaUtils {

	
	public static Credentials base64Encode(final String username,final String password)
	{
		String cred = username + ":" + password;
		try {
			cred = Base64.getEncoder().encodeToString(cred.getBytes());
			System.out.println(cred);
			}catch(Exception e)
		{
		}
		Credentials loginCred = new Credentials();
		loginCred.setCredentials(cred);
		return loginCred;
		
	}
}
	
	
	
	
	
	
