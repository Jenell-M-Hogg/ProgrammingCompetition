import java.awt.Point;

public abstract class Transmitter {
	
	public abstract Message send(Message message);
	public abstract void receive(Message message); 
	
	public Point position = new Point(0,0);
	public int transmissionRange = 0;
	public String id = "";

	
	public abstract boolean messageInRange(Point sendingSourcePosition);
	
	

}
