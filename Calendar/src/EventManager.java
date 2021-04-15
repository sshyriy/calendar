import java.util.Scanner;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;



public class EventManager extends Schedule {
	Events event ;
	Scanner sc;
	
	
	public void setDuration(Duration duration) {
		// take any anount of time of Duration subclass
	}
	
	public void createSingleEvent() { // or might need to return EVENT
		System.out.println("Enter the name of the event you are initiating.");
		String eventName = sc.nextLine();
		
		System.out.println("Enter the date and time of the event with  da.");
		
	/*int month=sc.nextInt();
		int hour = sc.nextInt();
		int minute=sc.nextInt();
		
		LocalDateTime eventDate = new LocalDateTime.of (month, hour, minute)
				
				
		event = new Events(eventName,eventDate,location,description);*/
		
		
	}


}
