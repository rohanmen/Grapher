import javax.swing.JFrame;


public class MainFrame extends JFrame {

	private GraphPanel graph;
	
	public MainFrame()
	{
		setup();
	}
	
	private void setup()
	{
		graph = new GraphPanel();
		add(graph);
		setTitle("Grapher");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void refreshGraph(Coordinate c)
	{
		graph.addData(c);
		graph.repaint();
	}
}
