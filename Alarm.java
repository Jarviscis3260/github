package homeSystems;
//deleted import my interfaces

public class Alarm 
{
	
	
	public static void setAlarm( String function){
		if(function.equalsIgnoreCase("enable")){
			System.out.println("Alarm has been enabled!");
		}
		else if(function.equalsIgnoreCase("disable")){
			System.out.println("Alarm has been disabled!");
		
		}else {
			System.out.println("Please try again and either say 'enable' or 'disable'");
		}
		
		}
	}

