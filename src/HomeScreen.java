
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class HomeScreen extends JPanel {

	private BufferedImage image;

	public HomeScreen() {
		JLabel title = new JLabel("Ada's Forest");
		JButton start = new JButton("Start Your Adventure");
		
		try{
			image = ImageIO.read(new File("homescreen.jpg")); //github comment
		}
		 catch (Exception e) { // catch dat exception
				e.printStackTrace(); // idk what this does rly but just keep it
										// there
		}
		repaint();

		super.add(title);

		start.addActionListener(new ActionListener() {
			@Override // following method is in the original superclass and you
						// are overriding it
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "START YOUR ADVENTURE!");
				title.setText("");
				start.hide();
			}

		});
		super.add(start); // this adds the button to the panel
	}

	public void paintComponent(Graphics g) { // so you can draw the images
		super.paintComponent(g); // just call the superclass

		// paint first image
		g.drawImage(image, 0, 0, null);
	}
}
