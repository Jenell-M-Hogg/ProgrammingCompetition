
public class Main {

	public static void main(String[] args){
		EventCreator k = new EventCreator();
		
		
		for (int i = 0; i < 10; i ++)
		{
			k.passTime();
			for (int j = 0; j < k.air.buoys.size(); j++ )
			{
				Buoy b = k.air.buoys.get(j);
				System.out.printf("Message for Buoy %i :\n");
				for (Message m : b.send()){
					System.out.printf(m.message);
					if (m.isEmergency) System.out.printf("THIS IS AN EMERGENCY");
					System.out.println();
				}
			}
		}
	}

}
