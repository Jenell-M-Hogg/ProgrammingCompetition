
public class Main {

	public static void main(String[] args){
		EventCreator k = new EventCreator();
		
		
		for (int i = 0; i < 10; i ++)
		{
			k.passTime();
			for (int j = 0; j < k.air.buoys.size(); j++ )
			{
				Buoy b = k.air.buoys.get(j);
				System.out.printf("Message for Buoy %d :\n", j);
				for (Message m : b.send()){
					if (m == null) continue;
					System.out.print(m.message);
					if (m.isEmergency) System.out.printf(" THIS IS AN EMERGENCY");
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
