
public class Availability {
	
	
	Calendar time;
	Calendar days;
	Boolean isAvailable = true;
	
	public Availability(Calendar time, Calendar days) {
		super();
		this.time = time;
		this.days = days;
	}
	
	Availability(){
			
		}
	
	public Calendar getDays() {
		return days;
	}
	public void setDays(Calendar days) {
		this.days = days;
	}
	public Calendar getTime() {
		return time;
	}
	public void setTime(Calendar time) {
		this.time = time;
	}
	
	

}
