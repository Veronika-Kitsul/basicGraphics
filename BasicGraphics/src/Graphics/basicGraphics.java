package Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

//extending JPanedl so we can have graphic options
public class basicGraphics extends JPanel 
{
	//final to not allow this window to change
	private final int width = 800, height = 600;
	int lineWidth = 30;
	int fontSize = 20;

	public basicGraphics() 
	{
		JFrame frame = new JFrame();
		
		//setting the size of the frame
		frame.setSize(width, height);
		
		//setting an option for pushing the close button -- always a good idea to use this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adding customized panel to the container
		frame.add(this);
		
		//center the window upon start
		frame.setLocationRelativeTo(null);
		
		//not allowing to resize the window
		frame.setResizable(false);
		
		//this is automatically set to false, and so we need to tell the computer to make your content and frame visible
		frame.setVisible(true);
		
		//decide whether you will need focus in your program.
		// focus is the ability for the program to pay attention 
		// to just one component - for example, if you have multiple 
		// text input boxes, we need to know which box to focus on at all times
		this.setFocusable(true);
		
		// get our functionality going (if we have any)
		run();
	}
		
		
		// This is what we want the code to do as the panel is open
		public void run() 
		{
			// note - I don't have anything besides graphics setup in this code, so my program won't actually 'do' anything.
			// If I wanted to 'do something', this is where I would do that
		}

		// defines how to paint our panel - this is called note that I never call this directly
		// If I want to update my original graphics display, I call repaint()
		public void paint(Graphics g) 
		{
			//I use fillRect(), not drawRect()
			g.setColor(new Color(192, 172,219));
			g.fillRect(0, 0, width, height);
			
			//green
			g.setColor(new Color(120,154,54));
			
			//so this is in the center of the screen - building three lines parallel to each other
			g.fillRect((width-lineWidth)/2, 0, lineWidth, (int) (height/1.5));
			
			//blue
			g.setColor(new Color(97,140,195));
			g.fillRect(((width-lineWidth)/2 - 2*lineWidth), 0, lineWidth, (int) (height/1.5));
			
			//yellow 
			g.setColor(new Color(255,230,8));
			g.fillRect(((width-lineWidth)/2 + 2*lineWidth), 0, lineWidth, (int) (height/1.5));
			
			//text
			g.setColor(Color.black);
			g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize)); 
			g.drawString("EVOLVE   EVOLVE   EVOLVE   EVOLVE   EVOLVE   EVOLVE   EVOLVE   EVOLVE   EVOLVE   EVOLVE", 0, (int)(height/1.5 + lineWidth));
			
			//another rectangle below
			g.setColor(Color.DARK_GRAY);
			g.fillRect((width-(width/3))/2, (int)(height/1.5 + 2*lineWidth), width/3, (int) (height-(height/1.5 + 2*lineWidth)));
			
			
		}
		
		
		
		// very simple main method - create our graphics object
		public static void main(String[] args) 
		{
			new basicGraphics(); 
		}
	
	
	
	
	
	
	
	
	
	

}
