import java.util.*;
import java.awt.Point;

public class EventCreator {
	//Event coordinator.
	//Knows where the boats are. 
	
	//Knows where the buoys are. 
	
	//Tells boats what's going on
	

	
	
	int buoys= 3, boats = 2;
	ArrayList<Buoy> Buoy_array;
	ArrayList<Boat> Boat_array; 
	
	public EventCreator(){
		generateEvent(); 
	}

	public void generateEvent() {
		
		// starts with initiating stuff

		for ( int i = 0 ; i < buoys ; i++)
			{ 
			Buoy_array.add( new Buoy()); // create a bouy 
			
			}
		for ( int i = 0 ; i < boats ; i++)
		{ 
		Boat_array.add( new Boat()); // create a bouy 
		
		}
	}
	
	
	
	
	
	
	
}
