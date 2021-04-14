
/**
 * @author Olya
 *
 */
public class Account {
	private String name;
	private String email;	
	private String password;
	private String title;
	Calendar calendar;
	Schedule schedule;
	private String calendarUserName;
	
	

	Account(String fullName, String email, String password) {
		this.name = fullName;
		this.email = email;
		this.password = password;
		calendar = new Calendar();
		calendarUserName = setCalendarUserName();
		schedule= new Schedule();
		
	}
	
	public String getPassword() {
		return password;
	}



	public void resetPassword(String password) {
		this.password = password;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getCalendar() {
		return calendar;
	}



	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}



	public String getCalendarUserName() {
		return calendarUserName;
	}



	public String setCalendarUserName() {
		String userName =this.title + this.name; /// 
		
		
		return userName;
	}
	
	public String toString() {
		return "User name :"+ name+ "\n "
			+ " user email :"+ email+ "\n "
			+ " Calendar user ID: "+ calendarUserName +"\n "
			+ " User schedule: "+ schedule.toString();
		
	}



	

}
