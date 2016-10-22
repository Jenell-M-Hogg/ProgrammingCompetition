import java.awt.Point;

public class Boat extends Transmitter {
	public Point velocity;
	
	public Boat(Point position, Point velocity, String id){
		this.position = position;
		this.id = id;
		this.velocity = velocity; 
	}
	
	public void updatePosition(){
		
	}
	
	public void changeDirection(Point newVelocity){
		
	}

	@Override
	public void send(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean messageInRange(Point sendingSourcePosition) {
		// TODO Auto-generated method stub
		return false;
	}

}
