
public class Driver {
	
	/*
	public static void main(String[] args)
	{
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		
		while(true)
		{
			int[] x = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
			int[] y = new int[x.length];
			
			for(int i = 0; i < y.length; i++)
			{
				y[i] = (int)(Math.random() * 150);
			}
			
			mainFrame.refreshGraph(x, y);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	*/
	
	public static void main(String[] args)
	{
		GQueue<String> g = new GQueue<>();
		g.addElem("hi");
		g.addElem("my");
		g.addElem("name");
		g.addElem("is");
		g.addElem("rohan");
		
		while(g.hasNext())
		{
			System.out.println(g.getNext());
		}
		System.out.println();
		
		g.addElem("what");
		
		while(g.hasNext())
		{
			System.out.println(g.getNext());
		}
	}

}
