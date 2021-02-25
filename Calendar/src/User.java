
public class User {
	private String name;
	private String email;
	
	User(String fullName, String email){
		this.name = fullName;
		setEmail(email);
		
				
	}
	
	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		} else 
			System.out.println("Wrong email, try again!");		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	

}
