package homeSystems;
import java.util.Scanner;

//deleted import my interfaces

public class Toaster  {
	private Scanner scan = new Scanner(System.in);
	
public  void ovenPower(String power){ // this is where (in each class) we add different input options
	if(power.equalsIgnoreCase("on")){
		System.out.println("low,medium or high?");
		String ovenLevel = scan.nextLine();
		setLevel(ovenLevel);
	}
	else if(power.equalsIgnoreCase("off")){
		System.out.println("Toster turned off");
	}
	else{
		System.out.println("Invalid input!");
	}
}
public  void setLevel(String function){
	if(function.equalsIgnoreCase("high")){
		System.out.println("Toaster has been set on high!");
	}
	else if(function.equalsIgnoreCase("medium")){
		System.out.println("Toaster has been set on medium!");
	}
	else if (function.equalsIgnoreCase("low")){
		System.out.println("Toaster has been set on low!");
	}
	else{
		System.out.println("Invalid input!");
	}
}

	
}


