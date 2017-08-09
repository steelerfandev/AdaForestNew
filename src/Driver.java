import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Driver {
	
	public static JFrame frame;
	public static int count = 0;
	private static BufferedImage iconImage;
	private static Place[] slides;
	private static HomeScreen homescreen;
	private static Place place0, place1, place2, place3, place4, place5, place6, place7, place8, place9, place10, place11, place12, place13, place14, place15, place16, place17, place18, place19, place20, place21, place22, place23, place24, place25;
	private static ImageInfo ii;
	
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
		
		
		ii = new ImageInfo();
		
		//playing in room
		ii.setImageName("adaForest1");
		JButton next = new JButton("Next");
		place0 = new Place(ii, 0, 0, 0, 0, 0, 0, 0, 0, 0, next);
		slides[0] = place0;
		//ada!
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//talks to mom
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//leaves room
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//inside of house
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//outside of house
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//forest
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//sick tree
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//inside of house
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town 2
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//inside of lib
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//inside of lib
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//book
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//book
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//book
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//book
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//book
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//library
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//library
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//library
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//library
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town1
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town2
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//grocery
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town 1
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town 1
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//adasforest
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//adasforest
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//dump
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//dump
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//dump
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town1
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//school
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town1
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//town hall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//build that wall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//come see
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//standing at wall
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//adastree
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//youwin
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//youwin
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
	}
	
	public static void removeAndAdd(){
		slides[count].setVisible(false);
		count ++;
		frame.add(slides[count]);
		slides[count].setVisible(true);
	}
	
	public static void removeAndGoBack(){
		slides[count].setVisible(false);
		count --;
		frame.add(slides[count]);
		slides[count].setVisible(true);
	}
	
	
}
	
