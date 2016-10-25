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
		return (t.position.distance( m.sourcePosition ) < m.getRange());
	}

	
	public void getNewMessages()
	{
		allMessages.clear();
		ArrayList <Transmitter> allTransmitters = new ArrayList <Transmitter>();
		allTransmitters.addAll(boats);
		allTransmitters.addAll(buoys);
		for (int i = 0; i < allTransmitters.size(); i++ )
		{
			Message[] newMessages = allTransmitters.get(i).send();
			for (Message m : newMessages)
			{
				if (m != null) allMessages.add(m);
			}
		}
	}
	
	public void sendMessages()
	{
		ArrayList <Transmitter> allTransmitters = new ArrayList <Transmitter>();
		allTransmitters.addAll(boats);
		allTransmitters.addAll(buoys);
		for (int i = 0; i < allTransmitters.size(); i++ )
		{
			for (int j = 0; j < allMessages.size(); j++ )
			{
				if (canSeeMessage(allTransmitters.get(i), allMessages.get(j)))
				{
					allTransmitters.get(i).receive(allMessages.get(j));
				}
			}
		}
	}
}
