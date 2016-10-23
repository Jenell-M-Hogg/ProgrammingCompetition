import java.util.ArrayList;



public class Air {

	private ArrayList <Message> allMessages;
	public ArrayList <Boat> boats;
	public ArrayList <Buoy> buoys;

	
	public Air()
	{
		allMessages = new ArrayList <Message>();
		this.boats = new ArrayList <Boat>();
		this.buoys = new ArrayList <Buoy>();
		allMessages = new ArrayList <Message>();
	}
	
	private boolean canSeeMessage(Transmitter t, Message m){
		return true;
	}

	
	public void getNewMessages()
	{
		allMessages.clear();
		for (int i = 0; i < buoys.size(); i++ )
		{
			allMessages.add(buoys.get(i).send());
		}
		for (int i = 0; i < boats.size(); i++ )
		{
			allMessages.add(boats.get(i).send());
		}
	}
	
	public void sendMessages()
	{
		for (int i = 0; i < buoys.size(); i++ )
		{
			allMessages.add(buoys.get(i).receive());
		}
		for (int i = 0; i < buoys.size(); i++ )
		{
			allMessages.add(buoys.get(i).receive());
		}
	}
}
