import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class DrawableItem extends JPanel {

	/**
	 * Create the panel.
	 */
	public DrawableItem(String id, Color c) {
		JLabel l = new JLabel(id);
		this.add(l);
		this.setBackground(c);;
		

	}

}
