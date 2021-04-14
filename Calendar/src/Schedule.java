import java.sql.Time;
import java.util.HashMap;

public class Schedule  {
	ScheduleManager schMan;
	
	public Schedule() {
		
	}
	private HashMap<Time, Events> events = new HashMap<>();
	private Availability time;
	
	
	
	
	
	 public String toString() {
		 return "You don't have upcoming events yet.";
	 }
	 
	 
}
