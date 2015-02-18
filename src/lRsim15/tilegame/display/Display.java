package lRsim15.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height, scale;
	
	public Display(String title, int width, int height,int scale){
		this.title = title;
		this.width = width;
		this.height = height;
		this.scale = scale;
		
		createDisplay();
	}
	
	private void createDisplay(){
		frame = new JFrame(title);
		frame.setSize(width*scale, height*scale);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width*scale, height*scale));
		canvas.setMaximumSize(new Dimension(width*scale, height*scale));
		canvas.setMinimumSize(new Dimension(width*scale, height*scale));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
	}

	public Canvas getCanvas(){
		return canvas;
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	
	
	
}
