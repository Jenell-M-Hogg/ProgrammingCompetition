import java.awt.Point;

public class Message {
	boolean isEmergency;
	String message; 
	Point sourcePosition; 
	int range;
	
	public Message(boolean isEmergency, String message, Point sourcePosition, int range){
		this.isEmergency = isEmergency;
		this.message = message; 
		this.sourcePosition = sourcePosition;
		this.range = range;
		
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
