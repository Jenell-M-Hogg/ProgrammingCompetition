import java.awt.Point;

public class Message {
	boolean isEmergency;
	
	String message; // A message for printing- conveys information
	
	String id; //A unique identifier for the identifier
	
	Point sourcePosition; //The source origin of the message
	
	int range; //A transmission range- how far the message can go
	
	//The original origin point 
	int timesSent=0;
	//Number of times the message has been sent. Should be reset
	
	public Message(boolean isEmergency, String message, Point sourcePosition, int range){
		this.isEmergency = isEmergency;
		this.message = this.generateMessage(message, sourcePosition);
		this.sourcePosition = sourcePosition;
		this.range = range;
		
	}
	
	public void pass(Point newSource){
		this.sourcePosition = newSource;
		this.timesSent = 0;
		
	}
	
	private String generateMessage(String event, Point source){
		//TODO
		return null;
	}
	
	
	
	

	public boolean isEmergency() {
		return isEmergency;
	}

	public void setEmergency(boolean isEmergency) {
		this.isEmergency = isEmergency;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Point getSourcePosition() {
		return sourcePosition;
	}

	public void setSourcePosition(Point sourcePosition) {
		this.sourcePosition = sourcePosition;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
}
	
	
	


