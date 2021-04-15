import java.sql.Time;
import java.util.HashMap;

public class Schedule  {
	ScheduleManager scheduleManager;
	private Availability time;
	private HashMap<Time, Events> events = new HashMap<>();
	
	public Schedule() {
		
	}
	
	
	
	
	public HashMap<Time, Events> getEvents() {
		return events;
	}



	public void setEvents(HashMap<Time, Events> events) {
		this.events = events;
	}


	public Availability getTime() {
		return time;
	}



	public void setTime(Availability time) {
		this.time = time;
	}


	
	
	
	
	
	 public String toString() {
		 return "You don't have upcoming events yet.";
	 }
	 
	 
}
