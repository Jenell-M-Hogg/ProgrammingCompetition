import java.util.*;
import java.awt.Point;

public class EventCreator {
	//Event coordinator.
	//Knows where the boats are. 
	
	//Knows where the buoys are. 
	
	//Tells boats what's going on
	

	Random rand = new Random();// randomness
	
	Air air = new Air(); 
	int  buoys = 3;//rand.nextInt(10) + 1; // rand 1 to 10
	int  boats = 1;//rand.nextInt(10) + 1; // rand 1 to 10
	long bigrand = rand.nextInt(90)*30 + 100;
	int ev_c = 0 ; // events counter
	
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
		
			air.buoys.add( new Buoy(String.valueOf(i),10,p1)) ; // create a bouy 
			}
		
		
		for ( int i = 0 ; i < boats ; i++)
			{ 

			int  r_1_50_a = rand.nextInt(50) + 1; // rand 1 to 50
			int  r_1_50_b = rand.nextInt(50) + 1; // rand 1 to 50
			Point p1 = new Point(r_1_50_a,r_1_50_b) ; // rand point for position 
			Point p2 = new Point(v_x,v_y) ; // point for position 
			
			int v_x=3  , v_y = 3; // boats' velocities 
			
			air.boats.add( new Boat(p1,p2,String.valueOf(i),5) ); // create a boat
			
			}
		
		
		while ( ev_c < bigrand ) // runs bigrand number of storms 
		{ ev_c++ ; // events counter 
		
		Point p1 = new Point(rand.nextInt(50)+1,rand.nextInt(50)+1) ; // rand point for position 
		Message strm = new Message(true, "storm", p1, 25); // storm in some random place 
		
		Message hurr = new Message(true, "hurricane", p1, 50); // storm in some random place 
		
		
		
		Message msg = rand.nextInt(2)==1 ? strm : hurr; // randomly selct strm or hurr   
		
		for ( int i = 0 ; i< air.boats.size(); i++)
		
			if (  5 > Math.sqrt( Math.pow( (p1.getX()-air.boats.get(i).position.getX()),2)+
		
				                     Math.pow((p1.getY()-air.boats.get(i).position.getY()),2)))
			air.boats.get(i).messages[0]= msg; // boats in range get msg 
		
		for ( int i = 0 ; i< air.buoys.size(); i++)
			
			if (  5 > Math.sqrt( Math.pow( (p1.getX()-air.buoys.get(i).position.getX()),2)+
					                     Math.pow((p1.getY()-air.buoys.get(i).position.getY()),2)))
				air.buoys.get(i).messages[0]= msg; // buoys in rng get msg 
				
			
		 // inifinte loop 
			// breaks with stop button from gui 
		
		
		
		}
		
	}
	
	
	
	
	
	
	
}
