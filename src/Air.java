import java.util.ArrayList;


public class Air {

	private ArrayList <Message> allMessages;
	public ArrayList <Boat> boats;
	public ArrayList <Buoy> buoys;
	private int lockCutoff;

	
	public Air()
	{
		allMessages = new ArrayList <Message>();
		boats = new ArrayList <Boat>();
		boats = new ArrayList <Buoy>();
		allMessages = new ArrayList <Message>();
		lockCutoff = 0;
		
	}
	public Message [] localMessageNearMe(Transmitter t){
	}
	public void lockForCycle(){
		
	}
	public void unlockForCycle(){
		
	}
	private boolean canSeeMessage(Transmitter t, Message m){
		
	}
	public void sendMessage(Transmitter t, Message m){
		allMessages.add(m);
	}
}
