import java.awt.Point;

public class Buoy extends Transmitter {
	boolean needsMaintenance = false;
	

	public Buoy(String id, int range, Point position){
		this.id = id; 
		this.transmissionRange = range;
		this.position = position;
		this.messages = super.messages;
		
	}
	
	public void breakDown(){
		needsMaintenance = true;
	}
	
	public void repair(){
		needsMaintenance = false;
	}



	@Override
	public boolean messageInRange(Point sendingSourcePosition) {
		// TODO Auto-generated method stub
		return false;
	}

}
