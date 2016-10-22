import java.util.*;
import java.awt.Point;

public class EventCreator {
	//Event coordinator.
	//Knows where the boats are. 
	
	//Knows where the buoys are. 
	
	//Tells boats what's going on
	

	Random rand = new Random();// randomness
	
	
	int  buoys = 3;//rand.nextInt(10) + 1; // rand 1 to 10
	int  boats = 1;//rand.nextInt(10) + 1; // rand 1 to 10
	
	
	
	ArrayList<Buoy> Buoy_array= new ArrayList<Buoy>();
	ArrayList<Boat> Boat_array= new ArrayList<Boat>();
	
	
	public EventCreator(){
		generateEvent(); // start a new simulation ( EVENT )  
	}

	
	public void generateEvent() {
		
		// starts with initiating stuff

		for ( int i = 0 ; i < buoys ; i++)
			{ 

			int  r_1_50_a = rand.nextInt(50) + 1; // rand 1 to 50
			int  r_1_50_b = rand.nextInt(50) + 1; // rand 1 to 50
			Point p1 = new Point(r_1_50_a,r_1_50_b) ; // rand point for position 
		
			Buoy_array.add( new Buoy(p1,String.valueOf(i)); // create a bouy 
			}
		
		
		for ( int i = 0 ; i < boats ; i++)
			{ 

			int  r_1_50_a = rand.nextInt(50) + 1; // rand 1 to 50
			int  r_1_50_b = rand.nextInt(50) + 1; // rand 1 to 50
			Point p1 = new Point(r_1_50_a,r_1_50_b) ; // rand point for position 
			Point p2 = new Point(v_x,v_y) ; // point for position 
			
			int v_x=3  , v_y = 3; // boats' velocities 
			
			Boat_array.add( new Boat(p1,p2,String.valueOf(i))); // create a boat
			
			}
		
		// call air 
		
		while ( 1==1)
		{
		
			// inifinte loop 
			// breaks with stop button from gui 
			
		}
		
	}
	
	
	
	
	
	
	
}
