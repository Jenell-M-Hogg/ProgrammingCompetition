import java.awt.Point;

public class Boat extends Transmitter {
	public Point velocity;
	
	public Boat(Point position, Point velocity, String id, int range){
		this.position = position;
		this.id = id;
		this.velocity = velocity;
		this.transmissionRange = range;
	}
	
	public void updatePosition(){
		this.position.move(velocity.x, velocity.y);
	}
	
	public void changeDirection(Point newVelocity){
		this.velocity = newVelocity; 
	}


	@Override
	public boolean messageInRange(Point sendingSourcePosition) {
		// TODO Auto-generated method stub
		return false;
	}

}
