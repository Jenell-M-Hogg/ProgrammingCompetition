import java.awt.Point;

public abstract class Transmitter {
	
	public abstract void send(Message message);
	public abstract void receive(); 
	
	public Point position = new Point(0,0);
	public int transmissionRange = 0;
	public String id = "";

	
	public abstract boolean messageInRange(Point sendingSourcePosition);
	
	

}
