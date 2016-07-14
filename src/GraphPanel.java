import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class GraphPanel extends JPanel{

	GQueue<Coordinate> points;
	
	int[] x;
	int[] y;
	
	public GraphPanel()
	{
		this.x = new int[0];
		this.y = new int[0];
		points = new GQueue<>(); 
	}
	
	public void set(int[] x, int[] y)
	{
		this.x = new int[x.length];
		this.y = new int[y.length];
		
		for(int i = 0; i < this.x.length; i++)
		{
			this.x[i] = x[i];
			this.y[i] = y[i];
		}
	}
	
	public void addData(Coordinate c)
	{
		points.addElem(c);
	}
	
	private void draw(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.BLACK);
		
		int radius = 5;
		for(int i = 0; i < x.length; i++)
		{
			g2d.drawOval(x[i], y[i], radius, radius);
		}
		
		for(int i = 0; i < x.length - 1; i++)
		{
			g2d.drawLine(x[i], y[i], x[i+1], y[i+1]);
		}
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		draw(g);
	}
	
}
