import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;

public class ViewController extends JFrame {

	private JPanel contentPane;
	int rows;
	int cols;
	GridLayout grid;
	private JPanel[][] panelHolder;

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewController frame = new ViewController(30,30);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. The rows and cols tell the program how big to draw the frame
	 */
	public ViewController(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		grid = new GridLayout(rows, rows, cols, cols);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(grid);
		


		panelHolder = new JPanel[rows][cols]; 
		//Initialize the grid
		for(int i = 0; i<rows ; i++){
			for(int j = 0; j<cols; j++){
				JPanel m = new JPanel();
				m.setBackground(Color.blue);
				panelHolder[i][j] = m;
			
			}
		}
		
		this.getContentPane().setLayout(new GridLayout(rows,cols));
	    	

		for(int m = 0; m < rows; m++) {
		   for(int n = 0; n < cols; n++) {
		      panelHolder[m][n] = new JPanel();
		      this.getContentPane().add(panelHolder[m][n]);
		   }
		}
		
		contentPane.repaint();
	}
	public void drawAll(ArrayList<Boat> boats, ArrayList<Buoy> buoys, ArrayList<Point> storms){
		
	}
	
	private boolean isInRange(Point p){
		if(p.getX() > rows | p.getX() < 0){
			return false;
		}
		else if(p.getY() > cols | p.getY() < 0){
			return false;
		}
		
		return true;
	}
	
	public void drawTransmitters(ArrayList<Transmitter> buoys){
		for(int i =0; i< buoys.size(); i++){
			Transmitter b = buoys.get(i);
			if(this.isInRange(b.position)){
				DrawableItem d = new DrawableItem(b.id, Color.RED);
				int row = (int) b.position.getX();
				int col = (int) b.position.getY();
				panelHolder[row][col] = d;
				
				
				
			}
		    
		}
		
		this.refresh();
		
	}

	private void refresh() {
		// TODO Auto-generated method stub
		this.getContentPane().removeAll();
		
		for(int i = 0; i<rows; i++){
			for(int j = 0; j< cols; j++){
				this.contentPane.add(panelHolder[i][j]);
			}
		}
		
		this.repaint();
		
	}
	
	
		
	
}
