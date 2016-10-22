import java.util.ArrayList;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;


public class Air {

	private ArrayList <Message> allMessages;
	public ArrayList <Boat> boats;
	public ArrayList <Buoy> buoys;
	private int lockCutoff;

	
	public Air()
	{
		allMessages = new ArrayList <Message>();
		this.boats = new ArrayList <Boat>();
		this.buoys = new ArrayList <Buoy>();
		allMessages = new ArrayList <Message>();
		lockCutoff = 0;
	}
	
	private boolean canSeeMessage(Transmitter t, Message m){
		
	}

	
	public void getNewMessages()
	{
		allMessages.clear();
		for (int i = 0; i < buoys.length; i++ )
		{
			allMessages.add(buoys[i]);
		}
		for (int i = 0; i < boats.length; i++ )
		{
			allMessages.add(boats[i]);
		}
	}
	
	public void sendMessages()
	{
		for (int i = 0; i < buoys.length; i++ )
		{
			
		}
	}
}
