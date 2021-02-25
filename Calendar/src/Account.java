
public class Account extends User{
	// Name
	//Email
	
	private String title;
	Calendar calendar;
	private String calendarUserName;
	
	

	Account(String fullName, String email, String password) {
		super(fullName, email);
		this.password = password;
		calendar = new Calendar();
		calendarUserName = setCalendarUserName();
		
	}
	String password;
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
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
		String userName =this.title + this.getName(); /// 
		
		
		return userName;
	}



	

}
