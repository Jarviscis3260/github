package homeSystems;
import java.util.Scanner;
//deleted import my interfaces

public class SecurityCamera{ 
private Scanner scan = new Scanner(System.in);

	public void cameraFunction(String functionCamera){
		if(functionCamera.equalsIgnoreCase("take a snapshot")){
			System.out.println("Snapshot taken");
			// need method for taking snapshot
			
		}
		else if(functionCamera.equalsIgnoreCase("display live video")){
			System.out.println("Displaying live video");
			// need method for displaying video
			
		}
		else if (functionCamera.equalsIgnoreCase("send footage")){
			System.out.println("Who would you like to send footage to?");
			String recipient = scan.nextLine();
			// need method for sending footage
	
		}else{
			System.out.println("Please try again and choose one of the following: "
					+ "take a snapshot, display live video, or send footage");
			
		}
	}
		
	}


