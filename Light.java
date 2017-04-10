package homeSystems;
// deleted import my interfaces
import java.util.Scanner;
import homeSystems.Rooms;

public class Light  {
	private Scanner scan = new Scanner(System.in);
	public void lightFunction(String lightFunction){
		
		if(lightFunction.equalsIgnoreCase("on")){
			// asks what room to turn the light on / added rooms class
			System.out.println("Which room would you like to turn the light on in?");
			String room = scan.nextLine();
			Rooms.chooseRoom(room, lightFunction);
			
		}
		else if(lightFunction.equalsIgnoreCase("off")){
			System.out.println("Which room would you like to turn the light off in?");
			String room = scan.nextLine();
			Rooms.chooseRoom(room, lightFunction);
		}
		else { // dont need an invalid statement here bc its listed in the rooms class
			System.out.println("");
		}
		}
	}
	
	
	