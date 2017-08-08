import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Driver {
	
	public static JFrame frame;
	public static int count;
	private static BufferedImage iconImage;
	private static Place[] slides;
	private static HomeScreen homescreen;
	
	public static void main(String[] args){
		slides = new Place[60];
		
		try{
			iconImage = ImageIO.read(new File("icon.gif"));
		}
		 catch (Exception e) { // catch dat exception
				e.printStackTrace(); // idk what this does rly but just keep it
										// there
		}
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			
		}
		
		frame = new JFrame("Ada's Forest"); //TITLE
		frame.setIconImage(iconImage);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this closes the panel when I click the x
		frame.setSize(800, 600); //sets the size of window
		
		homescreen = new HomeScreen();
		
		frame.add(homescreen);
		frame.setVisible(true);
	}
	
	public static void removeAndAdd(){
		slides[count].setVisible(false);
		count ++;
		frame.add(slides[count]);
		frame.setVisible(true);
	}
	
	
}
	
