package homeSystems;

public class Rooms {

	public static void main(String[] args) {
	}
		public static void chooseRoom(String roomName, String roomFunction){
			if(roomName.equalsIgnoreCase("master bathroom")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
			}
			else if(roomName.equalsIgnoreCase("master bedroom")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
			}
			else if(roomName.equalsIgnoreCase("downstairs bathroom")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
				
			}else if(roomName.equalsIgnoreCase("kitchen")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
				
			}else if(roomName.equalsIgnoreCase("living room")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
			
			}else if(roomName.equalsIgnoreCase("guest bedroom")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
				
			}else if(roomName.equalsIgnoreCase("front porch")){
				System.out.println("The light in the " + roomName + " is now " + roomFunction);
				
			}else if(roomName.equalsIgnoreCase("all rooms")){
				System.out.println("The lights in " + roomName + " are now " + roomFunction);	
					
			}else { //changed sysout
			System.out.println("Please try again say one of the following rooms: Master bathroom, "
					+ "master bedroom, downstairs bathroom, kitchen, living room, guest bedroom,"
					+ " front porch, or all rooms.");
		}
		}	
}


