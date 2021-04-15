
public class EmailCheck {
	public boolean checkEmail(String email) {
		if (email.contains("@")) {
			return true;
			
		}else {
			System.out.println("Invalide email, try again.");
			return false;
		}
	}

}
