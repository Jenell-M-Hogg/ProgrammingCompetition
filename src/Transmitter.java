import java.awt.Point;

public interface Transmitter {
	
	public abstract void send(Message message);
	public abstract void receive(); 
	
	public Point position = new Point(0,0);
	public int transmissionRange = 0;
	
	public boolean messageInRange(Point sendingSourcePosition);
	
	

}
