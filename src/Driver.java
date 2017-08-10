import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Driver {
	private static JFrame frame = new JFrame("Ada's Forest");
	private static Custom panel = new Custom();
	//STRING TIME?
	
	public static void main(String[] args) {
		
		try {
            BufferedImage bufferedImage = ImageIO.read(new File("icon.gif"));
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
		frame.setSize(800, 600); //sets the size of window
		frame.setResizable(false);
		frame.setVisible(true); //sets window visible
		
		Driver.load(Place.HOMESCREEN);
		frame.add(panel);
		frame.setVisible(true);
		
	}
	
	static void load(Place place){
		panel.clear();
		panel.addMouseListener(panel);
		
		if(place == Place.HOMESCREEN){
			try{
			BufferedImage homescreen = ImageIO.read(new File("homescreen.jpg"));
			panel.addImage(homescreen);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			JButton play = new JButton("Play");
			play.setPreferredSize(new Dimension(90, 40));
			play.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(play);
		}
		else if(place == Place.ADAFOREST1){
			try{
			BufferedImage adaforest1 = ImageIO.read(new File("adaforest1.jpg"));
			panel.addImage(adaforest1);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
			next.setPreferredSize(new Dimension(90, 40));
			next.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADAFOREST2);
				}
			});
			panel.addButton(next);
		}
		else if(place == Place.ADAFOREST2){
			try{
			BufferedImage adaforest2 = ImageIO.read(new File("adaforest2.jpg"));
			panel.addImage(adaforest2);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(back);
			JButton next = new JButton("Next");
			next.setPreferredSize(new Dimension(90, 40));
			next.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADAFOREST3);
				}
			});
			panel.addButton(next);
		}
		else if(place == Place.ADAFOREST3){
			try{
			BufferedImage adaforest2 = ImageIO.read(new File("adaforest3.jpg"));
			panel.addImage(adaforest2);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(back);
			JButton next = new JButton("Next");
			next.setPreferredSize(new Dimension(90, 40));
			next.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADASROOM);
				}
			});
			panel.addButton(next);
		}
		else if(place == Place.ADASROOM){
			try{
			BufferedImage adasroom = ImageIO.read(new File("adasroom.jpg"));
			panel.addImage(adasroom);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					Driver.load(Place.ADAFOREST3);
				}
			});
			panel.addButton(back);
			System.out.println("Click on the door to leave the room.");
			MouseCoords door = new MouseCoords(249, 221, 249 + 187, 600, Place.ADASHOUSEINTERIOR);
			panel.addMouseCoords(door);
		}
		else if(place == Place.ADASHOUSEINTERIOR){
			try{
			BufferedImage adashouseinterior = ImageIO.read(new File("adashouseinterior.jpg"));
			panel.addImage(adashouseinterior);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Click on the left door to go outside.");
			MouseCoords leftDoor = new MouseCoords(249, 221, 249 + 187, 600, Place.ADASHOUSEEXTERIOR);
			System.out.println("Click on the right door to go back upstairs.");
			MouseCoords rightDoor = new MouseCoords(249, 221, 249 + 187, 600, Place.ADASROOM);
			panel.addMouseCoords(leftDoor, rightDoor);
		}
	}

}