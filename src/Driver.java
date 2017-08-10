import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Driver {
	private static JFrame frame = new JFrame("Swing Demo");
	private static Custom panel = new Custom();
	//STRING TIME?
	
	public static void main(String[] args) {
		
		try {
            BufferedImage bufferedImage = ImageIO.read(new File("icon.jpg"));
            frame.setIconImage(bufferedImage);
        } 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this closes the panel when I click the x
		frame.setSize(1000, 700); //sets the size of window
		frame.setVisible(true); //sets window visible
		
		frame.add(panel);
		frame.setVisible(true);
		
	}
	
	static void load(Place place){
		panel.clear();
		
	}

}