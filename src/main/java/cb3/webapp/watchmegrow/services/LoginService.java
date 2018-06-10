package cb3.webapp.watchmegrow.services;

public class LoginService {
	public boolean validateUser (String user) {
		return user.equalsIgnoreCase("kensley");
	}

}
