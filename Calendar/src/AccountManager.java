
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

// 
public class AccountManager {
	
	private Scanner sc = new Scanner (System.in);
	private LinkedList<Account> accountsList= new LinkedList<>();
	ScheduleManager scheduleManager = new ScheduleManager();
	EmailCheck emailCheck ;
	Account account ;
	
	
	
	public void run() {
		 displayMenu();
		 
		 int answer = sc.nextInt();
		 
		 switch (answer) {
		 case 1: logIn();
		 break;
	 	 case 2: createAccount();
	 	 break;
	 	 case 3: resetPassword();
	 	 break;		
 		
		 } 
	}
	
	 public void displayMenu() {
	 System.out.println();
	 System.out.println("Press any number from the menu below to prosses through out the application.");
		 System.out.println("1.Log in.");
		 System.out.println("2.Create an account");
		 System.out.println("3.Reset password"); 
	 }
	 
	 
	 
	 
	 public void logIn() {
		 
		Scanner sr = new Scanner (System.in);
		System.out.println(" Enter email.");
		String email =  sr.next();
		
		//emailCheck.checkEmail(email);
		 
		System.out.println("Enter you password.");
		
		
		String password = sr.next();
		account = findByEmail(email);
		 
		if (account.getPassword().equals(password)) {
			viewAccountInfo(account);
		}	else {
			System.out.println("Email doesn't mach password, try again");
			run();
		}
	 }
	 
	 public void createAccount() {
		 System.out.print(" Enter your first name.\n");
		 String firstName = sc.next();
		 
		 System.out.print(" Enter your last name.\n");
		 String lastName = sc.next();
		 sc.nextLine();
		
		 System.out.print(" Enter your email.");
		 sc.nextLine();
			
		 String email= sc.next();
		 
		 
		//emailCheck.checkEmail(email);
		 System.out.print(" Enter your password.");
		 String password = sc.next();
		 
		 
		 account = new Account (firstName, lastName,email,password);
		 accountsList.add(account); 
		 viewAccountInfo(account);
	
	 }
	 
	 public void resetPassword() {
		 System.out.println("Enter you email.");
		 String email = sc.next();
		 
		 System.out.println("Enter your new password");
		 String newPassword = sc.next();
		 account = findByEmail(email);
		 account.resetPassword(newPassword);
		 
		 viewAccountInfo(account);
	 }		 
	 
	 
	  Account findByEmail(String email) {
		  return accountsList.stream().filter(account -> email.equals(account.getEmail())).findFirst().orElse(null);
	} 
	
	
	public void viewAccountInfo(Account user) {
		System.out.println(user.toString());
		scheduleManager.menu(user);
		
		
	}
}


