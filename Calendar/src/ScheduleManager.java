import java.util.Scanner;

public class ScheduleManager{
	AccountManager accountManager;
	Events event;
	Scanner sc = new Scanner(System.in);
	EventManager eventManager;
	
	
	
	ScheduleManager(){
		
	}
	
	
	public void menu(Account account) {
		System.out.println();
		System.out.println("Choose what do you want to do next: ");
		System.out.println("1.Create new event.");
		System.out.println("2.View existing events ");
		System.out.println("3.Change an event.");
		System.out.println("4.Create a time slot for a meeting");
		
		int answer = sc.nextInt();
		menuRunner(answer);
		
	}
	
	public void menuRunner(int answer) {
		switch(answer){
			
			case 1: createEvent();
			break;
			case 2: viewEvents();
			break;
			case 3: changeEvent();
			break;
			case 4:createTimeSlot();
			break;
		}
			
	}
	
	private void createTimeSlot() {
		// TODO Auto-generated method stub
		
	}


	private void changeEvent() {
		// TODO Auto-generated method stub
		
	}


	private void viewEvents() {
		// TODO Auto-generated method stub
		
	}


	public void createEvent() {

		eventManager.createSingleEvent();
	
	}
	
	
	
	
	
}
