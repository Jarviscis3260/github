package homeSystems;
//deleted import my interfaces

public class GarageDoors{
	public static void functionDoor(String doorFunction){
		if(doorFunction.equalsIgnoreCase("open")|| doorFunction.equalsIgnoreCase("close")){
			System.out.println("Left door or right door? Or both doors?"); 
			// changed form which door to left or right side? or garage door
		}
		
	}
	// changed sysouts below
	public static void chooseDoor(String doorName, String doorFunction){
		if(doorName.equalsIgnoreCase("left door")){
			System.out.println(doorName +" is now " + doorFunction);
		}
		else if(doorName.equalsIgnoreCase("right door")){
			System.out.println(doorName +" is now " + doorFunction);
		}
		else if(doorName.equalsIgnoreCase("both doors")){
			System.out.println(doorName + " are now " + doorFunction);
		
		}else { //changed sysout
		System.out.println("Please try again and either say 'left door' or 'right door' or 'both doors'");
	}
	}
}
