import java.awt.Point;
/**
 * 
 * @author Jenell
 *
 */
public abstract class Transmitter {
	public Message[] messages = new Message[3];
	
	public Message[] send(){
		return messages;
	}

	public  void receive(Message message){
			
			int i;
			if(message.isEmergency){
				i=0;
			}
			else if(message.isMaintenance()){
				i=1;
			}
			else{
				i=2;
			}
			
			messages[i] = message;

		}

	
	
	public Point position = new Point(0,0);
	public int transmissionRange = 0;
	public String id = "";

	
	public abstract boolean messageInRange(Point sendingSourcePosition);
	
	

}
